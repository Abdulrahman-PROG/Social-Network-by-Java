public class Comment extends Content {
    private List<Comment> replies; // Replies to this comment

    public Comment(String id, String text, User author) {
        super(id, text, author);
        this.replies = new ArrayList<>();
    }

    public void addReply(Comment reply) {
        replies.add(reply);
    }

    @Override
    public void display() {
        System.out.println("Comment by " + getAuthor().getName() + " at " + getTimestamp());
        System.out.println("Content: " + getText());
        System.out.println("Likes: " + getLikes());  // Display the number of likes
        System.out.println("Replies:");
        for (Comment reply : replies) {
            reply.display();  // Display each reply
        }
    }
}
