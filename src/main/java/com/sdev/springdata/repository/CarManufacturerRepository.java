package com.sdev.springdata.repository;

import com.sdev.springdata.entity.CarManufacturerEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@Tag(name = "Car Manufacturers Resources")
@RepositoryRestResource(collectionResourceRel = "carManufacturers", path = "car-manufacturers",
        exported = true)
public interface CarManufacturerRepository extends PagingAndSortingRepository<CarManufacturerEntity, Long> {

//    @Override
//    @RestResource(path = "/all", exported = true, rel = "All Manufacturers Details")
//    Iterable<CarManufacturerEntity> findAll();

    @RestResource(exported = false)
    @Override
    void delete(CarManufacturerEntity entity);

    @RestResource(exported = false)
    @Override
    <S extends CarManufacturerEntity> S save(S entity);
}
