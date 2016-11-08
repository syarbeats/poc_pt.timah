package com.mitratex.timah.poc.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rescentSAP")
public class RescentSap {

	private String rescent;
	private String position;
	
	public String getRescent() {
		return rescent;
	}
	public void setRescent(String rescent) {
		this.rescent = rescent;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
