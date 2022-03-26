package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.Output;
import com.example.modul2_theme2_task1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {OutputProjection.class})
public interface OutputProductProjection {
    Long getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    Output getOutput();

    boolean getActive();
}
