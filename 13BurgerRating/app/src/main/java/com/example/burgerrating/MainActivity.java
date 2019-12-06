package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);

    }
    public void submit(View view) {
        float ratingValue = ratingBar.getRating();
        if(ratingValue < 2) {
            textView.setText("Rating" + ratingValue + "\nWe will try better next time");
        }
        else if(ratingValue<=3 && ratingValue>=2) {
            textView.setText("Rating" + ratingValue + "\nWe are constantly improving");
        }
        else if(ratingValue<=4 && ratingValue>=3) {
            textView.setText("Rating" + ratingValue + "\nWe improved a bit by your feedback");
        }
        else if(ratingValue<=4.5 && ratingValue>=4) {
            textView.setText("Rating" + ratingValue + "\nWe are feeling happy that we really improved a bit :)");
        }
        else if(ratingValue<=5 && ratingValue>=4.5) {
            textView.setText("Rating" + ratingValue + "\nWe are so happy because you loved us and help us in improving well.\nWe hope to spend more time with you.\nHappy Eating");
        }
    }
}
