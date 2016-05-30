package com.eecn;

import java.util.Vector;
import java.sql.*;

public class Event {
	public int element;
	ADO ado = new ADO("root", "123321", "testsport");
	public Vector<String> id = new Vector<String>();
	public Vector<String> name = new Vector<String>();
	public Vector<String> host = new Vector<String>();
	public Vector<String> time = new Vector<String>();
	public Vector<String> other = new Vector<String>();
	
	public Event() {}
	
	public boolean insertEvent(String name, String host, String time, String other) {
		String sql = "INSERT INTO `testsport`.`event` (`name`, `host`, `time`, `other`) VALUES ('" + name + "', '" + host + "', '" + time + "', '" + other + "')";
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
	
	public boolean editEvent(String id, String name, String host, String time, String other) {
		String sql = "UPDATE event SET name='" + name + "' ,host='" + host + "', time='" + time + "', other='" + other + "' WHERE id='" + id + "'";
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
	
	public void queryEvent() {
		this.cls();
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
		String sql = "SELECT * FROM event WHERE name = '" + name + "'";
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
	
	public void queryByID(String id) {
		this.cls();
		String sql = "SELECT * FROM event WHERE id = '" + id + "'";
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
		String sql = "SELECT * FROM event WHERE host = '" + host + "'";
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