package com.api.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.cities.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
