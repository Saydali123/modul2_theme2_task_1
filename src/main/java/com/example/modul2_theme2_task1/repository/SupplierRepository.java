package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.Supplier;
import com.example.modul2_theme2_task1.projection.SupplierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "listSuppliers", excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
