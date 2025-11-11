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

public class ServerTrain3 extends AppCompatActivity {

    private Button volleyhome;
    private Button Friend;
    private Button Profile;
    private Button Shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game3);

        volleyhome = findViewById(R.id.volleyballB);

        volleyhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到註冊的介面
                Intent intent = new Intent(ServerTrain3.this,hall.class);
                startActivity(intent);
            }
        });

        Friend = findViewById(R.id.friends);

        Friend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到論壇的介面
                Intent intent = new Intent(ServerTrain3.this,Friend.class);
                startActivity(intent);
            }
        });

        Profile = findViewById(R.id.profile);

        Profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到個人專區的介面
                Intent intent = new Intent(ServerTrain3.this,Profile.class);
                startActivity(intent);
            }
        });

        Shop = findViewById(R.id.shop);

        Shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(ServerTrain3.this,Shop.class);
                startActivity(intent);
            }
        });


    }
}