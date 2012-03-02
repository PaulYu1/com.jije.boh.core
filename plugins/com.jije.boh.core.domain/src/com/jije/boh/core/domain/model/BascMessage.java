package com.jije.boh.core.domain.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Message entity
 * @author Paul.Yu
 */

@Entity
@Table(name = "bascmessage")

public class BascMessage extends BascBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 669261577622242920L;
	
	private String serialnumber;
	
	private String title;
	
	private String context;
	
	private String sendemployeeid;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date sendtime=new Date();
	
	private String tostoreid;
	
	private String bascdictionary_statusid;
	
	private String bascdictionary_typeid;
	
	private String refid;

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getSendemployeeid() {
		return sendemployeeid;
	}

	public void setSendemployeeid(String sendemployeeid) {
		this.sendemployeeid = sendemployeeid;
	}

	public Date getSendtime() {
		return sendtime;
	}

	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}

	public String getTostoreid() {
		return tostoreid;
	}

	public void setTostoreid(String tostoreid) {
		this.tostoreid = tostoreid;
	}

	public String getBascdictionary_statusid() {
		return bascdictionary_statusid;
	}

	public void setBascdictionary_statusid(String bascdictionary_statusid) {
		this.bascdictionary_statusid = bascdictionary_statusid;
	}

	public String getBascdictionary_typeid() {
		return bascdictionary_typeid;
	}

	public void setBascdictionary_typeid(String bascdictionary_typeid) {
		this.bascdictionary_typeid = bascdictionary_typeid;
	}

	public String getRefid() {
		return refid;
	}

	public void setRefid(String refid) {
		this.refid = refid;
	}

}
