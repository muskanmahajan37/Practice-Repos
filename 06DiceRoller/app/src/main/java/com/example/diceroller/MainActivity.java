package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageDicy;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageDicy = findViewById(R.id.imageView);

        imageDicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    private void rollDice() {
        int myDiceNumber = myRandomNumber.nextInt(6) + 1;

        switch (myDiceNumber) {
            case 1:
                imageDicy.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDicy.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDicy.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDicy.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDicy.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDicy.setImageResource(R.drawable.dice6);
                break;
        }
    }
}














