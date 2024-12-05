import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Content {
    private String id;
    private String text;
    private User author;
    private LocalDateTime timestamp;  // Timestamp when the post/comment was created

    // Constructor to initialize content

    public Content(String text, User author) {
        this.id = UUID.randomUUID().toString();  // Generates a unique ID
        this.text = text;
        this.author = author;
        this.timestamp = LocalDateTime.now();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text.length() > 1000) {
            throw new IllegalArgumentException("Text exceeds maximum allowed length.");
        }
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    // Abstract method for displaying content
    public abstract void display();
}
