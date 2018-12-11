package com.example.a510.startgo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Injury_call_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.injury_call);
        setTitle("S.O.S");
        Button injury_call_119 = (Button)findViewById(R.id.injury_call_119);
        Button injury_call_112 = (Button)findViewById(R.id.injury_call_112);

        injury_call_119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Injury_solution_Activity.class);
                startActivity(intent);
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));

            }
        });
        injury_call_112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Injury_solution_Activity.class);
                startActivity(intent);
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3848-9867")));

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
