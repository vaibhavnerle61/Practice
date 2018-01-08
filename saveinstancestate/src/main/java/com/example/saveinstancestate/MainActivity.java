package com.example.saveinstancestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    if(savedInstanceState !=null){


        ((TextView)findViewById(R.id.txtvw)).setText(savedInstanceState.getString("mydt"));
    }


    }


    public void onClick(View view){


    ((TextView)findViewById(R.id.txtvw)).setText(new Date().toString());
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mydt",((TextView)findViewById(R.id.txtvw)).getText().toString());
    }


    public void mydt(String msg){

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }



}
