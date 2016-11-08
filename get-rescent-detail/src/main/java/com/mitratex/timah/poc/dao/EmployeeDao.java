package com.mitratex.timah.poc.dao;

import org.springframework.stereotype.Repository;

import com.mitratex.timah.poc.domain.Employee;

@Repository
public interface EmployeeDao {

	public Employee getEmployeeDetails(String position,String rescent);
}
