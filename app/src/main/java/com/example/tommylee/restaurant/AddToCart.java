package com.example.tommylee.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.tommylee.restaurant.R.id.cart_item_text_view;

public class AddToCart extends NativeFoods{

    TextView foodView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);

        foodView = (TextView) findViewById(cart_item_text_view);



        displayFoodName(strFoodName);
        //foodView.setText(strFoodName);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"N1000", "N1500", "N2000"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }
    public void displayFoodName(String strFoodName){
        TextView foodView =(TextView) findViewById(cart_item_text_view);
        foodView.setText(String.valueOf(strFoodName));
    }
}
