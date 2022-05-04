package com.tfm.keepfresh.payload.request;

import java.util.Date;

import javax.validation.constraints.NotBlank;

public class UnitRequest {
	
	@NotBlank
	private float temperature;
	@NotBlank
	private float humidity;
	@NotBlank
	private String state;
	@NotBlank
	private Date seenopen;
	@NotBlank
	private Date addedDate;
	@NotBlank
	private String ip;
	@NotBlank
	private int port;
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
