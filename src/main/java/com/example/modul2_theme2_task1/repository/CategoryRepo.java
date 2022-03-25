package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.Category;
import com.example.modul2_theme2_task1.projection.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "categoryList",
        excerptProjection = CategoryProjection.class)
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
