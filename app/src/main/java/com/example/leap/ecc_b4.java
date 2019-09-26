package com.example.leap;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ecc_b4 extends AppCompatActivity {
    Toolbar toolbar;

    Button bt_eccb4_water, bt_eccb4_elect, bt_eccb4_trash, bt_eccb4_elev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();

        bt_eccb4_water=(Button)findViewById(R.id.bt_eccb4_water);
        bt_eccb4_elect=(Button)findViewById(R.id.bt_eccb4_elect);
        bt_eccb4_trash=(Button)findViewById(R.id.bt_eccb4_trash);
        bt_eccb4_elev=(Button)findViewById(R.id.bt_eccb4_elev);

        bt_eccb4_water.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb4_water eccb4_water = new eccb4_water();
                transation.replace(R.id.frame, eccb4_water);
            }
        });

        bt_eccb4_elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb4_elect eccb4_elect = new eccb4_elect();
                transation.replace(R.id.frame, eccb4_elect);
            }
        });

        bt_eccb4_trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb4_trash eccb4_trash = new eccb4_trash();
                transation.replace(R.id.frame, eccb4_trash);
            }
        });

        bt_eccb4_elev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb4_elev eccb4_elev = new eccb4_elev();
                transation.replace(R.id.frame, eccb4_elev);
            }
        });
    }
}