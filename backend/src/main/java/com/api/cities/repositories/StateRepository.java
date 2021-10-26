package com.api.cities.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.cities.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

	// DISTINCT serve para eliminar repetições em consultas
	// LOWER desconsidera letras maiusculas e minusculas
	// LIKE serve para realizar uma busca mais refinada em um campo de uma tabela
	// CONCAT retorna uma cadeia de caracteres resultante de concatenação ou junção
	// de dois ou mais valores

	@Query("SELECT DISTINCT obj FROM State obj WHERE "
	+ "(LOWER(obj.name) LIKE LOWER(CONCAT('%', :name, '%')))")
	Page<State> findByName(String name, Pageable pageable);
}
