package com.jije.boh.core.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employee entity
 * @author Paul.Yu
 */

@Entity
@Table(name = "bascemployee")
public class BascEmployee extends BascBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -700353311759578753L;

	private String firstname;
	
	private String lastname;
	
	private String serialnumber;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday=new Date();
	
	private String gender;
	
	private int age;
	
	private String ssn;
	
	@ManyToOne
	BascJob bascJob;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public BascJob getBascJob() {
		return bascJob;
	}

	public void setBascJob(BascJob bascJob) {
		this.bascJob = bascJob;
	}

	public String getBascdictionary_groupid() {
		return bascdictionary_groupid;
	}

	public void setBascdictionary_groupid(String bascdictionary_groupid) {
		this.bascdictionary_groupid = bascdictionary_groupid;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	private String bascdictionary_groupid;

}
