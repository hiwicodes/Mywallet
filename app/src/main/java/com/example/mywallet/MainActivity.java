package com.example.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button Customer;
    private Button Retailer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Customer= findViewById(R.id.btnCustomer);
        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainactivity2();
            }
        });
        Retailer = findViewById(R.id.btnRetailer);
        Retailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openretail();
            }
        });


    }
    public void openMainactivity2(){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
    public void openretail(){
        Intent intent = new Intent(MainActivity.this,retailer_login.class);
        startActivity(intent);
    }
}
