package com.api.cities.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cidade")

public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	private Integer uf;

	private Integer ibge;

	
	@Column(name = "lat_lon")
	private String geolocation;


	public City() {
	}

	public City(final Long id, final String name, final Integer uf, final Integer ibge, final String geolocation) {
		this.id = id;
		this.name = name;
		this.uf = uf;
		this.ibge = ibge;
		this.geolocation = geolocation;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getUf() {
		return uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public String getGeolocation() {
		return geolocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}