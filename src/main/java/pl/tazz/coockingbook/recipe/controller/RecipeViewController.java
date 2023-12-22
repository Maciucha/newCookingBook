package pl.tazz.coockingbook.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.tazz.coockingbook.recipe.domain.Recipe;
import pl.tazz.coockingbook.recipe.service.CommentService;
import pl.tazz.coockingbook.recipe.service.RecipeService;

import java.util.UUID;

@Controller
@RequestMapping("/recipes")
public class RecipeViewController {

    private final RecipeService recipeService;
    private final CommentService commentService;


    public RecipeViewController(RecipeService recipeService, CommentService commentService) {
        this.recipeService = recipeService;
        this.commentService = commentService;
    }

    @GetMapping
    public String indexView(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "template";
        // return "/recipe/index";

    }

    @GetMapping("{id}")
    public String singleView(Model model, @PathVariable UUID id) {
        model.addAttribute("recipe", recipeService.getRecipe(id));
        model.addAttribute("comments", commentService.getComments(id));
        return "recipe/single";

    }

    @GetMapping("add")
    public String addView(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "recipe/add";

    }

    @PostMapping
    public String add(Recipe recipe) {
        RecipeService.createRecipe(recipe);
        return "redirect:/recipes";

    }
}
