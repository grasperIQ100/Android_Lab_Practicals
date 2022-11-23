package com.example.lab3_lifecycle_b;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lifecycleTag","called from onCreate");
        Toast.makeText(MainActivity.this,
                "called from onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();//log method and toast method.
        Log.i("lifecycleTag","called from onStart");
        Toast.makeText(MainActivity.this,
                "called from onStart", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifecycleTag","called from onResume");
        Toast.makeText(MainActivity.this,
                "called from onResume", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycleTag" ,"called from onPause");
        Toast.makeText(MainActivity.this,
                "called from onPause", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycleTag","called from onStop");
        Toast.makeText(MainActivity.this,
                "called from onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycleTag","called from onDestroy");
        Toast.makeText(MainActivity.this,
                "called from onDestroy", Toast.LENGTH_SHORT).show();

    }
}