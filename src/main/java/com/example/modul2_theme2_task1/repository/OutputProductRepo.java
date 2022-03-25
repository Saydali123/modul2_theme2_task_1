package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.OutputProduct;
import com.example.modul2_theme2_task1.projection.OutputProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "outputProductList",
        excerptProjection = OutputProductProjection.class)
public interface OutputProductRepo extends JpaRepository<OutputProduct, Long> {
}
