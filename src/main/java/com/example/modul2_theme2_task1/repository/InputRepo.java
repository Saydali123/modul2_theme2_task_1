package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.Input;
import com.example.modul2_theme2_task1.projection.InputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "input", collectionResourceRel = "inputList", excerptProjection = InputProjection.class)
public interface InputRepo extends JpaRepository<Input, Long> {
}
