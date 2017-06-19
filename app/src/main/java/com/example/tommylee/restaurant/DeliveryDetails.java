package com.example.tommylee.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DeliveryDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_details);
    }
    public void toPayment(View view) {
        Intent i = new Intent(getApplicationContext(), Payment.class);
        startActivity(i);
    }
}
