package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub22);
    }

    public void onClick23(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity23.class);
        startActivity(intent);
    }
}
