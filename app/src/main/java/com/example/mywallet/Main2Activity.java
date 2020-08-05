package com.example.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText password;
    private EditText username;
    private Button Login;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username=findViewById(R.id.txtUser);
        password=findViewById(R.id.txtPass);
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

        username.addTextChangedListener(nexttextwatcher);
        password.addTextChangedListener(nexttextwatcher);
    }
    public void openOPtions(){
        Intent intent = new Intent(this, Options.class);
        startActivity(intent);
    }

    private TextWatcher nexttextwatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {


        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String usernameinput =  username.getText().toString().trim();
            String passwordinput = password.getText().toString().trim();


            Login.setEnabled(!usernameinput.isEmpty() && !passwordinput.isEmpty() );

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    public void openregistration(){
        Intent intent1 = new Intent(this, registration.class);
        startActivity(intent1);
    }
    }

