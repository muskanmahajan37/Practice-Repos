package com.example.dodiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageDice1, imageDice2;
    private Button enterButton;
    private Random randomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageDice1 = findViewById(R.id.imageView);
        imageDice2 = findViewById(R.id.imageView2);
        enterButton = findViewById(R.id.enterBtn);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    private void rollDice() {
        int diceNumber = randomNumber.nextInt(6) + 1;
        int diceNumber2 = randomNumber.nextInt(6) + 1;
        switch (diceNumber) {
            case 1:
                imageDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDice1.setImageResource(R.drawable.dice6);
                break;
        }

        switch (diceNumber2) {
            case 1:
                imageDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDice2.setImageResource(R.drawable.dice6);
                break;
        }

    }
}
