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
    public ImageView b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_foods);


        b1 = (ImageView) findViewById(R.id.native_amala);
        b2 = (ImageView) findViewById(R.id.native_fufu);
        b3 = (ImageView) findViewById(R.id.native_jollof);
        b4 = (ImageView) findViewById(R.id.native_ofada);
        b5 = (ImageView) findViewById(R.id.native_porridge);

        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                TextView foodName = (TextView) findViewById(R.id.amala_text_view);
                Intent intent = new Intent(NativeFoods.this,AddToCart.class);
                intent.putExtra("fname",foodName.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_amala);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });
        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                TextView foodName = (TextView) findViewById(R.id.fufu_text_view);
                Intent intent = new Intent(NativeFoods.this,AddToCart.class);
                intent.putExtra("fname",foodName.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_fufu);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                //Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.id.native_fufu);
                //intent.putExtra("bmp_img", bmp);

                startActivity(intent);
            }

        });
        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                TextView foodName = (TextView) findViewById(R.id.jollof_text_view);
                Intent intent = new Intent(NativeFoods.this,AddToCart.class);
                intent.putExtra("fname",foodName.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_jollof);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);


                startActivity(intent);
            }

        });
        b4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                TextView foodName = (TextView) findViewById(R.id.ofada_text_view);
                Intent intent = new Intent(NativeFoods.this,AddToCart.class);
                intent.putExtra("fname",foodName.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_ofada);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });
        b5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                TextView foodName = (TextView) findViewById(R.id.porridge_text_view);
                Intent intent = new Intent(NativeFoods.this,AddToCart.class);
                intent.putExtra("fname",foodName.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_porridge);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });

    }
}
