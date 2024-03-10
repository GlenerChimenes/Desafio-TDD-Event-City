package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.devsuperior.demo.entities.City;

@Repository
public interface CityRepository extends JpaRepositoryImplementation<City, Long>{

}
