package com.tfm.keepfresh.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unit")
public class Unit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float temperature;
	private float humidity;
	private String state;
	private Date seenopen;
	private Date addedDate;
	private String ip;
	private int port;

	public Unit(float temperature, float humidity, String state, Date seenopen, Date addedDate, String ip, int port) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.state = state;
		this.seenopen = seenopen;
		this.addedDate = addedDate;
		this.ip = ip;
		this.port = port;
	}

	public Unit() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getSeenopen() {
		return seenopen;
	}

	public void setSeenopen(Date seenopen) {
		this.seenopen = seenopen;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
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
