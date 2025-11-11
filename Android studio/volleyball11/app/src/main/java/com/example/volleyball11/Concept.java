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

public class Concept extends AppCompatActivity {

    private Button volleyhome;
    private Button hall;
    private Button tactical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concept);

        volleyhome = findViewById(R.id.volleyballB);

        volleyhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到註冊的介面
                Intent intent = new Intent(Concept.this,hall.class);
                startActivity(intent);
            }
        });

        hall = findViewById(R.id.game);

        hall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉到遊戲的介面
                Intent intent = new Intent(Concept.this,hall.class);
                startActivity(intent);
            }
        });

        tactical = findViewById(R.id.ground);

        tactical.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉到註冊的介面
                Intent intent = new Intent(Concept.this,tactical.class);
                startActivity(intent);
            }
        });



    }
}