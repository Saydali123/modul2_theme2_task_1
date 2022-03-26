package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.AttachmentContent;
import com.example.modul2_theme2_task1.projection.AttachmentContentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentContent", collectionResourceRel = "attachmentContentList",
        excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentRepo extends JpaRepository<AttachmentContent, Long> {


}
