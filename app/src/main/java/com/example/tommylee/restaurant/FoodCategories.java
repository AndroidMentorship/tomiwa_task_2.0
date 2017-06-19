package com.example.tommylee.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FoodCategories extends AppCompatActivity {
    String foodName;
    int foodPrice;
    String foodDescription;
    String deliveryAddress;
    String deliveryCity;
    int phoneNO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_categories);
    }
    public void toNativeFoods(View view) {
        Intent i = new Intent(getApplicationContext(), NativeFoods.class);
        startActivity(i);
    }
    public void toContinental(View view) {
        Intent i = new Intent(getApplicationContext(), ContinentalFoods.class);
        startActivity(i);
    }
    public void toChinese(View view) {
        Intent i = new Intent(getApplicationContext(), ChineseFoods.class);
        startActivity(i);
    }
    public void toDessert(View view) {
        Intent i = new Intent(getApplicationContext(), Desserts.class);
        startActivity(i);
    }
    public void toCart(View view) {
        Intent i = new Intent(getApplicationContext(), CheckCart.class);
        startActivity(i);
    }
}
