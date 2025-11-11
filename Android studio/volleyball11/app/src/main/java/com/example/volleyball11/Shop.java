package com.example.volleyball11;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Shop extends AppCompatActivity {

    private Button hall;
    private Button Profile;
    private Button Shop;
    private Button Friend;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);

        hall = findViewById(R.id.volleyballB);

        hall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到排球的介面
                Intent intent = new Intent(Shop.this,hall.class);
                startActivity(intent);
            }
        });

        Friend = findViewById(R.id.friends);

        Friend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到論壇的介面
                Intent intent = new Intent(Shop.this,Friend.class);
                startActivity(intent);
            }
        });

        Profile = findViewById(R.id.profile);

        Profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到個人專區的介面
                Intent intent = new Intent(Shop.this,Profile.class);
                startActivity(intent);
            }
        });

        Shop = findViewById(R.id.shop);

        Shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(Shop.this,Shop.class);
                startActivity(intent);
            }
        });



    }
}
