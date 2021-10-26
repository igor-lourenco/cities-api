package com.api.cities.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.cities.dto.CityDTO;
import com.api.cities.entities.City;
import com.api.cities.repositories.CityRepository;
import com.api.cities.services.exceptions.ResourceNotFoundException;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;
	
	@Transactional(readOnly = true)
	public Page<CityDTO> findAll(Pageable pageable) {
		Page<City> entity = repository.findAll(pageable);
		return entity.map(x -> new CityDTO(x));
	}
	
	@Transactional()
	public CityDTO findById(Long id) {
		Optional<City> entity = repository.findById(id);
		City obj = entity.orElseThrow(() ->  new ResourceNotFoundException(" Id não existe"));
		return new CityDTO(obj);
	}
}

