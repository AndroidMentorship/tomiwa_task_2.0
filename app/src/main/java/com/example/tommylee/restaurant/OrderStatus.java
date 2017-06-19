package com.example.tommylee.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OrderStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_status);
    }
    public void toCategories(View view) {
        Intent i = new Intent(getApplicationContext(), FoodCategories.class);
        startActivity(i);
    }
}
