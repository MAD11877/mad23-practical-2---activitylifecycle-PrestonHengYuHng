package com.example.week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.EventLogTags;

import java.util.jar.Attributes;

public class User extends AppCompatActivity {

    String Name;
    String Description;
    int Id;
    boolean Followed;

    public User(String name, String description, int id, boolean followed){
        Name = name;
        Description = description;
        Id = id;
        Followed = followed;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}