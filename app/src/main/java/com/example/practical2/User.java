package com.example.practical2;

public class User {
    static String Name;
    static String Description;
    static int Id;
    static boolean Followed;

    public User(String name, String description, int id) {
        Name = name;
        Description = description;
        Id = id;
        Followed = false;
    }
}
