package com.example.modul2_theme2_task1.controller;

import com.example.modul2_theme2_task1.repository.AttachmentContentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public class AttachmentController {

    @Autowired
    AttachmentContentRepo repository;



}
