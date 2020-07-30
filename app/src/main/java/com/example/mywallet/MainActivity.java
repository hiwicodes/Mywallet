package com.example.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button Login;
private Button Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = findViewById(R.id.btnLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOPtions();
            }
        });
        Register = findViewById(R.id.btnRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregistration();
            }
        });
    }
    public void openOPtions(){
        Intent intent = new Intent(MainActivity.this,Options.class);
        startActivity(intent);
    }
public void openregistration(){
        Intent intent1= new Intent(MainActivity.this, registration.class);
        startActivity(intent1);
}

    }

