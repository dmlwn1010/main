package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub13);
    }

    public  void onClick6(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity7.class);
        startActivity(intent);
    }

    public void onClick14(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity14.class);
        startActivity(intent);
    }
}
