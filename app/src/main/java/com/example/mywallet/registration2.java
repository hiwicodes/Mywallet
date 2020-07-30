package com.example.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration2 extends AppCompatActivity {
    private Button Finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration2);
        Finish = findViewById(R.id.btnFinish);
        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openconfirmation();
            }
        });
    }
    public void openconfirmation(){
        Intent intent6 = new Intent(this,confirmation.class);
        startActivity(intent6);
    }
}
