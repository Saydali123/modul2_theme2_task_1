package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.Client;
import com.example.modul2_theme2_task1.entity.Currency;
import com.example.modul2_theme2_task1.entity.Output;
import com.example.modul2_theme2_task1.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = {Output.class, Currency.class, WareHouse.class, Client.class})
public interface OutputProjection {
    Long getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Currency getCurrency();

    Integer getFactureNumber();

    Integer getCode();

    Client getClient();

}
