package pl.tazz.coockingbook.recipe.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Recipe {


    private UUID id;
    private String name;

    public Recipe() {
    }

    public Recipe(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

