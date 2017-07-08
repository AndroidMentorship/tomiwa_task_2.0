package com.example.tommylee.restaurant;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class FoodCategories2 extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;


    GridView grid;
    String[] web = {
            "Native Dishes",
            "Continental Dishes",
            "Chinese Dishes",
            "Desserts"
    } ;
    int[] imageId = {
            R.drawable.native_dishes_ones,
            R.drawable.intercontinental_dishes,
            R.drawable.chinese_dishes,
            R.drawable.dessert,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_categories2);

        CustomGrid adapter = new CustomGrid(FoodCategories2.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(FoodCategories2.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    Intent i = new Intent(getApplicationContext(), NativeFoods.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(getApplicationContext(), ContinentalFoods.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(getApplicationContext(), ChineseFoods.class);
                    startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(getApplicationContext(), Desserts.class);
                    startActivity(i);
                }



            }
        });

    }
    public void toCheckCart(View view) {
        Intent i = new Intent(getApplicationContext(), CheckCart.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
