package pl.tazz.coockingbook.recipe.domain;

import java.util.UUID;

public class Comment {


private UUID id;
    private String name;

    public Comment() {
    }

    public Comment(String name) {
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
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

