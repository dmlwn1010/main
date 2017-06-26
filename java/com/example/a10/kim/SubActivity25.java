package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub25);
    }

    public void onClick27(View v){
        Intent intent = new Intent(getApplicationContext(), SUbActivity27.class);
        startActivity(intent);
    }
}
