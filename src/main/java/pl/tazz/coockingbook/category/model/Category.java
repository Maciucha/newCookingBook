package pl.tazz.coockingbook.category.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Category {


    private UUID id;
    private String name;

    public Category() {
    }

    public Category(String name) {
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
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
