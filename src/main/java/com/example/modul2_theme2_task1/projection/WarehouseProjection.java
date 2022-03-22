package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.User;
import com.example.modul2_theme2_task1.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = {WareHouse.class})
public interface WarehouseProjection {

    Integer getId();

    public String getName();

    public boolean getActive();

    public Set<User> getUsers();

}
