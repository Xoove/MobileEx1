package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToastAndLog("Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToastAndLog("Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToastAndLog("Started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToastAndLog("Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToastAndLog("Started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToastAndLog("Destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToastAndLog("Restarted");
    }

    private void showToastAndLog(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.e(TAG, message);
        Log.w(TAG, message);
        Log.i(TAG, message);
        Log.d(TAG, message);
        Log.v(TAG, message);
    }
}