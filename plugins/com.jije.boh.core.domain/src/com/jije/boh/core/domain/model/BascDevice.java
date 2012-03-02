package com.jije.boh.core.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Device entity
 * @author Paul.Yu
 */

@Entity
@Table(name = "bascdevice")

public class BascDevice extends BascBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7788126673411469559L;
	
	private String name;
	
	private String devicesn;
	
	private String serialnumber;
	
	private String bascdictionary_typeid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevicesn() {
		return devicesn;
	}

	public void setDevicesn(String devicesn) {
		this.devicesn = devicesn;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getBascdictionary_typeid() {
		return bascdictionary_typeid;
	}

	public void setBascdictionary_typeid(String bascdictionary_typeid) {
		this.bascdictionary_typeid = bascdictionary_typeid;
	}

}
