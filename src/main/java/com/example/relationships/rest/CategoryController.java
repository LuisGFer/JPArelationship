package com.example.relationships.rest;

import com.example.relationships.rest.dto.CategoryDTO;
import com.example.relationships.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        List<CategoryDTO> categories = this.categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @PostMapping()
    public ResponseEntity<CategoryDTO> saveCategory(@RequestBody CategoryDTO category) {
        CategoryDTO resultCategory = this.categoryService.saveCategory(category);

        return ResponseEntity.ok(resultCategory);

    }

    @GetMapping("/:id")
    public ResponseEntity<CategoryDTO> getCategoryById(@RequestParam Long id) {
        return null;
    }
}
