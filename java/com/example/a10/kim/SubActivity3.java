package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);
    }

    public void onClick3(View v){
        Intent intent_01 = new Intent(getApplicationContext(), SubActivity4.class);
        startActivity(intent_01);
    }
}
