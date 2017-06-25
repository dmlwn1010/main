package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);
    }

    public void onClick4(View v){
        Intent intent_01 = new Intent(getApplicationContext(), SubActivity5.class);
        startActivity(intent_01);
    }

    public void onClick5(View v){
        Intent intent_01 = new Intent(getApplicationContext(), SubActivity6.class);
        startActivity(intent_01);
    }
}
