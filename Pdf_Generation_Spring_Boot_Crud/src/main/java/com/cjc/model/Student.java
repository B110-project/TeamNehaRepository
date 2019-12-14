package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
    private int ui;
	
	private String name;
	
	private String addr;
	
	private String email;
	
	private String una;
	
	private String upas;

	

	public int getUi() {
		return ui;
	}

	public void setUi(int ui) {
		this.ui = ui;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUna() {
		return una;
	}

	public void setUna(String una) {
		this.una = una;
	}

	public String getUpas() {
		return upas;
	}

	public void setUpas(String upas) {
		this.upas = upas;
	}

	
	
		
}
