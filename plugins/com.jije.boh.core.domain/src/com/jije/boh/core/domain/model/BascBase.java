package com.jije.boh.core.domain.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Base Entity
 * @author Paul.Yu
 */

@MappedSuperclass
public class BascBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4241966808715709483L;
	
	@Id
	@Column(length = 32)
	@GeneratedValue(generator = "system-uuid")
	//@GenericGenerator(name = "system-uuid", strategy = "uuid")
	protected String id = UUID.randomUUID().toString().replace("-", "");
	
	private int status;
	
	private String refnumber;
	
	@Version
	private Long version;
	
	private String plugininfo;
	
	@Column(insertable=true,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createtime=new Date();
	
	private String createby;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date inserttime=new Date();
	
	private String insertby;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdatetime=new Date();
	
	private String lastupdateby;
	
	private String storeid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRefnumber() {
		return refnumber;
	}

	public void setRefnumber(String refnumber) {
		this.refnumber = refnumber;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getPlugininfo() {
		return plugininfo;
	}

	public void setPlugininfo(String plugininfo) {
		this.plugininfo = plugininfo;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public Date getInserttime() {
		return inserttime;
	}

	public void setInserttime(Date inserttime) {
		this.inserttime = inserttime;
	}

	public String getInsertby() {
		return insertby;
	}

	public void setInsertby(String insertby) {
		this.insertby = insertby;
	}

	public Date getLastupdatetime() {
		return lastupdatetime;
	}

	public void setLastupdatetime(Date lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

	public String getLastupdateby() {
		return lastupdateby;
	}

	public void setLastupdateby(String lastupdateby) {
		this.lastupdateby = lastupdateby;
	}

	public String getStoreid() {
		return storeid;
	}

	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}
	
	

}
