package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 10 on 2017-06-25.
 */

public class SubActivity1 extends AppCompatActivity{ //하나의 창이므로 상속

    @Override
    protected  void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sub1);
        TextView nameText = (TextView) findViewById(R.id.nameText); //nameText view가져오기
        Intent intent = getIntent();
        nameText.setText(intent.getStringExtra("nameText").toString());
    }
    public void onClick(View v){
        Intent intent_01 = new Intent(getApplicationContext(), Sub2Activity.class);
        startActivity(intent_01);
    }

}
