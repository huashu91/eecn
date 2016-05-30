package com.eecn;

import java.util.Vector;
import java.sql.*;

public class queryGame {
	public int element;
	ADO ado = null;
	public Vector<String> id = new Vector<String>();
	public Vector<String> name = new Vector<String>();
	public Vector<String> group1 = new Vector<String>();
	public Vector<String> group2 = new Vector<String>();
	public Vector<String> status = new Vector<String>();
	public Vector<String> other = new Vector<String>();
	
	public queryGame() {
		this.cls();
		ado = new ADO("root", "123321", "testsport");
		element = 0;
		String sql = "SELECT * FROM game";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.group1.add(ret.getString(3));
					this.group2.add(ret.getString(4));
					this.status.add(ret.getString(5));
					this.other.add(ret.getString(6));
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
					this.group1.add(ret.getString(3));
					this.group2.add(ret.getString(4));
					this.status.add(ret.getString(5));
					this.other.add(ret.getString(6));
					element++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void queryByGroup1(String group1) {
		this.cls();
		String sql = "SELECT * FROM game WHERE group1 = '" + group1 + "'";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.group1.add(ret.getString(3));
					this.group2.add(ret.getString(4));
					this.status.add(ret.getString(5));
					this.other.add(ret.getString(6));
					element++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void queryByGroup2(String group2) {
		this.cls();
		String sql = "SELECT * FROM game WHERE group2 = '" + group2 + "'";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.group1.add(ret.getString(3));
					this.group2.add(ret.getString(4));
					this.status.add(ret.getString(5));
					this.other.add(ret.getString(6));
					element++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void queryByGrade(String status) {
		this.cls();
		String sql = "SELECT * FROM game WHERE status = '" + status + "'";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.group1.add(ret.getString(3));
					this.group2.add(ret.getString(4));
					this.status.add(ret.getString(5));
					this.other.add(ret.getString(6));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void cls() {
		this.id.clear();
		this.name.clear();
		this.group1.clear();
		this.group2.clear();
		this.status.clear();
		this.other.clear();
		element = 0;
	}
}