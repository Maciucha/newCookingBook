package pl.tazz.coockingbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recipes")
public class RecipesController {

    private final RecipesService recipesService;

    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @GetMapping
    List<Recipe> getRecipes() {
        return recipesService.getRecipes();
    }
    @GetMapping("/test")
    String test(@RequestParam String value){
        return recipesService.test(value);

    }
}
