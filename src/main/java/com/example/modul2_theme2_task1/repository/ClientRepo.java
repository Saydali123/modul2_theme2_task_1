package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.Client;
import com.example.modul2_theme2_task1.projection.ClientProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "clientList",
        excerptProjection = ClientProjection.class)
public interface ClientRepo extends JpaRepository<Client, Long> {
}
