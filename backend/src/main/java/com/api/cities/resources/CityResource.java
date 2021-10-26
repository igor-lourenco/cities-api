package com.api.cities.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cities.dto.CityDTO;
import com.api.cities.services.CityService;

@RestController
@RequestMapping(value = "/cities")
public class CityResource {

	@Autowired
	private CityService service;
	
	@GetMapping
	public ResponseEntity<Page<CityDTO>> findAllPaged(Pageable pageable){
		
		Page<CityDTO> dto = service.findAll(pageable);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CityDTO> findById(@PathVariable Long id){
		
		CityDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
