package com.eecn;

import java.util.Vector;
import java.sql.*;

public class queryGame {
	int element;
	ADO ado = null;
	Vector<String> id = new Vector<String>();
	Vector<String> name = new Vector<String>();
	Vector<String> group1 = new Vector<String>();
	Vector<String> group2 = new Vector<String>();
	Vector<String> status = new Vector<String>();
	Vector<String> other = new Vector<String>();
	
	public queryGame() {
		ado = new ADO("root", "123321", "testsport");
		element = 0;
	}
	
	public void queryByName(String name) {
		String sql = "SELECT * FROM student WHERE name = '" + name + "'";
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
		String sql = "SELECT * FROM student WHERE group1 = '" + group1 + "'";
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
		String sql = "SELECT * FROM student WHERE group2 = '" + group2 + "'";
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
		String sql = "SELECT * FROM student WHERE status = '" + status + "'";
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