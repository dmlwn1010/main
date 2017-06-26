package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub24);
    }

    public void onClick25(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity25.class);
        startActivity(intent);
    }

    public void onClick26(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity26.class);
        startActivity(intent);
    }
}
