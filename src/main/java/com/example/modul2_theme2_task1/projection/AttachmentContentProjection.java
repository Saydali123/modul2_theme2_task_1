package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.Attachment;

public interface AttachmentContentProjection {
    Long getId();

    byte[] getBytes();

    Attachment getAttachment();
}
