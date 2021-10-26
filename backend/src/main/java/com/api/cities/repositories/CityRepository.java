package com.api.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.cities.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

}