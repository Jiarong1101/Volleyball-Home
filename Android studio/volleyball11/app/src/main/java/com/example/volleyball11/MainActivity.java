package com.example.volleyball11;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    private Button forget;
    private Button register;
    private Button hall;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
            }
        });

        register = findViewById(R.id.Registerbtn);

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到註冊的介面
                Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });

        forget = findViewById(R.id.forgotpassbtn);

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳轉到忘記密碼的介面
                Intent intent = new Intent(MainActivity.this,Forget.class);
                startActivity(intent);
            }
        });

        hall = findViewById(R.id.loginbtn);

        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳轉到大廳的介面
                Intent intent = new Intent(MainActivity.this,hall.class);
                startActivity(intent);
            }
        });


    }
}