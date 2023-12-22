package pl.tazz.coockingbook.recipe.service;

import org.springframework.stereotype.Service;
import pl.tazz.coockingbook.recipe.domain.Recipe;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class RecipeService {


    public static Recipe createRecipe(Recipe recipe) {
        recipe.setId(UUID.randomUUID());
        return recipe;
    }

    public List<Recipe> getRecipes() {
        return Arrays.asList(new Recipe("Babeczki marchewkowe"), new Recipe("Jabłecznik"));
    }

    public Recipe getRecipe(UUID id) {
        return new Recipe("Przepis - id: " + id);
    }

    public Recipe updateRecipe(UUID id, Recipe recipe) {
        return recipe;
    }

    public void deleteRecipe(UUID id) {

    }
}
