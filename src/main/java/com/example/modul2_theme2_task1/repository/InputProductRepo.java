package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.InputProduct;
import com.example.modul2_theme2_task1.projection.InputProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct", collectionResourceRel = "inputProductList",
        excerptProjection = InputProductProjection.class)
public interface InputProductRepo extends JpaRepository<InputProduct, Long> {
}
