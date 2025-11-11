package com.example.volleyball11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Friend3 extends AppCompatActivity {

    private Button hall;
    private Button Friend;
    private Button Profile;
    private Button Shop;
    private Button Friend1;
    private Button Friend2;
    private Button Friend3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend3);

        hall = findViewById(R.id.volleyballB);

        hall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到排球的介面
                Intent intent = new Intent(Friend3.this,hall.class);
                startActivity(intent);
            }
        });

        Friend = findViewById(R.id.friend1b);

        Friend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到論壇的介面
                Intent intent = new Intent(Friend3.this,Friend.class);
                startActivity(intent);
            }
        });

        Profile = findViewById(R.id.profile);

        Profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到個人專區的介面
                Intent intent = new Intent(Friend3.this,Profile.class);
                startActivity(intent);
            }
        });

        Shop = findViewById(R.id.shop);

        Shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(Friend3.this,Shop.class);
                startActivity(intent);
            }
        });

        Friend1 = findViewById(R.id.friend2);

        Friend1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(Friend3.this,Friend1.class);
                startActivity(intent);
            }
        });

        Friend2 = findViewById(R.id.friend3);

        Friend2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(Friend3.this,Friend2.class);
                startActivity(intent);
            }
        });

        Friend3 = findViewById(R.id.friend4);

        Friend3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(Friend3.this,Friend3.class);
                startActivity(intent);
            }
        });

    }
}
