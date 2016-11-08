package com.mitratex.timah.poc.dao.impl;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mitratex.timah.poc.dao.EmployeeDao;
import com.mitratex.timah.poc.domain.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmployeeDaoImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Employee getEmployeeDetails(String position,String rescent)
	{
		Employee employee = new Employee();
		employee.setNik("10001987321");
		employee.setName("Rahmat Santoso");
		employee.setRescent(rescent);
		employee.setPosition(position);
	
		return employee;
	}
	
}
