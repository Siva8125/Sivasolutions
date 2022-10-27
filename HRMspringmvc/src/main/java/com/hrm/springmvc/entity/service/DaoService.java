package com.hrm.springmvc.entity.service;

import java.util.List;


import com.hrm.springmvc.entity.bean.RequestBean;
import com.hrm.springmvc.entity.bean.EmployeeBean;

public interface DaoService {

	public String insertEmployeeData(EmployeeBean employeebean);

	public boolean login(String username, long password);

	public List<EmployeeBean> listOfAllEmployees();

	public List<EmployeeBean> searchEmployees(String param);

	public List<EmployeeBean> search(String employeeId2);

	public List<EmployeeBean> search();

	public boolean adminLogin(String adminId, String password);

	public int employeeUpdate(EmployeeBean employee);

	public List<RequestBean> responseRequestData();

	public int closeStatus(RequestBean requestBean);

	public int responseUpdate(RequestBean requestBean);

}
