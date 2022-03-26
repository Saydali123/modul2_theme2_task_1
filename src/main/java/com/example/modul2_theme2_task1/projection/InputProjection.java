package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.Currency;
import com.example.modul2_theme2_task1.entity.Supplier;
import com.example.modul2_theme2_task1.entity.WareHouse;

import java.sql.Timestamp;

public interface InputProjection {

    Long getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency getCurrency();

    Integer getFactureNumber();
}
