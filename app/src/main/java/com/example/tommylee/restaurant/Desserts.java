package com.example.tommylee.restaurant;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class Desserts extends AppCompatActivity {
    public ImageView b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        b1 = (ImageView) findViewById(R.id.dessert_apple_rose);
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
    }
}
