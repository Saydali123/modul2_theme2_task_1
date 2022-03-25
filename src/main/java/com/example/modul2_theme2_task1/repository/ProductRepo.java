package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.Product;
import com.example.modul2_theme2_task1.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "productList", excerptProjection = ProductProjection.class)
public interface ProductRepo extends JpaRepository<Product, Long> {


}
