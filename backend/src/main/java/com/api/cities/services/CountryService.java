package com.api.cities.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.cities.dto.CountryDTO;
import com.api.cities.entities.Country;
import com.api.cities.repositories.CountryRepository;
import com.api.cities.services.exceptions.ResourceNotFoundException;

@Service
public class CountryService {

	@Autowired
	private CountryRepository repository;
	
	@Transactional(readOnly = true)
	public Page<CountryDTO> findAll(Pageable pageable, String nome) {
		Page<Country> entity = repository.findByName(nome, pageable);
		return entity.map(x -> new CountryDTO(x));
	}
	
	@Transactional()
	public CountryDTO findById(Long id) {
		Optional<Country> entity = repository.findById(id);
		Country obj = entity.orElseThrow(() ->  new ResourceNotFoundException(" Id não existe"));
		return new CountryDTO(obj);
	}
}
