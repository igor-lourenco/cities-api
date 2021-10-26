package com.api.cities.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.cities.dto.StateDTO;
import com.api.cities.services.StateService;

@RestController
@RequestMapping(value = "/staties")
public class StateResource {

	@Autowired
	private StateService service;
	
	@GetMapping
	public ResponseEntity<Page<StateDTO>> findAllPaged(Pageable pageable,
			@RequestParam(value = "name",  defaultValue = "") String name){
		
		Page<StateDTO> dto = service.findAll(pageable, name.trim());
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<StateDTO> findById(@PathVariable Long id){
		
		StateDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
