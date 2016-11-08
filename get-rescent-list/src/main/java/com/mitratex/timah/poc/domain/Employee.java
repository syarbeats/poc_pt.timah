package com.mitratex.timah.poc.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
public class Employee {
	
	private String nik;
	private String name;
	private String position;
	private String rescent;
	
	public String getNik() {
		return nik;
	}
	public void setNik(String nik) {
		this.nik = nik;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getRescent() {
		return rescent;
	}
	public void setRescent(String rescent) {
		this.rescent = rescent;
	}
	
	
	
	

}
