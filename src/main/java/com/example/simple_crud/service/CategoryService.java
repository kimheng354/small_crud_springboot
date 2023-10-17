package com.example.simple_crud.service;

import com.example.simple_crud.model.entity.CategoryEntity;
import com.example.simple_crud.model.request.category.CategoryRequest;
import com.example.simple_crud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final  CategoryRepository categoryRepository; // this call constructor injection from Repo

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryEntity create(CategoryRequest request){
        return this.categoryRepository.save(request.toEntity());
    }
}
