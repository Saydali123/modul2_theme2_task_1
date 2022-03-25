package com.example.modul2_theme2_task1.repository;

import com.example.modul2_theme2_task1.entity.AttachmentContent;
import com.example.modul2_theme2_task1.entity.Currency;
import com.example.modul2_theme2_task1.projection.CurrencyProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "currencyList",
        excerptProjection = CurrencyProjection.class)
public interface CurrencyRepo extends JpaRepository<Currency, Long> {
}
