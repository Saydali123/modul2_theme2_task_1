package com.example.modul2_theme2_task1.projection;

import com.example.modul2_theme2_task1.entity.Category;

public interface CategoryProjection {
    Long getId();

    String getName();

    Category getParentCategory();

    boolean getActive();
}
