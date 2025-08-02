package com.project.E_Notes.service;

import com.project.E_Notes.entity.Category;

import java.util.List;

public interface CategoryService {
    public boolean saveCategory(Category category);
    public List<Category> getAllCategories();
}
