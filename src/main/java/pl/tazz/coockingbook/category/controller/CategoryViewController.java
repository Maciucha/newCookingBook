package pl.tazz.coockingbook.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.tazz.coockingbook.category.model.Category;

import pl.tazz.coockingbook.category.service.CategoryService;
import pl.tazz.coockingbook.recipe.service.CommentService;

import java.util.UUID;

@Controller
@RequestMapping("/categories")
public class CategoryViewController {

    private final CategoryService categoryService;
    private final CommentService commentService;


    public CategoryViewController(CategoryService categoryService, CommentService commentService) {
        this.categoryService = categoryService;
        this.commentService = commentService;
    }

    @GetMapping
    public String indexView(Model model) {
        model.addAttribute("categories", categoryService.getCategories());
        // return "template";
        return "/category/index";

    }

    @GetMapping("{id}")
    public String singleView(Model model, @PathVariable UUID id) {
        model.addAttribute("category", categoryService.getCategory(id));
        model.addAttribute("comments", commentService.getComments(id));
        return "category/single";

    }

    @GetMapping("add")
    public String addView(Model model) {
        model.addAttribute("category", new Category());
        return "category/add";

    }

    @PostMapping
    public String add(Category category) {
        CategoryService.createCategory(category);
        return "redirect:/categories";

    }
}
