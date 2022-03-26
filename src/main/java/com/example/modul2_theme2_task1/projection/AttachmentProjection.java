package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.AttachmentCollection;

public interface AttachmentProjection {
    AttachmentCollection getAttachmentCollection();

    Long getId();

    String getName();

    Long getSize();

    String getContentType();
}
