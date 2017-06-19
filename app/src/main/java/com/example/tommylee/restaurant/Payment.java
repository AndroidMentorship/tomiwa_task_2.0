package com.example.tommylee.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Spinner dropdown = (Spinner) findViewById(R.id.spinner1);
        String[] items = new String[]{"master card", "visa card", "verve card"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

    public void toOrderStatus(View view) {
        Intent i = new Intent(getApplicationContext(), OrderStatus.class);
        startActivity(i);
    }
}