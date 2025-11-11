package com.example.volleyball11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Volleyball extends AppCompatActivity {

    private Button server;
    private Button volleyhome;
    private Button hall;
    private Button Friend;
    private Button Profile;
    private Button Shop;
    private Button tactical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volleyball);


        server = findViewById(R.id.servetrain);

        server.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到發球訓練的教學
                Intent intent = new Intent(Volleyball.this,ServerTrain1.class);
                startActivity(intent);
            }
        });

        volleyhome = findViewById(R.id.volleyballB);

        volleyhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到註冊的介面
                Intent intent = new Intent(Volleyball.this,hall.class);
                startActivity(intent);
            }
        });

        hall = findViewById(R.id.game);

        hall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到遊戲的介面
                Intent intent = new Intent(Volleyball.this,hall.class);
                startActivity(intent);
            }
        });

        Friend = findViewById(R.id.friends);

        Friend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到論壇的介面
                Intent intent = new Intent(Volleyball.this,Friend.class);
                startActivity(intent);
            }
        });

        Profile = findViewById(R.id.profile);

        Profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到個人專區的介面
                Intent intent = new Intent(Volleyball.this,Profile.class);
                startActivity(intent);
            }
        });

        Shop = findViewById(R.id.shop);

        Shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(Volleyball.this,Shop.class);
                startActivity(intent);
            }
        });

        tactical = findViewById(R.id.ground);

        tactical.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到註冊的介面
                Intent intent = new Intent(Volleyball.this,tactical.class);
                startActivity(intent);
            }
        });


    }
}