package com.api.cities.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cities.dto.StateDTO;
import com.api.cities.services.StateService;

@RestController
@RequestMapping(value = "/staties")
public class StateResource {

	@Autowired
	private StateService service;
	
	@GetMapping
	public ResponseEntity<Page<StateDTO>> findAllPaged(Pageable pageable){
		
		Page<StateDTO> dto = service.findAll(pageable);
		return ResponseEntity.ok().body(dto);
	}
	
	
}
