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

public class ChineseFoods extends AppCompatActivity {
    //public ImageView b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_foods);
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

    public void emazeToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.emaze_text_view);
        Intent intent = new Intent(ChineseFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinese_emaze);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void spiceToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.spice_text_view);
        Intent intent = new Intent(ChineseFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinese_spice);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void friedPorkToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.fried_pork_text_view);
        Intent intent = new Intent(ChineseFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinese_stir_fried_pork_dish);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

    public void tsaoToCart(View v) {
        TextView foodName1 = (TextView) findViewById(R.id.tsao_chicken_text_view);
        Intent intent = new Intent(ChineseFoods.this, AddToCart.class);
        intent.putExtra("fname", foodName1.getText().toString());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinese_tsao_chicken);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

        intent.putExtra("picture", b);

        startActivity(intent);

    }

       /* b1 = (ImageView) findViewById(R.id.chinese_emaze);
        b2 = (ImageView) findViewById(R.id.chinese_spice);
        b3 = (ImageView) findViewById(R.id.chinese_fried_pork);
        b4 = (ImageView) findViewById(R.id.chinese_tsao_chicken);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView foodName1 = (TextView) findViewById(R.id.emaze_text_view);
                Intent intent = new Intent(ChineseFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinese_emaze);
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

                TextView foodName1 = (TextView) findViewById(R.id.spice_text_view);
                Intent intent = new Intent(ChineseFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinese_spice);
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

                TextView foodName1 = (TextView) findViewById(R.id.fried_pork_text_view);
                Intent intent = new Intent(ChineseFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinese_stir_fried_pork_dish);
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

                TextView foodName1 = (TextView) findViewById(R.id.tsao_chicken_text_view);
                Intent intent = new Intent(ChineseFoods.this, AddToCart.class);
                intent.putExtra("fname", foodName1.getText().toString());

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinese_tsao_chicken);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });
    }*/
}
