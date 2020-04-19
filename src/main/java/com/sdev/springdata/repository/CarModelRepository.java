package com.sdev.springdata.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sdev.springdata.entity.CarModelEntity;

@RepositoryRestResource(collectionResourceRel = "carModels", path = "carModels")
public interface CarModelRepository extends PagingAndSortingRepository<CarModelEntity, Long> {

}
