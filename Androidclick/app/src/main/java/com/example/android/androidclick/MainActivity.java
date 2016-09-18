package com.example.android.androidclick;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
public class MainActivity extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View V) {

        quantity=quantity+1;
        display(quantity);

    }


    public void decrement(View V) {

        quantity=quantity-1;

        display(quantity);
    }


    public void submitOrder(View V) {
        int quantity=5;
        display(quantity);
        displayPrice(quantity*5);
        Toast t = Toast.makeText(this,"Order update",Toast.LENGTH_SHORT);t.show();
    }
    public void display(int number){
        TextView quantityTextView=(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);}

    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }}


