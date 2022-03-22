package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.User;
import com.example.modul2_theme2_task1.projection.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "listUsers", excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
