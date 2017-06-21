package com.example.tommylee.restaurant;

import android.content.Intent;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

import static com.example.tommylee.restaurant.R.id.cart_item_text_view;

public class AddToCart extends AppCompatActivity{

    TextView foodView;

    public Button be;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);

        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"N1000", "N1500", "N2000"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);


        be = (Button) findViewById(R.id.add_to_cart_button);


        foodView = (TextView) findViewById(R.id.cart_item_text_view);
        //ImageView imageView = (ImageView) findViewById(R.id.cart_amala);
        Intent intent = getIntent();
        String str = intent.getStringExtra("fname");
        foodView.setText(str);

        Bundle extras = getIntent().getExtras();
        byte[] b = extras.getByteArray("picture");

        Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length);
        ImageView image = (ImageView) findViewById(R.id.cart_amala);

        image.setImageBitmap(bmp);

        //Bitmap bitmap = (Bitmap) intent.getParcelableExtra("Bitmap");
        //imageView.setImageBitmap(bitmap);




        be.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                TextView cartFName = (TextView) findViewById(R.id.cart_item_text_view);
                Spinner price = (Spinner) findViewById(R.id.spinner1);
                EditText description = (EditText) findViewById(R.id.description_text);
                Intent intent = new Intent(AddToCart.this,CheckCart.class);
                intent.putExtra("foodname",cartFName.getText().toString());
                intent.putExtra("foodprice",price.getSelectedItem().toString());
                intent.putExtra("fooddescription",description.getText().toString());

                ImageView imgPreview =(ImageView) findViewById(R.id.cart_amala) ;

                Bitmap bitmap = ((BitmapDrawable) imgPreview.getDrawable()).getBitmap();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();

                intent.putExtra("picture", b);

                startActivity(intent);
            }

        });


    }
}

