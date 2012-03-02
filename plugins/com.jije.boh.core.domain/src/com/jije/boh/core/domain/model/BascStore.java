package com.jije.boh.core.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Store entity
 * @author Paul.Yu
 */

@Entity
@Table(name = "bascstore")
public class BascStore extends BascBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 289267739767497180L;

	private String orgid;
	
	private String name;
	
	private String serialnumber;
	
	private String company;
	
	private String city;
	
	private String phonenumber;
	
	private String address;
	
	private String bascdictionary_typeid;
	
	private String bascdictionary_groupid;
	
	private String parentid;
	
	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBascdictionary_typeid() {
		return bascdictionary_typeid;
	}

	public void setBascdictionary_typeid(String bascdictionary_typeid) {
		this.bascdictionary_typeid = bascdictionary_typeid;
	}

	public String getBascdictionary_groupid() {
		return bascdictionary_groupid;
	}

	public void setBascdictionary_groupid(String bascdictionary_groupid) {
		this.bascdictionary_groupid = bascdictionary_groupid;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getStorelevel() {
		return storelevel;
	}

	public void setStorelevel(String storelevel) {
		this.storelevel = storelevel;
	}

	private String storelevel;
	
	
	
}
