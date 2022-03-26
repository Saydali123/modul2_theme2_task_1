package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Measurement.class})
public interface MeasurementProjection {
    Long getId();

    String getName();

    boolean getActive();
}
