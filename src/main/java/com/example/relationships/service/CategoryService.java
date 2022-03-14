package com.example.relationships.service;

import com.example.relationships.rest.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategory(Long id);
    CategoryDTO saveCategory(CategoryDTO category);
}
