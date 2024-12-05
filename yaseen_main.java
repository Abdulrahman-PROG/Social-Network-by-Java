package main;

import models.User;
import models.FriendRequest;

public class yaseen_main {
    public static void main(String[] args) {
        // Sign up two users
        User user1 = User.signUp("1", "Yaseen", "yaseen@gmail.com", "password123");
        User user2 = User.signUp("2", "Abdulrahman", "elbanna@gmail.com", "mypassword");

        // Sign in with correct credentials
        System.out.println("Attempting to sign in as Yaseen...");
        boolean isYaseenSignedIn = user1.signIn("yaseen@gmail.com", "password123");
        System.out.println("Sign-in status: " + isYaseenSignedIn);

        // Attempt to sign in with incorrect credentials
        System.out.println("\nAttempting to sign in with incorrect credentials...");
        boolean isInvalidSignIn = user2.signIn("elbanna@gmail.com", "wrongpassword");
        System.out.println("Sign-in status: " + isInvalidSignIn);

        // Sending friend request
        System.out.println("\nYaseen sends a friend request to Abdulrahman...");
        user1.sendFriendRequest(user2);
        System.out.println("Abdulrahman's friend requests: " + user2.getFriendRequests());

        // Accepting friend request
        FriendRequest request = user2.getFriendRequests().get(0);
        System.out.println("Abdulrahman accepts Yaseen's friend request...");
        user2.acceptFriendRequest(request);

        // Display friends
        System.out.println("Yaseen's friends: " + user1.getFriends());
        System.out.println("Abdulrahman's friends: " + user2.getFriends());
    }
}
