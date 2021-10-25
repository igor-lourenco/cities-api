package com.api.cities.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pais")
public class Country implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name = "nome")
	private String name;

	@Column(name = "nome_pt")
	private String portugueseName;

	@Column(name = "sigla")
	private String code;

	private Integer bacen;

	public Country() {
	}

	public Country(Long id, String name, String portugueseName, String code, Integer bacen) {
		this.id = id;
		this.name = name;
		this.portugueseName = portugueseName;
		this.code = code;
		this.bacen = bacen;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPortugueseName() {
		return portugueseName;
	}

	public String getCode() {
		return code;
	}

	public Integer getBacen() {
		return bacen;
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
		Country other = (Country) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
