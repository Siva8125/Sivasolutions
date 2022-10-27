package com.hrm.springmvc.entity.dao;

import java.util.List;


import com.hrm.springmvc.entity.bean.EmployeeBean;
import com.hrm.springmvc.entity.bean.RequestBean;

public interface Dao {


	public String insertEmployeeData(EmployeeBean employeebean);

	public boolean login(String username, long password);

	public List<EmployeeBean> listOfAllEmployees();

	public List<EmployeeBean> searchEmployees(String param);

	public int responseUpdate(RequestBean requestBean);

	public int closeStatus(RequestBean requestBean);

	public List<RequestBean> responseRequestData();

	public int employeeUpdate(EmployeeBean employee);

	public boolean adminLogin(String adminId, String password);

	public List<EmployeeBean> search();

	public List<EmployeeBean> search(String employeeId2);
	

}
