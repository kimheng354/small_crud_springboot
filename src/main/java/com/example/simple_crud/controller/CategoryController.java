package com.example.simple_crud.controller;


import com.example.simple_crud.model.entity.CategoryEntity;
import com.example.simple_crud.model.request.category.CategoryRequest;
import com.example.simple_crud.model.response.category.CategoryResponse;
import com.example.simple_crud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService categoryService;
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping()
    public ResponseEntity<CategoryResponse> create(@RequestBody CategoryRequest request){
        CategoryEntity category = this.categoryService.create(request);
        return ResponseEntity.ok(CategoryResponse.fromEntity(category));
    }
}
