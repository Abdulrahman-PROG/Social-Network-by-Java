package models;

public class FriendRequest {
    private User sender , receiver;

    public FriendRequest(User sender, User receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    @Override
    public String toString() {
        return "FriendRequest{" +
                "sender=" + sender.getName() +
                ", receiver=" + receiver.getName() +
                '}';
    }
}
