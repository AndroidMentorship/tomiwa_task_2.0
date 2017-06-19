package com.example.tommylee.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CheckCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_cart);

        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"N1000", "N1500", "N2000"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

    public void toDeliveryDetails(View view) {
        Intent i = new Intent(getApplicationContext(), DeliveryDetails.class);
        startActivity(i);
    }
}

