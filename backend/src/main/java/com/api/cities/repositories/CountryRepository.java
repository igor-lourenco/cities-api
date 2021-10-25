package com.api.cities.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.cities.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
	
	//DISTINCT serve para eliminar repetições em consultas
	//LOWER desconsidera letras maiusculas e minusculas
	//LIKE serve para realizar uma busca mais refinada em um campo de uma tabela
	//CONCAT retorna uma cadeia de caracteres resultante de concatenação ou junção de dois ou mais valores 
	
	@Query("SELECT DISTINCT obj FROM Country obj WHERE "
			+ "(LOWER(obj.name) LIKE LOWER(CONCAT('%', :name, '%')))")
	Page<Country> findByName(String name, Pageable pageable);
}
