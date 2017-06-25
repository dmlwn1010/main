package com.example.a10.kim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameText = (EditText) findViewById(R.id.nameText);
        Button nameButton = (Button) findViewById(R.id.nameButton);

        nameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity1.class);
                intent.putExtra("nameText", name);
                startActivity(intent);
            }
        });
    }
}