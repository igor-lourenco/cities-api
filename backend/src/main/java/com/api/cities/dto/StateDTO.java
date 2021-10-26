package com.api.cities.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.api.cities.entities.Country;
import com.api.cities.entities.State;

public class StateDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String uf;
	private Integer ibge;
	private Country country;

	private List<String> ddd = new ArrayList<>();
	
	public StateDTO() {
	
	}

	public StateDTO(Long id, String name, String uf, Integer ibge, Country country) {
		this.id = id;
		this.name = name;
		this.uf = uf;
		this.ibge = ibge;
		this.country = country;
	}
	
	public StateDTO(State entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.uf = entity.getUf();
		this.ibge = entity.getIbge();
		this.country = entity.getCountry();
	}
	
	public StateDTO(State entity, List<String> ddd) {
		this(entity);
		ddd.forEach(ddds -> this.ddd.add(ddds));
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<String> getDdd() {
		return ddd;
	}
}
