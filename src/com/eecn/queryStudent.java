package com.eecn;

import java.util.Vector;
import java.sql.*;

public class queryStudent {
	int element;
	ADO ado = null;
	Vector<String> id = new Vector<String>();
	Vector<String> name = new Vector<String>();
	Vector<String> gender = new Vector<String>();
	Vector<String> grade = new Vector<String>();
	Vector<String> classs = new Vector<String>();
	Vector<String> idcard = new Vector<String>();
	Vector<String> school = new Vector<String>();
	Vector<String> other = new Vector<String>();
	
	public queryStudent() {
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
					this.gender.add(ret.getString(3));
					this.grade.add(ret.getString(4));
					this.classs.add(ret.getString(5));
					this.idcard.add(ret.getString(6));
					this.school.add(ret.getString(7));
					this.other.add(ret.getString(8));
					element++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void queryByGender(String gender) {
		String sql = "SELECT * FROM student WHERE gender = '" + gender + "'";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.gender.add(ret.getString(3));
					this.grade.add(ret.getString(4));
					this.classs.add(ret.getString(5));
					this.idcard.add(ret.getString(6));
					this.school.add(ret.getString(7));
					this.other.add(ret.getString(8));
					element++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void queryByGrade(String grade) {
		String sql = "SELECT * FROM student WHERE grade = '" + grade + "'";
		ResultSet ret = ado.getRet(sql);
		if(ret != null) {
			try {
				while(ret.next()) {
					this.id.add(ret.getString(1));
					this.name.add(ret.getString(2));
					this.gender.add(ret.getString(3));
					this.grade.add(ret.getString(4));
					this.classs.add(ret.getString(5));
					this.idcard.add(ret.getString(6));
					this.school.add(ret.getString(7));
					this.other.add(ret.getString(8));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void cls() {
		this.id.clear();
		this.name.clear();
		this.gender.clear();
		this.grade.clear();
		this.classs.clear();
		this.idcard.clear();
		this.school.clear();
		this.other.clear();
		element = 0;
	}
}