package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub5);
    }

    public void onClick6(View v){ //게임오버
        Intent intent = new Intent(getApplicationContext(), SubActivity7.class);
        startActivity(intent);
    }

    public void onClick7(View v){
        Intent intent = new Intent(getApplicationContext(), SubActivity8.class);
        startActivity(intent);
    }
}
