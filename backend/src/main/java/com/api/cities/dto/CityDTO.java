package com.api.cities.dto;

import java.io.Serializable;

import com.api.cities.entities.City;

public class CityDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer uf;
	private Integer ibge;
	private String geolocation;
	
	public CityDTO() {
	
	}

	public CityDTO(Long id, String name, Integer uf, Integer ibge, String geolocation) {
		this.id = id;
		this.name = name;
		this.uf = uf;
		this.ibge = ibge;
		this.geolocation = geolocation;
	}
	
	public CityDTO(City entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.uf = entity.getUf();
		this.ibge = entity.getIbge();
		this.geolocation = entity.getGeolocation();
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

	public Integer getUf() {
		return uf;
	}

	public void setUf(Integer uf) {
		this.uf = uf;
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
}
