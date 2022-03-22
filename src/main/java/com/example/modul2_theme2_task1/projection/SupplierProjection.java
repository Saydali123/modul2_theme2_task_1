package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Supplier.class})
public interface SupplierProjection {

    Long getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();

}
