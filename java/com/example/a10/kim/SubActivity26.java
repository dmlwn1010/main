package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub26);
    }

    public void onClick28(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity28.class);
        startActivity(intent);
    }
}
