package pl.tazz.coockingbook.recipe.domain;

import java.util.UUID;

public class Recipe {


private UUID id;
    private String name;

    public Recipe() {
    }

    public Recipe(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
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

