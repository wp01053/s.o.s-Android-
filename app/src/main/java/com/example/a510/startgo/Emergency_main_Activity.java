package com.example.a510.startgo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Emergency_main_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_main);
        setTitle("S.O.S");
        ImageView stroke = (ImageView)findViewById(R.id.stroke);
        ImageView respiration = (ImageView)findViewById(R.id.respiration);
        ImageView heartstop = (ImageView)findViewById(R.id.heartStop);
        ImageView injury = (ImageView)findViewById(R.id.injury);

        stroke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Stroke_solution_Activity.class);
                startActivity(intent);
            }
        });

        respiration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Respiration_solution_Activity.class);
                startActivity(intent);
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));

            }
        });

        heartstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Heart_stop_section_Activity.class);
                startActivity(intent);
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));

            }
        });

        injury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Injury_call_Activity.class);
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
};