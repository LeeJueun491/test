package com.example.leap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ewha_home extends AppCompatActivity {
    private Toolbar toolbar;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewha_home);

        toolbar = (Toolbar)findViewById(R.id.toolbar_home);
        toolbar.setTitle(R.string.toolbar_home);
        setSupportActionBar(toolbar);

        Button home_button_ecc = (Button) findViewById(R.id.home_button_ecc);
        Button home_button_bus = (Button) findViewById(R.id.home_button_bus);
//나중에 다른 버튼 추가하기
        home_button_ecc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ecc_main_activity.class);
                startActivity(intent);
            }
        });
        home_button_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Bus_Activity.class);
                startActivity(intent);
            }
        });

    }
    }
