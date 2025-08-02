package com.project.E_Notes.service.impl;

import com.project.E_Notes.entity.Category;
import com.project.E_Notes.repository.CategoryRepository;
import com.project.E_Notes.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public boolean saveCategory(Category category){
        category.setCreatedDt(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
        Category cat = categoryRepository.save(category);
        return !ObjectUtils.isEmpty(cat);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
