package pl.tazz.coockingbook.recipe.service;

import org.springframework.stereotype.Service;
import pl.tazz.coockingbook.recipe.domain.Comment;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class CommentService {
    public static Comment createComment(UUID commentId, Comment comment) {
        return null;
    }

    public List<Comment> getComments(UUID recipeId) {
        return Arrays.asList(
                new Comment("Komentarz 1"),
                new Comment("Komentarz 2"),
                new Comment("Komentarz 3"));
    }

    public Comment getComment(UUID id) {
        return new Comment("Komentarz " + id);
    }

    public Comment updateComment(UUID commentId, Comment comment) {
        return null;
    }

    public void deleteComment(UUID commentId) {

    }
}
