package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends AppCompatActivity {
    EditText et1,et2,et3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_SEND);

                i.putExtra(Intent.EXTRA_EMAIL, new String[]{et1.getText().toString()});
                i.putExtra(Intent.EXTRA_SUBJECT,et2.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT,et3.getText().toString());

                i.setType("message/rfc822");
                startActivity(i);
                startActivity(Intent.createChooser(i,"hello there"));
            }
        });
    }
}