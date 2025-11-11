package com.example.volleyball11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class hall extends AppCompatActivity {

    private Button strategy;
    private Button tactical;
    private Button hall;
    private Button Profile;
    private Button Shop;
    private Button Friend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hall);

        strategy = findViewById(R.id.strategyB);

        strategy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到註冊的介面
                Intent intent = new Intent(hall.this,strategy.class);
                startActivity(intent);
            }
        });

        hall = findViewById(R.id.volleyballB);

        hall.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v){
              //跳轉到排球的介面
              Intent intent = new Intent(hall.this,hall.class);
              startActivity(intent);
          }
        });

        tactical = findViewById(R.id.ground);

        tactical.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到註冊的介面
                Intent intent = new Intent(hall.this,tactical.class);
                startActivity(intent);
            }
        });

        Friend = findViewById(R.id.friends);

        Friend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到論壇的介面
                Intent intent = new Intent(hall.this,Friend.class);
                startActivity(intent);
            }
        });

        Profile = findViewById(R.id.profile);

        Profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到個人專區的介面
                Intent intent = new Intent(hall.this,Profile.class);
                startActivity(intent);
            }
        });

        Shop = findViewById(R.id.shop);

        Shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(hall.this,Shop.class);
                startActivity(intent);
            }
        });


    }
}
