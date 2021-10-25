package com.api.cities.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.cities.dto.CountryDTO;
import com.api.cities.entities.Country;
import com.api.cities.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository repository;
	
	public Page<CountryDTO> findAll(Pageable pageable, String nome) {
		Page<Country> entity = repository.findByName(nome, pageable);
		return entity.map(x -> new CountryDTO(x));
	}
}
