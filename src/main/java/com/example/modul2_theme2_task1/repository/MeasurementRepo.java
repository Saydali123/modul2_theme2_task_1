package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.Measurement;
import com.example.modul2_theme2_task1.projection.MeasurementProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "measurementList",
        excerptProjection = MeasurementProjection.class)
public interface MeasurementRepo  extends JpaRepository<Measurement, Long> {
}
