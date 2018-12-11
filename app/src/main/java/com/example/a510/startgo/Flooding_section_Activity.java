package com.example.a510.startgo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Flooding_section_Activity extends AppCompatActivity {
    View dialogView;

    Integer[] run_root = {R.drawable.run1, R.drawable.run2, R.drawable.run3, R.drawable.run4, R.drawable.run5, R.drawable.run6, R.drawable.run7, R.drawable.run8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flooding_section);
        setTitle("S.O.S");
        Button flooding_run_A = (Button) findViewById(R.id.flooding_run_A);
        Button flooding_run_B = (Button) findViewById(R.id.flooding_run_B);
        Button flooding_run_C = (Button) findViewById(R.id.flooding_run_C);
        Button flooding_run_D = (Button) findViewById(R.id.flooding_run_D);
        Button flooding_run_E = (Button) findViewById(R.id.flooding_run_E);
        Button flooding_run_F = (Button) findViewById(R.id.flooding_run_F);
        Button flooding_run_G = (Button) findViewById(R.id.flooding_run_G);
        Button flooding_run_H = (Button) findViewById(R.id.flooding_run_H);


        flooding_run_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));
                dialogView = (View) View.inflate(Flooding_section_Activity.this, R.layout.run_root, null);
                ImageView runRoot = (ImageView) dialogView.findViewById(R.id.fire_run_root);
                runRoot.setImageResource(run_root[0]);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Flooding_section_Activity.this);
                dlg.setTitle("가장 빠른 대피로");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();

            }
        });
        flooding_run_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));
                dialogView = (View) View.inflate(Flooding_section_Activity.this, R.layout.run_root, null);
                ImageView runRoot = (ImageView) dialogView.findViewById(R.id.fire_run_root);
                runRoot.setImageResource(run_root[1]);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Flooding_section_Activity.this);
                dlg.setTitle("가장 빠른 대피로");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();

            }
        });
        flooding_run_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));
                dialogView = (View) View.inflate(Flooding_section_Activity.this, R.layout.run_root, null);
                ImageView runRoot = (ImageView) dialogView.findViewById(R.id.fire_run_root);
                runRoot.setImageResource(run_root[2]);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Flooding_section_Activity.this);
                dlg.setTitle("가장 빠른 대피로");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();

            }
        });
        flooding_run_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));
                dialogView = (View) View.inflate(Flooding_section_Activity.this, R.layout.run_root, null);
                ImageView runRoot = (ImageView) dialogView.findViewById(R.id.fire_run_root);
                runRoot.setImageResource(run_root[3]);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Flooding_section_Activity.this);
                dlg.setTitle("가장 빠른 대피로");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();

            }
        });
        flooding_run_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));
                dialogView = (View) View.inflate(Flooding_section_Activity.this, R.layout.run_root, null);
                ImageView runRoot = (ImageView) dialogView.findViewById(R.id.fire_run_root);
                runRoot.setImageResource(run_root[4]);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Flooding_section_Activity.this);
                dlg.setTitle("가장 빠른 대피로");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();

            }
        });
        flooding_run_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));
                dialogView = (View) View.inflate(Flooding_section_Activity.this, R.layout.run_root, null);
                ImageView runRoot = (ImageView) dialogView.findViewById(R.id.fire_run_root);
                runRoot.setImageResource(run_root[5]);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Flooding_section_Activity.this);
                dlg.setTitle("가장 빠른 대피로");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();

            }
        });
        flooding_run_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));
                dialogView = (View) View.inflate(Flooding_section_Activity.this, R.layout.run_root, null);
                ImageView runRoot = (ImageView) dialogView.findViewById(R.id.fire_run_root);
                runRoot.setImageResource(run_root[6]);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Flooding_section_Activity.this);
                dlg.setTitle("가장 빠른 대피로");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();

            }
        });
        flooding_run_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:010-3524-2947")));
                dialogView = (View) View.inflate(Flooding_section_Activity.this, R.layout.run_root, null);
                ImageView runRoot = (ImageView) dialogView.findViewById(R.id.fire_run_root);
                runRoot.setImageResource(run_root[7]);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Flooding_section_Activity.this);
                dlg.setTitle("가장 빠른 대피로");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();

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
        switch (item.getItemId()) {
            case R.id.menuItem1:
                Intent intent = new Intent(getApplicationContext(), First_main_Activity.class);
                startActivity(intent);
                return true;
            case R.id.menuItem2:
                return true;
        }
        return false;
    }
}