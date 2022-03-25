package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.Output;
import com.example.modul2_theme2_task1.projection.OutputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", collectionResourceRel = "outputList", excerptProjection = OutputProjection.class)
public interface OutputRepo extends JpaRepository<Output, Long> {
}
