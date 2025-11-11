package com.example.volleyball11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Forget extends AppCompatActivity {

    private Button forget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget);


        forget = findViewById(R.id.forget_btn);

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳轉到忘記密碼的介面
                Intent intent = new Intent(Forget.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
