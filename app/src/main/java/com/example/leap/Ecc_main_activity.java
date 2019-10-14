package com.example.leap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Ecc_main_activity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecc_main);

        final Button button_ecc_b1=(Button)findViewById(R.id.button_ecc_b1);
        final Button button_ecc_b2=(Button)findViewById(R.id.button_ecc_b2);
        final Button button_ecc_b3=(Button)findViewById(R.id.button_ecc_b3);
        final Button button_ecc_b4=(Button)findViewById(R.id.button_ecc_b4);
       // Button button5=(Button)findViewById(R.id.button5); 나중에 화면 추가하기

        button_ecc_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  view){
                Intent intent= new Intent(getApplicationContext(), ecc_b1.class);
                startActivity(intent);
            }
        });
        button_ecc_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  view){
                Intent intent= new Intent(getApplicationContext(), ecc_b2.class);
                startActivity(intent);
            }
        });
        button_ecc_b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  view){
                Intent intent= new Intent(getApplicationContext(), ecc_b3.class);
                startActivity(intent);
            }
        });
        button_ecc_b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  view){
                Intent intent= new Intent(getApplicationContext(), ecc_b4.class);
                startActivity(intent);
            }
        });



    }

}
