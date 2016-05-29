package com.eecn;

import java.sql.*;

public class ADO {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet ret = null;
	String url = null;
	String name = "com.mysql.jdbc.Driver";
	String sql = null;
	String username = null;
	String password =null;
	
	public ADO(String admin, String password, String database) {
		url = "jdbc:mysql://127.0.0.1/" + database;
		this.username = admin;
		this.password = password;
	}
	
	public PreparedStatement getPst(String sql) {
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, username, password);
			pst = conn.prepareStatement(sql);
			return pst;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ResultSet getRet(String sql) {
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, username, password);
			pst = conn.prepareStatement(sql);
			ret = pst.executeQuery();
			return ret;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void close() {
		try {
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
