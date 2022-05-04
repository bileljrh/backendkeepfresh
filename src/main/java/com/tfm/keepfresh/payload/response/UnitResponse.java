package com.tfm.keepfresh.payload.response;

import java.util.Date;

public class UnitResponse {
	private float temperature;
	private float humidity;
	private String state;
	private Date seenopen;
	private Date addedDate;
	private String ip;
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
