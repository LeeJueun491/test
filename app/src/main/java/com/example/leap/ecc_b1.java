package com.example.leap;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class ecc_b1 extends AppCompatActivity {

    Button bt_eccb1_water, bt_eccb1_elect, bt_eccb1_trash, bt_eccb1_elev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_eccb1_water=(Button)findViewById(R.id.bt_eccb1_water);
        bt_eccb1_elect=(Button)findViewById(R.id.bt_eccb1_elect);
        bt_eccb1_trash=(Button)findViewById(R.id.bt_eccb1_trash);
        bt_eccb1_elev=(Button)findViewById(R.id.bt_eccb1_elev);

        bt_eccb1_water.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb1_water eccb1_water = new eccb1_water();
                transation.replace(R.id.frame, eccb1_water);
            }
        });

        bt_eccb1_elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb1_elect eccb1_elect = new eccb1_elect();
                transation.replace(R.id.frame, eccb1_elect);
            }
        });

        bt_eccb1_trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb1_trash eccb1_trash = new eccb1_trash();
                transation.replace(R.id.frame, eccb1_trash);
            }
        });

        bt_eccb1_elev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                FragmentTransaction transation = getSupportFragmentManager().beginTransaction();
                eccb1_elev eccb1_elev = new eccb1_elev();
                transation.replace(R.id.frame, eccb1_elev);
            }
        });
    }
}