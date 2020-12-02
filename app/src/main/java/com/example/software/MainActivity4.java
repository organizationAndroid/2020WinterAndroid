package com.example.software;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back_main);

        LinearLayout mainlayout4 = findViewById(R.id.mainlayout4);
        mainlayout4.setBackgroundColor(Color.rgb(255, 192, 203));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.route_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
                finish();
                return true;
            }
            case R.id.menu_five_d:{
                finish();
                return true;
            }
            case R.id.menu_four_d:{
                finish();
                return true;
            }
            case R.id.menu_three_d:{
                finish();
                return true;
            }
            case R.id.menu_two_d:{
                finish();
                return true;
            }
            case R.id.menu_one_d:{
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}