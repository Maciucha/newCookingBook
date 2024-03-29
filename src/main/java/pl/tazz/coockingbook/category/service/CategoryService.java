package pl.tazz.coockingbook.category.service;

import org.springframework.stereotype.Service;
import pl.tazz.coockingbook.category.domain.model.Category;
import pl.tazz.coockingbook.category.domain.repository.CategoryRepository;

import java.util.List;
import java.util.UUID;


@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategory(UUID id) {
        return categoryRepository.getReferenceById(id);
    }

    public Category createCategory(Category categoryRequest) {
        Category category = new Category();

        category.setName(categoryRequest.getName());

        return categoryRepository.save(category);
    }

    public Category updateCategory(UUID id, Category categoryRequest) {
        Category category = categoryRepository.getById(id);

        category.setName(categoryRequest.getName());

        return categoryRepository.save(category);
    }

    public void deleteCategory(UUID id) {
        categoryRepository.deleteById(id);
    }

}


