package com.api.cities.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estado")
public class State implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	private String uf;

	private Integer ibge;

	@ManyToOne
	@JoinColumn(name = "pais_id")
	private Country country;

	@ElementCollection(fetch=FetchType.LAZY)
	@CollectionTable(name = "tb_ddd")
	private List<String> ddd = new ArrayList<>();

	public State(Long id, String name, String uf, Integer ibge, Country country) {
		this.id = id;
		this.name = name;
		this.uf = uf;
		this.ibge = ibge;
		this.country = country;
	}

	public State() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUf() {
		return uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public List<String> getDdd() {
		return ddd;
	}

	public Country getCountry() {
		return country;
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
		State other = (State) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}