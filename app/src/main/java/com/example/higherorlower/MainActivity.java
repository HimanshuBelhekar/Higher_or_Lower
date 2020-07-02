package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random;

    public void generateRandomNumber(){
        random = new Random().nextInt(20) + 1;
    }

    public void guessFunction(View view){
        EditText guessNumber = (EditText) findViewById(R.id.guessNumber);
        int guess = Integer.parseInt(guessNumber.getText().toString());

        String message;

        if(guess == random){
            message = "You've got it! Play Again!";
            generateRandomNumber();
        } else if(guess < random){
            message = "Go Higher";
        } else{
            message = "Go Lower";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}