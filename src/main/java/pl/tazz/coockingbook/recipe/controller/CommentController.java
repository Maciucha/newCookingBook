package pl.tazz.coockingbook.recipe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.tazz.coockingbook.recipe.model.Comment;
import pl.tazz.coockingbook.recipe.service.CommentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/recipes/{recipe-id}/comments")
public class CommentController {

    /**
     * CRUD - dobra praktyka z mapowaniem
     * <p>
     * Create
     * POST /recipes
     * <p>
     * Read
     * GET /recipes - all
     * GET /recipes/[id] - wybrany
     * <p>
     * Update
     * PUT /recipes/[id]
     * <p>
     * Delete
     * DELETE /recipes/[id]
     */


    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    List<Comment> getComments(@PathVariable("recipe-id") UUID recipeId) {
        return commentService.getComments(recipeId);
    }

    @GetMapping("{comment-id}")
    Comment getComment(@PathVariable("recipe-id") UUID recipeId, @PathVariable("comment-id") UUID commentId) {
        return commentService.getComment(commentId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Comment createComment(@PathVariable("recipe-id") UUID recipeId, @RequestBody Comment comment) {
        return CommentService.createComment(recipeId, comment);
    }

    @PutMapping("{comment-id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    Comment updateComment(@PathVariable("recipe-id") UUID recipeId, @PathVariable("comment-id") UUID commentId,
                          @RequestBody Comment comment) {
        return commentService.updateComment(commentId, comment);
    }

    @DeleteMapping("{comment-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteComment( @PathVariable("comment-id") UUID commentId) {
        commentService.deleteComment(commentId);
    }
}
