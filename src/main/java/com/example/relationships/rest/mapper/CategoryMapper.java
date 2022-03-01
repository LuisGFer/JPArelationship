package com.example.relationships.rest.mapper;

import com.example.relationships.model.Category;
import com.example.relationships.rest.dto.CategoryDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface CategoryMapper {
    CategoryDTO categoryToCategoryDTO(Category category);
    List<CategoryDTO> categoriesToCategoriesDTO(List<Category> categories);
}
