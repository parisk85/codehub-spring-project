package gr.codehub.teamb.acmeshop.controller;

import gr.codehub.teamb.acmeshop.domain.Category;
import gr.codehub.teamb.acmeshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/acmeshop/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/category")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity
                .ok()
                .body(categoryService.getAllCategories());
    }

    @GetMapping(value = "/category/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        return ResponseEntity
                .ok()
                .body(categoryService.getCatgoryById(id));
    }
}
