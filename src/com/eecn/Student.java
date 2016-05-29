package com.eecn;

import java.sql.*;

public class Student {
	ADO ado = new ADO("root", "123321", "testsport");
	public Student() {}
	
	public boolean insert(String name, String gender, String grade, String classs, String idcard, String school, String other) {
		String sql = "INSERT INTO `testsport`.`student` (`name`, `gender`, `grade`, `class`, `idcard`, `school`, `other`) VALUES (" + "'" + name + "'" + "," + "'" + gender + "'" + "," + "'" + grade + "'" + "," + "'" + classs + "'" + "," + "'" + idcard + "'" + "," + "'" + school + "'" + ", " + other + "')";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean sign(String studentid, String gameid, String other) {
		String sql = "INSERT INTO `testsport`.`sign` (`studentid`, `gameid`, `other`) VALUES ('" + studentid + "', '" + gameid + "', '" + other + "')";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateSign(String id, String gameid) {
		String sql = "UPDATE sign SET gameid = '" + gameid + "' WHERE id ='" + id + "'";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteSign(String id) {
		String sql = "DELETE FROM sign WHERE id ='" + id + "'";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteStudent(String id) {
		String sql = "DELETE FROM student WHERE id ='" + id + "'";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateName(String idcard, String name) {
		String sql = "UPDATE student SET name = '" + name + "' WHERE idcard ='" + idcard + "'";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateGrade(String idcard, String grade) {
		String sql = "UPDATE student SET grade = '" + grade + "' WHERE idcard ='" + idcard + "'";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateClass(String idcard, String classs) {
		String sql = "UPDATE student SET class = '" + classs + "' WHERE idcard ='" + idcard + "'";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateSchool(String idcard, String school) {
		String sql = "UPDATE student SET school = '" + school + "' WHERE idcard ='" + idcard + "'";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateOther(String idcard, String other) {
		String sql = "UPDATE student SET other = '" + other + "' WHERE idcard ='" + idcard + "'";
		PreparedStatement pst = ado.getPst(sql);
		try {
			int result = pst.executeUpdate();
			if(result > 0) return true;
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
}
