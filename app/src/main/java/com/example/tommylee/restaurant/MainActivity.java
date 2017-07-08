package com.example.tommylee.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toCategories(View view) {
        Intent i = new Intent(getApplicationContext(), FoodCategories2.class);
        startActivity(i);
    }
}
