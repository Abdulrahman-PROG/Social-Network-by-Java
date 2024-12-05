import java.util.ArrayList;
import java.util.List;

public class Post extends Content {
    private List<Comment> comments;  // Comments on this post

    public Post(String id, String text, User author) {
        super(id, text, author);
        this.comments = new ArrayList<>();  // Initialize the list of comments
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public void display() {
        System.out.println("Post by " + getAuthor().getName() + " at " + getTimestamp());
        System.out.println("Content: " + getText());
        System.out.println("Comments:");
        for (Comment comment : comments) {
            comment.display();  // Display each comment
        }
    }
}
