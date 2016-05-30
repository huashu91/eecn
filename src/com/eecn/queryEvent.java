package com.eecn;

import java.util.Vector;
import java.sql.*;

public class queryEvent {
	public int element;
	ADO ado = null;
	public Vector<String> id = new Vector<String>();
	public Vector<String> name = new Vector<String>();
	public Vector<String> host = new Vector<String>();
	public Vector<String> time = new Vector<String>();
	public Vector<String> other = new Vector<String>();
	
	public queryEvent() {
		this.cls();
		ado = new ADO("root", "123321", "testsport");
		element = 0;
		String sql = "SELECT * FROM event";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.host.add(ret.getString(3));
					this.time.add(ret.getString(4));
					this.other.add(ret.getString(5));
					element++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void queryByName(String name) {
		this.cls();
		String sql = "SELECT * FROM game WHERE name = '" + name + "'";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.host.add(ret.getString(3));
					this.time.add(ret.getString(4));
					this.other.add(ret.getString(5));
					element++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void queryByHost(String host) {
		this.cls();
		String sql = "SELECT * FROM game WHERE host = '" + host + "'";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.host.add(ret.getString(3));
					this.time.add(ret.getString(4));
					this.other.add(ret.getString(5));
					element++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void cls() {
		this.id.clear();
		this.name.clear();
		this.host.clear();
		this.time.clear();
		this.other.clear();
		element = 0;
	}
}