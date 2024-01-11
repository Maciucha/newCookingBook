package pl.tazz.coockingbook.category.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.UUID;


@Getter
@Entity
@Table(name = "categories")
public class Category {

    @Id
    private UUID id;
    private String name;


    public Category() {
        this.id = UUID.randomUUID();
    }

    public Category(String name) {
        this.name = name;
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
