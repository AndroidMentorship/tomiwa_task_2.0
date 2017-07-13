package com.example.tommylee.restaurant;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class ContinentalFoods extends AppCompatActivity {

    //public ImageView b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continental_foods);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);

        LayoutInflater inflator = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.search_bar, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        actionBar.setCustomView(v, params);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void toSearch(View view) {
        Toast.makeText(this, "can not retrive information now", Toast.LENGTH_SHORT).show();
    }

    public void hamToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.ham_text_view);
        Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continental__grized_roast_ham);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);
    }

    public void friedRiceToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.fried_rice_text_view);
        Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continental_fried_rice);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void pastaToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.pasta_salad_text_view);
        Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continental_pasta_salad);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void porkToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.pork_meal_text_view);
        Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continental_pork_meal);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void riceToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.rice_text_view);
        Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continetal_rice);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }
        /*b1 = (ImageView) findViewById(R.id.continental_grized_roast_ham);
        b2 = (ImageView) findViewById(R.id.continental_fried_rice);
        b3 = (ImageView) findViewById(R.id.continental_pasta_salad);
        b4 = (ImageView) findViewById(R.id.continental_pork_meal);
        b5 = (ImageView) findViewById(R.id.continental_rice);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView foodName1 = (TextView) findViewById(R.id.ham_text_view);
                Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continental__grized_roast_ham);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView foodName1 = (TextView) findViewById(R.id.fried_rice_text_view);
                Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continental_fried_rice);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView foodName1 = (TextView) findViewById(R.id.pasta_salad_text_view);
                Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());


                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continental_pasta_salad);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView foodName1 = (TextView) findViewById(R.id.pork_meal_text_view);
                Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continental_pork_meal);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView foodName1 = (TextView) findViewById(R.id.rice_text_view);
                Intent intent = new Intent(ContinentalFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.continetal_rice);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });*/

}

