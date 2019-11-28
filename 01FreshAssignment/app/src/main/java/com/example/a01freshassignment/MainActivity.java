package com.example.a01freshassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redPressed(View view) {
//        Context context = getApplicationContext();
//        CharSequence text = "Hello Blue";
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

        Toast.makeText(this, "Hello from Red -- shorter", Toast.LENGTH_SHORT).show();
    }

    public void bluePressed(View view) {
//        Context context = getApplicationContext();
//        CharSequence text = "Hello Red";
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

        Toast.makeText(this, "Hello from Blue -- shorter", Toast.LENGTH_SHORT).show();
    }
}
