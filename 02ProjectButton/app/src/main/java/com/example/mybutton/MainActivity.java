package com.example.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    //Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button = findViewById(R.id.mybtn);
        button2 = findViewById(R.id.mybtn2);
        //button3 = findViewById(R.id.mybtn3);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("TEST", "Clicked");  // d means debug
//            }
//        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TEST", "Clicked2");
            }
        });

//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("TEST", "Clicked3");
//            }
//        });
    }

    public void BluePressed(View view) {
//        Log.d("BLUE", "Clicked via method");

//        Context context = getApplicationContext();
//        CharSequence text = "Hello from Blue";    //CharSequence == String
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

        Toast.makeText(this, "Hello from blue -- shorter", Toast.LENGTH_SHORT).show();
    }

    public void RedPressed(View view)  {
        Log.d("RED", "Clicked via Red Method");
    }
}
