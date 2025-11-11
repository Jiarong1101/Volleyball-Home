package com.example.volleyball11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class tactical extends AppCompatActivity {

    private Button hall;
    private Button volleyhome;
    private Button strategy;
    private Button Friend;
    private Button Profile;
    private Button Shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tactical);

        DraggableButton btHello = findViewById(R.id.red1);
        btHello.setOnClickListener(v->{
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        });


        strategy = findViewById(R.id.strategyB);

        strategy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到註冊的介面
                Intent intent = new Intent(tactical.this,strategy.class);
                startActivity(intent);
            }
        });

        volleyhome = findViewById(R.id.volleyballB);

        volleyhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到註冊的介面
                Intent intent = new Intent(tactical.this,hall.class);
                startActivity(intent);
            }
        });

        hall = findViewById(R.id.game);

        hall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到遊戲的介面
                Intent intent = new Intent(tactical.this,hall.class);
                startActivity(intent);
            }
        });

        Friend = findViewById(R.id.friends);

        Friend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到論壇的介面
                Intent intent = new Intent(tactical.this,Friend.class);
                startActivity(intent);
            }
        });

        Profile = findViewById(R.id.profile);

        Profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到個人專區的介面
                Intent intent = new Intent(tactical.this,Profile.class);
                startActivity(intent);
            }
        });

        Shop = findViewById(R.id.shop);

        Shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到商店的介面
                Intent intent = new Intent(tactical.this,Shop.class);
                startActivity(intent);
            }
        });



    }
}

