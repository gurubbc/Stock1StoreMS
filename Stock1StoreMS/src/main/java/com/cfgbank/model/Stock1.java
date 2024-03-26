package com.cfgbank.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Stock1 {
	@Id
	int id;
	String name;
	Timestamp lastUpdate;
	int deleted;
	

	public Stock1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Stock1(int id, String name, Timestamp lastUpdate, int deleted) {
		super();
		this.id = id;
		this.name = name;
		this.lastUpdate = lastUpdate;
		this.deleted = deleted;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Timestamp getLastUpdate() {
		return lastUpdate;
	}


	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}


	public int getDeleted() {
		return deleted;
	}


	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}


	@Override
	public String toString() {
		return "Stock1 [id=" + id + ", name=" + name + ", lastUpdate=" + lastUpdate + ", deleted=" + deleted + "]";
	}


	
	
	
	
	
}
