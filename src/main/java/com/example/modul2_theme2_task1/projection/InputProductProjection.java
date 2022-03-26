package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.Input;
import com.example.modul2_theme2_task1.entity.Product;

import java.sql.Timestamp;

public interface InputProductProjection {
    Long getId();

    Product getProduct();

    double getAmount();

    double getPrice();

    Timestamp getExpireDate();

    Input getInput();
}
