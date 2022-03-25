package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.AttachmentCollection;
import com.example.modul2_theme2_task1.projection.AttachmentCollectionProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentCollection", collectionResourceRel = "attachmentCollectionList",
        excerptProjection = AttachmentCollectionProjection.class)
public interface AttachmentCollectionRepo extends JpaRepository<AttachmentCollection, Long> {
}
