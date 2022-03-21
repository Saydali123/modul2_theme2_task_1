package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.WareHouse;
import com.example.modul2_theme2_task1.projection.WarehouseProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<WareHouse, Long> {

    @RestResource(path = "exists/{id}")
    boolean existsById(Long id);

}
