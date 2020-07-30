package com.example.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Options extends AppCompatActivity {
    private Button Transaction;
    private Button Payment;
    private Button Shopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        Transaction = findViewById(R.id.btnTran);
        Transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentransaction();
            }
        });
        Payment = findViewById(R.id.btnPay);
        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpayment();
            }
        });
        Shopping = findViewById(R.id.btnShop);
        Shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openshopping();
            }
        });
    }
    public void opentransaction(){
        Intent intent2 = new Intent(this, transaction.class);
        startActivity(intent2);
    }
    public void openpayment(){
        Intent intent3 = new Intent(this, payment.class);
        startActivity(intent3);
    }
    public void openshopping (){
        Intent intent4 = new Intent(this, shopping.class);
        startActivity(intent4);
    }
    }

