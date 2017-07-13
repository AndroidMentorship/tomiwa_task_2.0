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

public class Desserts extends AppCompatActivity {
    //public ImageView b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
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

    public void roseToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.apple_rose_text_view);
        Intent intent = new Intent(Desserts.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dessert_apple_rose_mini_tarts);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void brandyToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.brandy_text_view);
        Intent intent = new Intent(Desserts.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dessert_brandy);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void chocolateToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.chocolate_text_view);
        Intent intent = new Intent(Desserts.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dessert_chocolate);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void milkyToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.miilky_chocolate_text_view);
        Intent intent = new Intent(Desserts.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.desserts);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

     /*   b1 = (ImageView) findViewById(R.id.dessert_apple_rose);
        b2 = (ImageView) findViewById(R.id.dessert_brandy);
        b3 = (ImageView) findViewById(R.id.dessert_chocolate);
        b4 = (ImageView) findViewById(R.id.desserts_milky);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView foodName1 = (TextView) findViewById(R.id.apple_rose_text_view);
                Intent intent = new Intent(Desserts.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dessert_apple_rose_mini_tarts);
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

                TextView foodName1 = (TextView) findViewById(R.id.brandy_text_view);
                Intent intent = new Intent(Desserts.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dessert_brandy);
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

                TextView foodName1 = (TextView) findViewById(R.id.chocolate_text_view);
                Intent intent = new Intent(Desserts.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dessert_chocolate);
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

                TextView foodName1 = (TextView) findViewById(R.id.miilky_chocolate_text_view);
                Intent intent = new Intent(Desserts.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.desserts);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });
    }*/
}
