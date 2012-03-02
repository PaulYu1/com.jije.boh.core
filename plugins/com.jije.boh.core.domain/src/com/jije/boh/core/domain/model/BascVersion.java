package com.jije.boh.core.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Version entity
 * @author Paul.Yu
 */

@Entity
@Table(name = "bascversion")

public class BascVersion extends BascBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8259562712666662184L;
	
	private String softwareversion;
	
	private String bascdictionary_typeid;
	
	
	public String getSoftwareversion() {
		return softwareversion;
	}

	public void setSoftwareversion(String softwareversion) {
		this.softwareversion = softwareversion;
	}

	public String getBascdictionary_typeid() {
		return bascdictionary_typeid;
	}

	public void setBascdictionary_typeid(String bascdictionary_typeid) {
		this.bascdictionary_typeid = bascdictionary_typeid;
	}

	public Date getLastupdatedate() {
		return lastupdatedate;
	}

	public void setLastupdatedate(Date lastupdatedate) {
		this.lastupdatedate = lastupdatedate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdatedate=new Date();

}
