package com.jije.boh.core.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User Entity
 * @author Paul.Yu
 */
@Entity
@Table(name = "bascuser")
public class BascUser extends BascBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6995118872588144077L;

	private String employeeid;
	
	private String loginname;
	
	private String password;

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
