public class Comment extends Content {

    // Constructor for Comment
    public Comment(String id, String text, User author) {
        super(id, text, author);
    }

    @Override
    public void display() {
        System.out.println("Comment by " + getAuthor().getName() + " at " + getTimestamp());
        System.out.println("Content: " + getText());
    }
}

