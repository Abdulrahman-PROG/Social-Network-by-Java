package main;

import gui.LoginScreen;
import models.User;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        User alice = new User("Alice", "1", "alice@example.com", "password123");
        User bob = new User("Bob", "2", "bob@example.com", "password123");

        // Users send friend requests
        alice.sendFriendRequest(bob);
        bob.acceptFriendRequest(alice);

        // Alice creates a post
        alice.createPost("1", "Hello, this is my first post!");

        // Bob likes Alice's post
        bob.likeContent(alice.getPosts().get(0));

        // Bob comments on Alice's post
        Comment comment = new Comment("1", "Nice post, Alice!", bob);
        alice.getPosts().get(0).addComment(comment);

        // Bob likes the comment
        bob.likeContent(comment);

        // Display post and comment
        alice.getPosts().get(0).display();
    }
}

