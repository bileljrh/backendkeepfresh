package com.tfm.keepfresh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configuration_unitee")
public class ConfigUnits {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String ip ;
	private int port ;
	
	
	
	public ConfigUnits() {
		super();
	}


	public ConfigUnits(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getIp() {
		return ip;
	}



	public void setIp(String ip) {
		this.ip = ip;
	}



	public int getPort() {
		return port;
	}



	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
