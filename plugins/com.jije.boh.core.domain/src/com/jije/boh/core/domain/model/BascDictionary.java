package com.jije.boh.core.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Dictionary entity
 * @author Paul.Yu
 */

@Entity
@Table(name = "bascdictionary")
public class BascDictionary extends BascBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7094885509211768113L;

	private String dicid;
	
	private boolean isused;
	
	private String name;
	
	private String value;
	
	private int dicindex;
	
	private String parentid;
	
	public String getDicid() {
		return dicid;
	}

	public void setDicid(String dicid) {
		this.dicid = dicid;
	}

	public boolean isIsused() {
		return isused;
	}

	public void setIsused(boolean isused) {
		this.isused = isused;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getDicindex() {
		return dicindex;
	}

	public void setDicindex(int dicindex) {
		this.dicindex = dicindex;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	
	
}
