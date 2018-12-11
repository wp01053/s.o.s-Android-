package com.example.a510.startgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Heart_stop_section_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heart_stop_section);
        setTitle("S.O.S");
        Button heart_run_A = (Button) findViewById(R.id.heart_run_A);
        Button heart_run_B = (Button) findViewById(R.id.heart_run_B);
        Button heart_run_C = (Button) findViewById(R.id.heart_run_C);
        Button heart_run_D = (Button) findViewById(R.id.heart_run_D);
        Button heart_run_E = (Button) findViewById(R.id.heart_run_E);
        Button heart_run_F = (Button) findViewById(R.id.heart_run_F);
        Button heart_run_G = (Button) findViewById(R.id.heart_run_G);
        Button heart_run_H = (Button) findViewById(R.id.heart_run_H);

        heart_run_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Heart_stop_solution_Activity.class);
                startActivity(intent);
            }
        });
        heart_run_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Heart_stop_solution_Activity.class);
                startActivity(intent);
            }
        });
        heart_run_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Heart_stop_solution_Activity.class);
                startActivity(intent);
            }
        });
        heart_run_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Heart_stop_solution_Activity.class);
                startActivity(intent);
            }
        });
        heart_run_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Heart_stop_solution_Activity.class);
                startActivity(intent);
            }
        });
        heart_run_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Heart_stop_solution_Activity.class);
                startActivity(intent);
            }
        });
        heart_run_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Heart_stop_solution_Activity.class);
                startActivity(intent);
            }
        });
        heart_run_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Heart_stop_solution_Activity.class);
                startActivity(intent);
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuItem1:
                Intent intent = new Intent(getApplicationContext(),First_main_Activity.class);
                startActivity(intent);
                return true;
            case R.id.menuItem2:
                return true;
        }
        return false;
    }
}