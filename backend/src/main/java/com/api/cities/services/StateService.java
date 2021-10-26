package com.api.cities.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.cities.dto.StateDTO;
import com.api.cities.entities.State;
import com.api.cities.repositories.StateRepository;
import com.api.cities.services.exceptions.ResourceNotFoundException;

@Service
public class StateService {

	@Autowired
	private StateRepository repository;
	
	@Transactional(readOnly = true)
	public Page<StateDTO> findAll(Pageable pageable) {
		Page<State> entity = repository.findAll(pageable);
		return entity.map(x -> new StateDTO(x, x.getDdd()));
	}
	
	@Transactional()
	public StateDTO findById(Long id) {
		Optional<State> entity = repository.findById(id);
		State obj = entity.orElseThrow(() ->  new ResourceNotFoundException(" Id não existe"));
		return new StateDTO(obj, obj.getDdd());
	}
}
