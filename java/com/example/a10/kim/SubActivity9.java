package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub9);
    }

    public void onClick10(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity10.class);
        startActivity(intent);
    }
}
