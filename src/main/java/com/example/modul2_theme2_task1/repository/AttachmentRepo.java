package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.Attachment;
import com.example.modul2_theme2_task1.projection.AttachmentProjection;
import com.example.modul2_theme2_task1.projection.CurrencyProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "attachmentList",
        excerptProjection = AttachmentProjection.class)
public interface AttachmentRepo extends JpaRepository<Attachment, Long> {
}
