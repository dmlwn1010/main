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

        final EditText nameText = (EditText) findViewById(R.id.nameText); //입력한 이름 저장하는 객체
        Button nameButton = (Button) findViewById(R.id.nameButton); //이름값 전달 버튼

        nameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = nameText.getText().toString();  //nameText에서 text 가져와 name에 저장
                Intent intent = new Intent(getApplicationContext(), SubActivity1.class); //새로운 창 열 때 필요한 객체 intent
                intent.putExtra("nameText", name);
                startActivity(intent); //만들어진 intent실행
            }
        });
    }
}