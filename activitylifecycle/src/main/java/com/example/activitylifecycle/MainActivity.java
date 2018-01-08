package com.example.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mt("Oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        mt("OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mt("OnResume");
    }

    @Override
    protected void onPause() {
        mt("Onpause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        mt("Onstop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        mt("Ondestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mt("OnRestart");

    }

    private void mt(String msg){
Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }

}
