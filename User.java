package models;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username , user_id , email , password ;
    private List<User>friends ;
    private List<FriendRequest>friendRequests;


    public User(String user_id, String username, String email, String password) {
        this.username = username;
        this.user_id = user_id;
        this.email = email;
        this.password = password;
        this.friends = new ArrayList<>();
        this.friendRequests = new ArrayList<>();
    }


    public String getUserId() {
        return user_id;
    }
    public String getName() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public List<User> getFriends() {
        return friends;
    }
    public List<FriendRequest> getFriendRequests() {
        return friendRequests;
    }

    public static User signUp(String userId, String name, String email, String password) {
        System.out.println("Account created successfully for: " + name);
        return new User(userId, name, email, password);
    }

    public boolean signIn(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Sign-in successful! Welcome, " + username);
            return true;
        }
        else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }

    public void sendFriendRequest(User targetUser) {
        FriendRequest request = new FriendRequest(this, targetUser);
        targetUser.receiveFriendRequest(request);
    }

    private void receiveFriendRequest(FriendRequest request) {
        this.friendRequests.add(request);
    }

    public void acceptFriendRequest(FriendRequest request) {
        if (friendRequests.contains(request)) {
            this.friends.add(request.getSender());
            request.getSender().getFriends().add(this);
            this.friendRequests.remove(request);
        }
    }

    public void rejectFriendRequest(FriendRequest request) {
        this.friendRequests.remove(request);
    }


    @Override
    public String toString() {
        return "User{" +
                "userId='" + user_id + '\'' +
                ", name='" + username + '\'' +
                ", email='" + email + '\'' +
                ", friends=" + friends.size() +
                '}';
    }


}
