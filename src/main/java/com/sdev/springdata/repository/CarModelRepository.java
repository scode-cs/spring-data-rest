package com.sdev.springdata.repository;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sdev.springdata.entity.CarModelEntity;

@Tag(name = "Car Models Resources")
@RepositoryRestResource(collectionResourceRel = "carModels", path = "car-models", exported = false)
public interface CarModelRepository extends PagingAndSortingRepository<CarModelEntity, Long> {

}
