package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Sub2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
    }
    public void onClick2(View v){
        Intent intent_01 = new Intent(getApplicationContext(), SubActivity3.class);
        startActivity(intent_01);
    }
}
