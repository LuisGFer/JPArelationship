package com.example.relationships.service.impl;

import com.example.relationships.model.Category;
import com.example.relationships.repository.CategoryRepository;
import com.example.relationships.rest.dto.CategoryDTO;
import com.example.relationships.rest.mapper.CategoryMapper;
import com.example.relationships.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository repository;
    CategoryMapper mapper;

    public CategoryServiceImpl(CategoryRepository repository, CategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {

        List<Category> categories = repository.findAll();
        return mapper.categoriesToCategoriesDTO(categories);
    }

    @Override
    public CategoryDTO getCategory(Long id) {
        return null;
    }

    @Override
    public CategoryDTO saveCategory(CategoryDTO category) {
        Category categoryToSave = this.mapper.categoryDTOToCategory(category);
        Category savedCategory = this.repository.save(categoryToSave);

        return this.mapper.categoryToCategoryDTO(savedCategory);
    }
}
