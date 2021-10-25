package com.api.cities.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.cities.dto.CountryDTO;
import com.api.cities.services.CountryService;

@RestController
@RequestMapping(value = "/countries")
public class CountryResource {

	@Autowired
	private CountryService service;

	@GetMapping
	public ResponseEntity<Page<CountryDTO>> cities(Pageable pageable,
			@RequestParam(value = "name",  defaultValue = "") String name){
		
		Page<CountryDTO> dto = service.findAll(pageable, name.trim());
		return ResponseEntity.ok().body(dto);
	}
}