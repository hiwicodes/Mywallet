package com.example.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class confirmation extends AppCompatActivity {
    private Button Confirm;
    private Button Resend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        Confirm = findViewById(R.id.btnConfirm);
        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
        Resend = findViewById(R.id.btnresend);
        Resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openconfirmation();
            }
        });
    }
    public void openMainActivity(){
        Intent intent7 = new Intent(this ,MainActivity.class);
        startActivity(intent7);
    }
    public void openconfirmation(){
        Intent intent8 = new Intent(this, confirmation.class);
        startActivity(intent8);
    }

}
