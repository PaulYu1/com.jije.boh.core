package com.jije.boh.core.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Job entity
 * @author Paul.Yu
 */


@Entity
@Table(name = "bascjob")
public class BascJob extends BascBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4480874403107261171L;
	
	private String name;
	
	private String serialnumber;
	
	private boolean ishourly;
	
	@OneToMany(mappedBy = "bascJob")
	List<BascEmployee> employees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public boolean isIshourly() {
		return ishourly;
	}

	public void setIshourly(boolean ishourly) {
		this.ishourly = ishourly;
	}

	public List<BascEmployee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<BascEmployee> employees) {
		this.employees = employees;
	}
}
