package com.example.nealbhaktaassignment2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

    }


    public void countUp (View v) {

        int num = Integer.parseInt(editText.getText().toString());

      if (num >= 1 && num <= 10) {
            while (true){
                num++;
                break;
            }
            Toast.makeText(MainActivity.this, num , Toast.LENGTH_SHORT).show();
      }
      else {
          Toast.makeText(getApplicationContext(),"Please enter a number between 1 and 10", Toast.LENGTH_SHORT).show();
      }
    }

    public void countDown (View v) {
        int num = Integer.parseInt(editText.getText().toString());
        if (num >= 1 && num <= 10) {
            while (true){
                num--;
                Toast.makeText(MainActivity.this,num, Toast.LENGTH_SHORT).show();
                break;
            }
        }
        else {Toast.makeText(MainActivity.this,("Please enter a number between 1 and 10"),Toast.LENGTH_SHORT).show();}
    }
}
