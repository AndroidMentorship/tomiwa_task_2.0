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
    //public ImageView b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_foods);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);

        LayoutInflater inflator = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.search_bar, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        actionBar.setCustomView(v, params);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // b1 = (ImageView) findViewById(R.id.native_amala);
        //b2 = (ImageView) findViewById(R.id.native_fufu);
        //b3 = (ImageView) findViewById(R.id.native_jollof);
        //b4 = (ImageView) findViewById(R.id.native_ofada);
        //b5 = (ImageView) findViewById(R.id.native_porridge);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void toSearch(View view) {
        Toast.makeText(this, "can not retrive information now", Toast.LENGTH_SHORT).show();
    }

    public void amalaToCart(View v) {
        TextView foodName = (TextView) findViewById(R.id.amala_text_view);
        Intent intent = new Intent(NativeFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_amala);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void fufuToCart(View v) {
        TextView foodName = (TextView) findViewById(R.id.fufu_text_view);
        Intent intent = new Intent(NativeFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_fufu);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        //Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.id.native_fufu);
        //intent.putExtra("bmp_img", bmp);

        startActivity(intent);
    }

    public void jollofToCart(View v) {
        TextView foodName = (TextView) findViewById(R.id.jollof_text_view);
        Intent intent = new Intent(NativeFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_jollof);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);


        startActivity(intent);

    }

    public void ofadaToCart(View v) {
        TextView foodName = (TextView) findViewById(R.id.ofada_text_view);
        Intent intent = new Intent(NativeFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_ofada);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void porridgeToCart(View v) {
        TextView foodName = (TextView) findViewById(R.id.porridge_text_view);
        Intent intent = new Intent(NativeFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.native_porridge);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }


       /* b1.setOnClickListener(new View.OnClickListener(){

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

    }*/
}
