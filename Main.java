package main;

import gui.LoginScreen;
import models.User;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, User> users = new HashMap<>();
        new LoginScreen(users);
    }
}
