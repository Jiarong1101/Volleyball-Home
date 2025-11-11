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

public class strategy extends AppCompatActivity {

    private Button hall;
    private Button train;
    private Button concept;
    private Button volleyhome;
    private Button tactical;
    private Button Friend;
    private Button Profile;
    private Button Shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);



        hall = findViewById(R.id.game);

        hall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到遊戲的介面
                Intent intent = new Intent(strategy.this,hall.class);
                startActivity(intent);
            }
        });

        train = findViewById(R.id.新手訓練);

        train.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到新手訓練的介面
                Intent intent = new Intent(strategy.this,Volleyball.class);
                startActivity(intent);
            }
        });

        concept = findViewById(R.id.站位觀念);

        concept.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到站位觀念的介面
                Intent intent = new Intent(strategy.this,Concept.class);
                startActivity(intent);
            }
        });

        volleyhome = findViewById(R.id.volleyballB);

        volleyhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到註冊的介面
                Intent intent = new Intent(strategy.this,hall.class);
                startActivity(intent);
            }
        });

        tactical = findViewById(R.id.ground);

        tactical.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到戰術表的介面
                Intent intent = new Intent(strategy.this,tactical.class);
                startActivity(intent);
            }
        });

        Friend = findViewById(R.id.friends);

        Friend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到論壇的介面
                Intent intent = new Intent(strategy.this,Friend.class);
                startActivity(intent);
            }
        });

        Profile = findViewById(R.id.profile);

        Profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到個人專區的介面
                Intent intent = new Intent(strategy.this,Profile.class);
                startActivity(intent);
            }
        });

        Shop = findViewById(R.id.shop);

        Shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(strategy.this,Shop.class);
                startActivity(intent);
            }
        });

    }
}
