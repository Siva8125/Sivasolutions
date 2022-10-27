package com.hrm.springmvc.entity.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.hrm.springmvc.entity.bean.EmployeeBean;
import com.hrm.springmvc.entity.bean.RequestBean;
import com.hrm.springmvc.entity.dao.Dao;

public class DaoServiceImplementation implements DaoService{
	@Autowired
	Dao dao;

	public String insertEmployeeData(EmployeeBean employeebean) {
		return dao.insertEmployeeData(employeebean);
	}
	@Autowired
	Dao dao1;
	
	public boolean login(String username, long password) {
		return dao1.login(username,password);
	}
		
		public List<EmployeeBean> listOfAllEmployees() {
			return dao.listOfAllEmployees();
		}

		
		public List<EmployeeBean> searchEmployees(String param) {
			return dao.searchEmployees(param);
		}

		

		public List<EmployeeBean> search(String employeeId2) {
			return dao.search(employeeId2);
		}

		public List<EmployeeBean> search() {
			return dao.search();
		}

		public boolean adminLogin(String adminId, String password) {
			return dao.adminLogin(adminId,password);
		}

		public int employeeUpdate(EmployeeBean employee) {
			return dao.employeeUpdate(employee);
		}

		public List<RequestBean> responseRequestData() {
			return dao.responseRequestData();
		}

		public int closeStatus(RequestBean requestBean) {
			return dao.closeStatus(requestBean);
		}

		public int responseUpdate(RequestBean requestBean) {
			return dao.responseUpdate(requestBean);
		}
		
}


