package com.example.tommylee.restaurant;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckCart extends AppCompatActivity {
    TextView foodViews,priceViews,descriptionViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_cart);
        foodViews = (TextView) findViewById(R.id.cart_item_text_views);
        priceViews = (TextView) findViewById(R.id.price_text_view);
        descriptionViews = (TextView) findViewById(R.id.description_text_views);
        Intent intent = getIntent();
        String str1 = intent.getStringExtra("foodname");
        String str2 = intent.getStringExtra("foodprice");
        String str3 = intent.getStringExtra("fooddescription");
        foodViews.setText(str1);
        priceViews.setText(str2);
        descriptionViews.setText(str3);

        Bundle extras = getIntent().getExtras();
        byte[] b = extras.getByteArray("picture");

        Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length);
        ImageView image = (ImageView) findViewById(R.id.check_cart_amala);

        image.setImageBitmap(bmp);

    }

    public void toPayment(View view) {
        Intent i = new Intent(getApplicationContext(), Payment.class);
        startActivity(i);
    }
}

