package pl.tazz.coockingbook.category.service;

import org.springframework.stereotype.Service;
import pl.tazz.coockingbook.category.model.Category;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {


    public static Category createCategory(Category category) {
        category.setId(UUID.randomUUID());
        return category;
    }

    public List<Category> getCategories() {
        return Arrays.asList(
                new Category("Śniadania"),
                new Category("Mięsne"),
                new Category("Owoce morza"),
                new Category("Przekąski"),
                new Category("Na ostro"),
                new Category("Wegetariańskie")
        );
    }

    public Category getCategory(UUID id) {
        return new Category();
    }

    public Category updateCategory(UUID id, Category category) {
        return category;
    }

    public void deleteCategory(UUID id) {

    }

}
