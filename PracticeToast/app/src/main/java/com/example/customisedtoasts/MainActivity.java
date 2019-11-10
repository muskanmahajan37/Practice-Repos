package com.example.customisedtoasts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        switch(view.getId()) {
            case R.id.errorToast:
                Toasty.error(this, "Error Message", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successToast:
                Toasty.success(this, "Success Message", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoToast:
                Toasty.info(this, "Information Message", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningToast:
                Toasty.warning(this, "Warning Message", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageToast:
                Toasty.normal(this, "Project is Done", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_upload)).show();
                break;
        }
    }


}
