package com.example.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

import java.util.Calendar;

public class registration extends AppCompatActivity {
    private EditText firstname;
    private EditText lastname;
    private EditText email;
    private EditText phonenumb;
    private EditText birthdate;
    private TextView askbdate;
    private Button Next;
    private CountryCodePicker  ccp;
    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        firstname = findViewById(R.id.txtFname);
        lastname = findViewById(R.id.txtLname);
        email = findViewById(R.id.txtEmail);
        phonenumb = findViewById(R.id.txtPhone);
        birthdate = findViewById(R.id.txtBdate);
        askbdate=findViewById(R.id.askBdate);
        Next = findViewById(R.id.btnNext);

        firstname.addTextChangedListener(nexttextwatcher);
        lastname.addTextChangedListener(nexttextwatcher);
        email.addTextChangedListener(nexttextwatcher);
        phonenumb.addTextChangedListener(nexttextwatcher);
        birthdate.addTextChangedListener(nexttextwatcher);

        Calendar calendar = Calendar.getInstance();
        final int year =calendar.get(Calendar.YEAR);
        final int month =calendar.get(Calendar.MONTH);
        final int day =calendar.get(Calendar.DAY_OF_MONTH);
        birthdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        registration.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth
                ,setListener,year,month,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });
        setListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                String date = day + "/"+ month +"/"+ year;
                birthdate.setText(date);
            }
        };
        askbdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        registration.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month = month +1;
                        String date = day + "/"+ month +"/"+ year;
                        askbdate.setText(date);

                    }
                },year,month,day);
                datePickerDialog.show();

            }
        });




       picker();
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregistration2();

            }
        });
    }
    private TextWatcher nexttextwatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {


        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String firstnameinput =  firstname.getText().toString().trim();
            String lasnameinput = lastname.getText().toString().trim();
            String  emailinput = email.getText().toString().trim();
            String phoneinput = phonenumb.getText().toString().trim();
            String birthinput = birthdate.getText().toString().trim();

            Next.setEnabled(!firstnameinput.isEmpty() && !lasnameinput.isEmpty() && !emailinput.isEmpty() && !phoneinput.isEmpty() && !birthinput.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    public void openregistration2(){
        Intent intent5 = new Intent(this, registration2.class);
        startActivity(intent5);
}
    private void picker(){

        ccp = findViewById(R.id.ccp);
        phonenumb = findViewById(R.id.txtPhone);
        Next = findViewById(R.id.btnNext);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getnumber();
            }
        });
    }
    private void getnumber(){
        String fullnumber = ccp.getFullNumber()+phonenumb.getText().toString();
    }
}
