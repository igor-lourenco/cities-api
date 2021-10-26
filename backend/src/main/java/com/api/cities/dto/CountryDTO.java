package com.api.cities.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.api.cities.entities.Country;
import com.api.cities.entities.State;

public class CountryDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String portugueseName;

	private String code;

	private Integer bacen;
	
	private Set<StateDTO> states = new HashSet<>();
	
	public CountryDTO() {
		
	}

	public CountryDTO(Long id, String name, String portugueseName, String code, Integer bacen) {
		this.id = id;
		this.name = name;
		this.portugueseName = portugueseName;
		this.code = code;
		this.bacen = bacen;
	}
	
	public CountryDTO(Country entity) {
		id = entity.getId();
		name = entity.getName();
		portugueseName = entity.getPortugueseName();
		code = entity.getCode();
		bacen = entity.getBacen();
	}
	
	public CountryDTO(Country entity, List<State> states) {
		this(entity);
		states.forEach(estado -> this.states.add(new StateDTO(estado)));
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

	public String getPortugueseName() {
		return portugueseName;
	}

	public void setPortugueseName(String portugueseName) {
		this.portugueseName = portugueseName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getBacen() {
		return bacen;
	}

	public void setBacen(Integer bacen) {
		this.bacen = bacen;
	}
}
