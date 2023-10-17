package com.example.simple_crud.model.request.category;


import com.example.simple_crud.model.entity.CategoryEntity;

import java.io.Serializable;

public class CategoryRequest implements Serializable {
    private String name ;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public  CategoryEntity toEntity(){
        CategoryEntity category = new CategoryEntity();
        category.setName(this.name);
        category.setDescription(this.description);
        return category ;
    };
}
