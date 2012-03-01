package com.jije.boh.core.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Device entity
 * @author Paul.Yu
 */

@Entity
@Table(name = "bascdevicestatus")
public class BascDeviceStatus extends BascBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6056049410742006277L;
	
	private String deviceid;
	
	private String bascdictionary_statusid;

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getBascdictionary_statusid() {
		return bascdictionary_statusid;
	}

	public void setBascdictionary_statusid(String bascdictionary_statusid) {
		this.bascdictionary_statusid = bascdictionary_statusid;
	}
	
	

}
