package com.eecn;

import java.util.Vector;
import java.sql.*;

public class Game {
	public int element;
	ADO ado = new ADO("root", "123321", "testsport");
	public Vector<String> id = new Vector<String>();
	public Vector<String> name = new Vector<String>();
	public Vector<String> group1 = new Vector<String>();
	public Vector<String> group2 = new Vector<String>();
	public Vector<String> event = new Vector<String>();
	public Vector<String> status = new Vector<String>();
	public Vector<String> other = new Vector<String>();
	
	public Game() {}
	
	public boolean insertGame(String name, String group1, String group2, String event, String status, String other) {
		String sql = "INSERT INTO `testsport`.`game` (`name`, `group1`, `group2`, `event`, `status`, `other`) VALUES ('" + name + "', '" + group1 + "', '" + group2 + "', '" + event + "', '" + status + "', '" + other + "')";
		try {
			PreparedStatement pst = ado.getPst(sql);
			int result = pst.executeUpdate();
			if(result > 0) return true;
			else return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean editGame(String id, String name, String group1, String group2, String event, String status, String other) {
		String sql = "UPDATE event SET name='" + name + "' ,group1='" + group1 + "', group2='" + group2 + "', event='" + event + "', status='" + status + "', other='" + other + "' WHERE id='" + id + "'";
		try {
			PreparedStatement pst = ado.getPst(sql);
			int result = pst.executeUpdate();
			if(result > 0) return true;
			else return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void queryGame() {
		this.cls();
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
					this.event.add(ret.getString(5));
					this.status.add(ret.getString(6));
					this.other.add(ret.getString(7));
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
					this.event.add(ret.getString(5));
					this.status.add(ret.getString(6));
					this.other.add(ret.getString(7));
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
					this.event.add(ret.getString(5));
					this.status.add(ret.getString(6));
					this.other.add(ret.getString(7));
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
					this.event.add(ret.getString(5));
					this.status.add(ret.getString(6));
					this.other.add(ret.getString(7));
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
					this.event.add(ret.getString(5));
					this.status.add(ret.getString(6));
					this.other.add(ret.getString(7));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean deleteGame(String id) {
		String sql = "DELETE FROM game WHERE id = '" + id + "'";
		try {
			PreparedStatement pst = ado.getPst(sql);
			int result = pst.executeUpdate();
			if(result > 0) return true;
			else return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
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