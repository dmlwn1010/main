package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by 10 on 2017-06-25.
 */

public class SubActivity1 extends AppCompatActivity{

    @Override
    protected  void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sub1);
        TextView nameText = (TextView) findViewById(R.id.nameText);
        Intent intent = getIntent();
        nameText.setText(intent.getStringExtra("nameText").toString());
    }
}
