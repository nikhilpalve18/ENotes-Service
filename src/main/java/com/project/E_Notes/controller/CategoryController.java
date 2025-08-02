package com.project.E_Notes.controller;

import com.project.E_Notes.entity.Category;
import com.project.E_Notes.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping("/save-category")
    public ResponseEntity<?> saveCategory(@RequestBody Category category){
        boolean isCategorySaved = categoryService.saveCategory(category);
        if(isCategorySaved){
            return new ResponseEntity<>("Saved successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>("Not saved",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/category")
    public ResponseEntity<?> getAllCategory(){
        List<Category> categories = categoryService.getAllCategories();
        if(CollectionUtils.isEmpty(categories)){
            return ResponseEntity.noContent().build();
        }
        else{
           return new ResponseEntity<>(categories, HttpStatus.OK);
        }
    }

}
