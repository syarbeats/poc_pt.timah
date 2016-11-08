package com.mitratex.timah.poc.service.impl;


import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.mitratex.timah.poc.dao.EmployeeDao;
import com.mitratex.timah.poc.dao.impl.EmployeeDaoImpl;
import com.mitratex.timah.poc.domain.Employee;
import com.mitratex.timah.poc.service.EmployeeService;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	 private static final Logger LOG = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public List<Map<String, String>> getEmployee(String position, String rescent) {
		// TODO Auto-generated method stub
		return null;
	}

    /* private EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();*/
       


	/*	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}*/


		/*@Override
		public Employee getEmployee(String position,String rescent) {
			// TODO Auto-generated method stub
			  LOG.info("[getEmployee] postion: "+position+" ,rescent: "+rescent);
	  
			  Employee employee = employeeDao.getEmployeeDetails(position,rescent);
	          return employee;
			
			 return null;
		}*/



		
		
		
		

}
