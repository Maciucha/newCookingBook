package pl.tazz.coockingbook;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RecipesService {

    private final CoockingBookConfiguration coockingBookConfiguration;

    public RecipesService(CoockingBookConfiguration coockingBookConfiguration) {
        this.coockingBookConfiguration = coockingBookConfiguration;
    }

    public List<Recipe> getRecipes() {
        return Arrays.asList(
                new Recipe("Babeczki marchewkowe"),
                new Recipe("Jabłecznik"));
    }

    public String test(String value) {
        return String.format("To ja: %s %s", coockingBookConfiguration.getName(), value);
    }
}
