package com.dsk.dbconnection;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dsk.bean.Patients;

public class DSKDaoImplementation {
	Statement stat;
	Connection connection;
	PreparedStatement pstat;
	ResultSet resultset;
	static int PatientNumber;
	public DSKDaoImplementation() {
		connection=MySqlConnection.getInstance();
	}
	
	
	public int InsertOPData(Patients p) {
		int result = 0;
		String query="insert into Patients values(?,?)";

		try {
			pstat=connection.prepareStatement(query);
			
			pstat.setInt(1,p.getPatientNumber());
			pstat.setString(2,p.getPatientName());
			
			result=pstat.executeUpdate();
						
		}
			
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	public List<Patients> Fetch() {
		List<Patients> ps = new ArrayList<Patients>();
		String query = "select * from Patients";
		try {
		pstat = connection.prepareStatement(query);

		resultset = pstat.executeQuery();
		Patients result = null;
		while(resultset.next()) {
		result = new Patients();
		result.setPatientNumber(resultset.getInt(1));
		result.setPatientName(resultset.getString(2));
		
		ps.add(result);
		}

		}

		catch (SQLException e) {
		e.printStackTrace();
		}
		return ps;
		}
		

	

	public static void main(String[] args) {
		
	}


}
