package com.example.switchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String command = "go east";
        switch (command) {
           case "go east": Log.i("Info", "Player moves to the east");
            break;

            case "go west": Log.i("info", "player moves west");
            break;

            case "go north": Log.i("info", "player moves north");
            break;

            case "go south": Log.i("info", "player goes south");
            break;

            default: Log.i("Info", "Sorry i don't speak elffish");
        }
    }


}
