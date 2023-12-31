package com.example.simple_crud.model.response.category;

import com.example.simple_crud.model.entity.CategoryEntity;
import com.example.simple_crud.model.request.category.CategoryRequest;

import java.io.Serializable;

public class CategoryResponse implements Serializable {
    private Long id;
    private String  name ;
    private String description ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public CategoryResponse(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static   CategoryResponse fromEntity(CategoryEntity entity){
        return new   CategoryResponse(
                entity.getId(),
                entity.getName(),
                entity.getDescription()

        );
    }
}
