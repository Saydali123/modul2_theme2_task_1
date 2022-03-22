package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {User.class})
public interface UserProjection {

    Long getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    Integer getCode();
}
