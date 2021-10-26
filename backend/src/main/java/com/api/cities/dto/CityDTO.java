package com.api.cities.dto;

import java.io.Serializable;

import com.api.cities.entities.City;
import com.api.cities.entities.State;

public class CityDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Integer ibge;
	private String geolocation;
	private Long latitude;
	private Long longitude;
	private Integer codTom;

	private State state;

	public CityDTO() {

	}

	public CityDTO(Long id, String name, Integer ibge, String geolocation, Long latitude, Long longitude,
			Integer codTom, State state) {
		this.id = id;
		this.name = name;
		this.ibge = ibge;
		this.geolocation = geolocation;
		this.latitude = latitude;
		this.longitude = longitude;
		this.codTom = codTom;
		this.state = state;
	}

	public CityDTO(City entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.ibge = entity.getIbge();
		this.geolocation = entity.getGeolocation();
		state = entity.getState();
		latitude = entity.getLatitude();
		longitude = entity.getLongitude();
		codTom = entity.getCodTom();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}

	public String getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(String geolocation) {
		this.geolocation = geolocation;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Integer getCodTom() {
		return codTom;
	}

	public void setCodTom(Integer codTom) {
		this.codTom = codTom;
	}
}
