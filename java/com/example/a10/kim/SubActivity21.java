package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub21);
    }

    public void onClick22(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity22.class);
        startActivity(intent);
    }
}
