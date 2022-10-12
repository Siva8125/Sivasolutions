package com.dsk.db.connection;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dsk.bean.StudentBean;
public class DSKDaoImplementation {
	Statement stat;
	Connection connection;
	PreparedStatement pstat;
	ResultSet resultset;
	static String StudentId;
	public DSKDaoImplementation() {
		connection=MySqlConnection.getInstance();
	}
	
	
	public int InsertStudentData(StudentBean studentbean) {
		int result = 0;
		//String query="insert into StudentBean values("+studentbean.getStudentId()+",'"+studentbean.getFirstName()+"',"+",'"+studentbean.getLastName()+"',"+",'"+studentbean.getFatherName()+"',"+",'"+studentbean.getGender()+"',"+studentbean.getDob()+",'"+studentbean.getEmailId()+"',"+studentbean.getMobileNumber()+studentbean.getAlternatemobilenumber()+studentbean.getAadharNo()+",'"+studentbean.getPermanentAddress()+"',"+",'"+studentbean.getPresentaddress()+"',"+",'"+studentbean.getSchoolName()+"',"+studentbean.getTenthPassedOut()+",'"+studentbean.getIntermediateCollegeName()+"',"+studentbean.getInterPassedOut()+",'"+studentbean.getGraduationdetails()+"',"+studentbean.getGraduationpassedout()+",'"+studentbean.getBranch()+"',"+",'"+studentbean.getUniversity()+"',"+",'"+studentbean.getCourseName()+"',"+studentbean.getCoursefee()+",'"+studentbean.getBankname()+"',"+studentbean.getBankaccNo()+",'"+studentbean.getIfsccode()+"',"+studentbean.getPaymentperiod()+",'"+studentbean.getPaymentstatus()+"',"+",'"+studentbean.getAcademylocation()+"')";
		String query="insert into StudentBean values(?,?,?,?,?)";

		try {
			pstat=connection.prepareStatement(query);
			
			pstat.setString(1,studentbean.getStudentId());
			pstat.setString(2,studentbean.getFirstName());
			pstat.setString(3,studentbean.getLastName());
			pstat.setString(4,studentbean.getFatherName());
			pstat.setString(5,studentbean.getAddress());
			
			result=pstat.executeUpdate();
						
		}
			
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	public int DeleteData(StudentBean studentbean) {
		int result = 0;

		try {
			String query="delete from StudentBean where StudentId = '"+studentbean.getStudentId()+"';";
			
			pstat=connection.prepareStatement(query);
		
			result=pstat.executeUpdate();
						
		}
			
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	public int UpdateData(StudentBean studentbean) {
		int result = 0;
		//String query = "update StudentBean where StudentId = ?";
		try {
			String query = "update StudentBean set FirstName =?,LastName=?,FatherName=?,Address=? where StudentId = '"+studentbean.getStudentId()+"';";
			pstat=connection.prepareStatement(query);
			
			pstat.setString(1,studentbean.getFirstName());
			pstat.setString(2,studentbean.getLastName());
			pstat.setString(3,studentbean.getFatherName());
			pstat.setString(4, studentbean.getAddress());
			
			result=pstat.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
				return result;
	}
	public StudentBean SearchData(String sb) {
		StudentBean result = null;
		String query = "select * from StudentBean where StudentId = ?";
		try {
		pstat = connection.prepareStatement(query);
		pstat.setString(1,sb);
		resultset = pstat.executeQuery();
		while(resultset.next()) {
		result = new StudentBean();
		result.setStudentId(resultset.getString(1));
		result.setFirstName(resultset.getString(2));
		result.setLastName(resultset.getString(3));
		result.setFatherName(resultset.getString(4));
		result.setAddress(resultset.getString(5));
		
		}

		}

		catch (SQLException e) {
		e.printStackTrace();
		}
		return result;
		
	}
	public List<StudentBean> Fetch() {
		List<StudentBean> students = new ArrayList<StudentBean>();
		String query = "select * from StudentBean";
		try {
		pstat = connection.prepareStatement(query);

		resultset = pstat.executeQuery();
		StudentBean result = null;
		while(resultset.next()) {
		result = new StudentBean();
		result.setStudentId(resultset.getString(1));
		result.setFirstName(resultset.getString(2));
		result.setLastName(resultset.getString(3));
		result.setFatherName(resultset.getString(4));
		result.setAddress(resultset.getString(5));
		
		students.add(result);
		}

		}

		catch (SQLException e) {
		e.printStackTrace();
		}
		return students;
		}
		

	

	public static void main(String[] args) {
		
	}


	
	

}
