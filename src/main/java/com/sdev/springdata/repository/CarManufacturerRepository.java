package com.sdev.springdata.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sdev.springdata.entity.CarManufacturerEntity;

@RepositoryRestResource(collectionResourceRel = "carManufacturers", path = "carManufacturers", exported = true)
public interface CarManufacturerRepository extends PagingAndSortingRepository<CarManufacturerEntity, Long> {
	
}
