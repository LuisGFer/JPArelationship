package com.example.relationships.rest;

import com.example.relationships.rest.dto.ItemDTO;
import com.example.relationships.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/item")
public class ItemController {
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping()
    public ResponseEntity<List<ItemDTO>> getAllItems() {
        return  ResponseEntity.ok(this.itemService.getAllItems());
    }

    @GetMapping("/:id")
    public ResponseEntity<ItemDTO> getItemById(@RequestParam Long id) {
        return null;
    }
}
