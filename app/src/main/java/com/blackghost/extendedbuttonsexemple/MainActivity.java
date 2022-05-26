package com.blackghost.extendedbuttonsexemple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Log.e(TAG, "onClick");
    }

    public void onConfirmPressed(View view) {
        Log.e(TAG, "onConfirmPressed");
    }

}