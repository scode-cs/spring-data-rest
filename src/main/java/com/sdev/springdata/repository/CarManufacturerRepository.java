package com.sdev.springdata.repository;

import com.sdev.springdata.entity.CarManufacturerEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@Tag(name = "Car Manufacturers Resources")
@RepositoryRestResource(collectionResourceRel = "carManufacturers",
        path = "car-manufacturers", exported = true)
public interface CarManufacturerRepository extends PagingAndSortingRepository<CarManufacturerEntity, Long> {

    @Override
    @RestResource(exported = false)
    void delete(CarManufacturerEntity entity);

    @Override
    @RestResource(exported = false)
    <S extends CarManufacturerEntity> S save(S entity);
}
