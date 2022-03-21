package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list")
public interface WarehouseRepository extends JpaRepository<WareHouse, Long> {

}
