package com.dsk.db.connection;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dsk.bean.Studentbean;
public class DSKDaoImplementation {
	Statement stat;
	Connection connection;
	PreparedStatement pstat;
	ResultSet resultset;
	static String studentId;
	public DSKDaoImplementation() {
		connection=MySqlConnection.getInstance();
	}
	
	
	public int InsertStudentData(Studentbean studentbean) {
		int result = 0;
		//String query="insert into Studentbean values("+studentbean.getStudentId()+",'"+studentbean.getFirstName()+"',"+",'"+studentbean.getLastName()+"',"+",'"+studentbean.getFatherName()+"',"+",'"+studentbean.getGender()+"',"+studentbean.getDob()+",'"+studentbean.getEmailId()+"',"+studentbean.getMobileNumber()+studentbean.getAlternatemobilenumber()+studentbean.getAadharNo()+",'"+studentbean.getPermanentAddress()+"',"+",'"+studentbean.getPresentaddress()+"',"+",'"+studentbean.getSchoolName()+"',"+studentbean.getTenthPassedOut()+",'"+studentbean.getIntermediateCollegeName()+"',"+studentbean.getInterPassedOut()+",'"+studentbean.getGraduationdetails()+"',"+studentbean.getGraduationpassedout()+",'"+studentbean.getBranch()+"',"+",'"+studentbean.getUniversity()+"',"+",'"+studentbean.getCourseName()+"',"+studentbean.getCoursefee()+",'"+studentbean.getBankname()+"',"+studentbean.getBankaccNo()+",'"+studentbean.getIfsccode()+"',"+studentbean.getPaymentperiod()+",'"+studentbean.getPaymentstatus()+"',"+",'"+studentbean.getAcademylocation()+"')";
		String query="insert into Studentbean values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			pstat=connection.prepareStatement(query);
			pstat.setString(1,studentbean.getStudentId());
			pstat.setString(2,studentbean.getFirstName());
			pstat.setString(3,studentbean.getLastName());
			pstat.setString(4,studentbean.getFatherName());
			pstat.setString(5,studentbean.getGender());
			pstat.setString(6,studentbean.getDob());
			pstat.setString(7,studentbean.getEmailId());
			pstat.setLong(8,studentbean.getMobileNumber());
			pstat.setLong(9,studentbean.getAlternatemobilenumber());
			pstat.setLong(10,studentbean.getAadharNo());
			pstat.setString(11,studentbean.getPermanentAddress());
			pstat.setString(12,studentbean.getPresentaddress());
			pstat.setString(13,studentbean.getSchoolName());
			pstat.setInt(14,studentbean.getTenthPassedOut());
			pstat.setString(15,studentbean.getIntermediateCollegeName());
			pstat.setInt(16,studentbean.getInterPassedOut());
			pstat.setString(17,studentbean.getGraduationdetails());
			pstat.setInt(18,studentbean.getGraduationpassedout());
			pstat.setString(19,studentbean.getBranch());
			pstat.setString(20,studentbean.getUniversity());
			pstat.setString(21,studentbean.getCourseName());
			pstat.setLong(22,studentbean.getCoursefee());
			pstat.setString(23,studentbean.getBankname());
			pstat.setLong(24,studentbean.getBankaccNo());
			pstat.setString(25,studentbean.getIfsccode());
			pstat.setInt(26,studentbean.getPaymentperiod());
			pstat.setString(27,studentbean.getPaymentstatus());
			pstat.setString(28,studentbean.getAcademylocation());
			result=pstat.executeUpdate();
						
		}
			
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	public int DeleteData(Studentbean studentbean) {
		int result = 0;
		//String query="insert into Studentbean values("+studentbean.getStudentId()+",'"+studentbean.getFirstName()+"',"+",'"+studentbean.getLastName()+"',"+",'"+studentbean.getFatherName()+"',"+",'"+studentbean.getGender()+"',"+studentbean.getDob()+",'"+studentbean.getEmailId()+"',"+studentbean.getMobileNumber()+studentbean.getAlternatemobilenumber()+studentbean.getAadharNo()+",'"+studentbean.getPermanentAddress()+"',"+",'"+studentbean.getPresentaddress()+"',"+",'"+studentbean.getSchoolName()+"',"+studentbean.getTenthPassedOut()+",'"+studentbean.getIntermediateCollegeName()+"',"+studentbean.getInterPassedOut()+",'"+studentbean.getGraduationdetails()+"',"+studentbean.getGraduationpassedout()+",'"+studentbean.getBranch()+"',"+",'"+studentbean.getUniversity()+"',"+",'"+studentbean.getCourseName()+"',"+studentbean.getCoursefee()+",'"+studentbean.getBankname()+"',"+studentbean.getBankaccNo()+",'"+studentbean.getIfsccode()+"',"+studentbean.getPaymentperiod()+",'"+studentbean.getPaymentstatus()+"',"+",'"+studentbean.getAcademylocation()+"')";
		

		try {
			String query="delete from Studentbean where StudentId = '"+studentbean.getStudentId()+"';";
			pstat=connection.prepareStatement(query);
		//	pstat.setString(1,studentbean.getStudentId());
			/*pstat.setString(2,studentbean.getFirstName());
			pstat.setString(3,studentbean.getLastName());
			pstat.setString(4,studentbean.getFatherName());
			pstat.setString(5,studentbean.getGender());
			pstat.setString(6,studentbean.getDob());
			pstat.setString(7,studentbean.getEmailId());
			pstat.setLong(8,studentbean.getMobileNumber());
			pstat.setLong(9,studentbean.getAlternatemobilenumber());
			pstat.setLong(10,studentbean.getAadharNo());
			pstat.setString(11,studentbean.getPermanentAddress());
			pstat.setString(12,studentbean.getPresentaddress());
			pstat.setString(13,studentbean.getSchoolName());
			pstat.setInt(14,studentbean.getTenthPassedOut());
			pstat.setString(15,studentbean.getIntermediateCollegeName());
			pstat.setInt(16,studentbean.getInterPassedOut());
			pstat.setString(17,studentbean.getGraduationdetails());
			pstat.setInt(18,studentbean.getGraduationpassedout());
			pstat.setString(19,studentbean.getBranch());
			pstat.setString(20,studentbean.getUniversity());
			pstat.setString(21,studentbean.getCourseName());
			pstat.setLong(22,studentbean.getCoursefee());
			pstat.setString(23,studentbean.getBankname());
			pstat.setLong(24,studentbean.getBankaccNo());
			pstat.setString(25,studentbean.getIfsccode());
			pstat.setInt(26,studentbean.getPaymentperiod());
			pstat.setString(27,studentbean.getPaymentstatus());
			pstat.setString(28,studentbean.getAcademylocation());*/
			result=pstat.executeUpdate();
						
		}
			
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	public int UpdateData(Studentbean studentbean) {
		int result = 0;
		//String query = "update Studentbean where StudentId = ?";
		try {
			String query = "update Studentbean set firstName =?,lastName=? where studentId= '"+studentbean.getStudentId()+"';";
			pstat=connection.prepareStatement(query);
			
			pstat.setString(1,studentbean.getFirstName());
			pstat.setString(2,studentbean.getLastName());
			//pstat.setString(3,studentbean.getStudentId());
			/*pstat.setString(4,studentbean.getFatherName());
			pstat.setString(5,studentbean.getGender());
			pstat.setString(6,studentbean.getDob());
			pstat.setString(7,studentbean.getEmailId());
			pstat.setLong(8,studentbean.getMobileNumber());
			pstat.setLong(9,studentbean.getAlternatemobilenumber());
			pstat.setLong(10,studentbean.getAadharNo());
			pstat.setString(11,studentbean.getPermanentAddress());
			pstat.setString(12,studentbean.getPresentaddress());
			pstat.setString(13,studentbean.getSchoolName());
			pstat.setInt(14,studentbean.getTenthPassedOut());
			pstat.setString(15,studentbean.getIntermediateCollegeName());
			pstat.setInt(16,studentbean.getInterPassedOut());
			pstat.setString(17,studentbean.getGraduationdetails());
			pstat.setInt(18,studentbean.getGraduationpassedout());
			pstat.setString(19,studentbean.getBranch());
			pstat.setString(20,studentbean.getUniversity());
			pstat.setString(21,studentbean.getCourseName());
			pstat.setLong(22,studentbean.getCoursefee());
			pstat.setString(23,studentbean.getBankname());
			pstat.setLong(24,studentbean.getBankaccNo());
			pstat.setString(25,studentbean.getIfsccode());
			pstat.setInt(26,studentbean.getPaymentperiod());
			pstat.setString(27,studentbean.getPaymentstatus());
			pstat.setString(28,studentbean.getAcademylocation());*/
			result=pstat.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
				return result;
	}
	public Studentbean SearchData(String sb) {
		Studentbean result = null;
		String query = "select * from Studentbean where studentId = ?";
		try {
		pstat = connection.prepareStatement(query);
		pstat.setString(1,sb);
		resultset = pstat.executeQuery();
		while(resultset.next()) {
		result = new Studentbean();
		result.setStudentId(resultset.getString(1));
		result.setFirstName(resultset.getString(2));
		result.setLastName(resultset.getString(3));
		
		}

		}

		catch (SQLException e) {
		e.printStackTrace();
		}
		return result;
		
	}
	

	public static void main(String[] args) {
		
	}


	
	

}
