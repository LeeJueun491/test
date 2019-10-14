package com.example.leap;

import android.graphics.Color;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ecc_b2 extends AppCompatActivity {
    Toolbar toolbar;

    Button bt_eccb2_water, bt_eccb2_elect, bt_eccb2_trash, bt_eccb2_elev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecc_b2);

        toolbar = (Toolbar)findViewById(R.id.toolbar_b2);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setTitle(R.string.toolbar_b2);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();

        bt_eccb2_water=(Button)findViewById(R.id.bt_eccb2_water);
        bt_eccb2_elect=(Button)findViewById(R.id.bt_eccb2_elect);
        bt_eccb2_trash=(Button)findViewById(R.id.bt_eccb2_trash);
        bt_eccb2_elev=(Button)findViewById(R.id.bt_eccb2_elev);

        bt_eccb2_water.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb2_water eccb2_water = new eccb2_water();
                transation.replace(R.id.frame_ecc_b2, eccb2_water);
            }
        });

        bt_eccb2_elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb2_elect eccb2_elect = new eccb2_elect();
                transation.replace(R.id.frame_ecc_b2, eccb2_elect);
            }
        });

        bt_eccb2_trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb2_trash eccb2_trash = new eccb2_trash();
                transation.replace(R.id.frame_ecc_b2, eccb2_trash);
            }
        });

        bt_eccb2_elev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb2_elev eccb2_elev = new eccb2_elev();
                transation.replace(R.id.frame_ecc_b2, eccb2_elev);
            }
        });
    }
}