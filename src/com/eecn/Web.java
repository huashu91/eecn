package com.eecn;

import java.sql.*;

public class Web {
	public String webname;
	public String weburl;
	public String h1title;
	public String h1content;
	public String h2title1;
	public String h2content1;
	public String h2title2;
	public String h2content2;
	public String h2title3;
	public String h2content3;
	private String sql = "SELECT * FROM web";
	private ResultSet ret = null;
	ADO ado = new ADO("root", "123321", "testsport");
	
	public Web() {}
	
	public void getInfo() {
		try {
			ret = ado.getRet(sql);
			while(ret.next()) {
				webname = ret.getString(2);
				weburl = ret.getString(3);
				h1title = ret.getString(4);
				h1content = ret.getString(5);
				h2title1 = ret.getString(6);
				h2content1 = ret.getString(7);
				h2title2 = ret.getString(8);
				h2content2 = ret.getString(9);
				h2title3 = ret.getString(10);
				h2content3 = ret.getString(11);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean updateName(String webname) {
		String sql = "UPDATE web SET webname = '" + webname +  "' WHERE id = 0";
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
	
	public boolean updateURL(String url) {
		String sql = "UPDATE web SET weburl = '" + url + "' WHERE id = 0";
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
	
	public boolean updateH1(String title, String content) {
		String sql = "UPDATE web SET h1title = '" + title + "', h1content = '" + content + "' WHERE id = 0";
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
	
	public boolean updateH2l(String title, String content) {
		String sql = "UPDATE web SET h2title1 = '" + title + "', h2content1 = '" + content + "' WHERE id = 0";
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
	
	public boolean updateH2m(String title, String content) {
		String sql = "UPDATE web SET h2title2 = '" + title + "', h2content2 = '" + content + "' WHERE id = 0";
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

	public boolean updateH2r(String title, String content) {
		String sql = "UPDATE web SET h2title3 = '" + title + "', h2content3 = '" + content + "' WHERE id = 0";
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
}
