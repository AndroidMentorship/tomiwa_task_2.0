package com.example.tommylee.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.tommylee.restaurant.R.id.amala_text_view;
import static com.example.tommylee.restaurant.R.id.fufu_text_view;
import static com.example.tommylee.restaurant.R.id.jollof_text_view;
import static com.example.tommylee.restaurant.R.id.native_amala;
import static com.example.tommylee.restaurant.R.id.native_fufu;
import static com.example.tommylee.restaurant.R.id.native_jollof;
import static com.example.tommylee.restaurant.R.id.native_ofada;
import static com.example.tommylee.restaurant.R.id.native_porridge;
import static com.example.tommylee.restaurant.R.id.ofada_text_view;
import static com.example.tommylee.restaurant.R.id.porridge_text_view;

public class NativeFoods extends AppCompatActivity {
    TextView foodName;
    String strFoodName;
    ImageView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_foods);


        b = (ImageView) findViewById(native_amala);
        b = (ImageView) findViewById(native_fufu);
        b = (ImageView) findViewById(native_jollof);
        b = (ImageView) findViewById(native_ofada);
        b = (ImageView) findViewById(native_porridge);
        foodName = (TextView) findViewById(amala_text_view);
        foodName = (TextView) findViewById(fufu_text_view);
        foodName = (TextView) findViewById(jollof_text_view);
        foodName = (TextView) findViewById(ofada_text_view);
        foodName = (TextView) findViewById(porridge_text_view);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                strFoodName= foodName.getText().toString();
            }

        });}
    public void toCart(View view) {
        Intent i = new Intent(getApplicationContext(), AddToCart.class);
        startActivity(i);
    }
}
