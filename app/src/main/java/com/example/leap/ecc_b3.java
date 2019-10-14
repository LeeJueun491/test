package com.example.leap;

import android.graphics.Color;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ecc_b3 extends AppCompatActivity {
    Toolbar toolbar;

    Button bt_eccb3_water, bt_eccb3_elect, bt_eccb3_trash, bt_eccb3_elev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecc_b3);

        toolbar = (Toolbar)findViewById(R.id.toolbar_b3);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setTitle(R.string.toolbar_b3);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();

        bt_eccb3_water=(Button)findViewById(R.id.bt_eccb3_water);
        bt_eccb3_elect=(Button)findViewById(R.id.bt_eccb3_elect);
        bt_eccb3_trash=(Button)findViewById(R.id.bt_eccb3_trash);
        bt_eccb3_elev=(Button)findViewById(R.id.bt_eccb3_elev);

        bt_eccb3_water.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb3_water eccb3_water = new eccb3_water();
                transation.replace(R.id.frame_ecc_b3, eccb3_water);
            }
        });

        bt_eccb3_elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb3_elect eccb3_elect = new eccb3_elect();
                transation.replace(R.id.frame_ecc_b3, eccb3_elect);
            }
        });

        bt_eccb3_trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb3_trash eccb3_trash = new eccb3_trash();
                transation.replace(R.id.frame_ecc_b3, eccb3_trash);
            }
        });

        bt_eccb3_elev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb3_elev eccb3_elev = new eccb3_elev();
                transation.replace(R.id.frame_ecc_b3, eccb3_elev);
            }
        });
    }
}