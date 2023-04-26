package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonFollow(View v){
        Button button = (Button) v;
        if (User.Followed == false){
            button.setText("Unfollow");
            User.Followed = true;
        }

        else {
            button.setText("Follow");
            User.Followed = false;
        }


    }
}