package com.example.a510.startgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Respiration_solution_Activity extends AppCompatActivity {
    WebView respiration_solution_webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.respiration_solution);
        setTitle("S.O.S");
        respiration_solution_webView = (WebView) findViewById(R.id.respiration_solution_webView);
        respiration_solution_webView.setWebViewClient(new RespirationSolutionWebViewClient());
        respiration_solution_webView.loadUrl("http://www.e-gen.or.kr/egen/first_aid_basics.do?contentsno=17");

    }

    class RespirationSolutionWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
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