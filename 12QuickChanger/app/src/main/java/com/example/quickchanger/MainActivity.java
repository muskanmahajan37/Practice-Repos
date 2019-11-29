package com.example.quickchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.rgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch(i) {
                    case R.id.rBtnBlue:
                        layout.setBackgroundColor(Color.parseColor("#2475B0"));
                        break;
                    case R.id.rBtnGreen:
                        layout.setBackgroundColor(Color.parseColor("#45CE30"));
                        break;
                    case R.id.rBtnRed:
                        layout.setBackgroundColor(Color.parseColor("#FF3031"));
                        break;

                }
            }
        });


    }
}
