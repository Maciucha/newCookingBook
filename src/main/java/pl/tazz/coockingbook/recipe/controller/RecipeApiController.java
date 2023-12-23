package pl.tazz.coockingbook.recipe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.tazz.coockingbook.recipe.domain.Recipe;
import pl.tazz.coockingbook.recipe.service.RecipeService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeApiController {

    private final RecipeService recipeService;

    public RecipeApiController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    List<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

    @GetMapping("{id}")
    Recipe getRecipe(@PathVariable UUID id) {
        return recipeService.getRecipe(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Recipe createRecipe(@RequestBody Recipe recipe) {
        return RecipeService.createRecipe(recipe);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    Recipe updateRecipe(@PathVariable UUID id, @RequestBody Recipe recipe) {
        return recipeService.updateRecipe(id, recipe);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteRecipe(@PathVariable UUID id) {
        recipeService.deleteRecipe(id);
    }
}
