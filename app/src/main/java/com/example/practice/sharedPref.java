package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sharedPref extends AppCompatActivity {
EditText nm,eml;
Button submit;

SharedPreferences sp;
SharedPreferences.Editor spe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);

        nm = findViewById(R.id.nm);
        eml = findViewById(R.id.eml);
        submit =findViewById(R.id.submit);

        sp = getSharedPreferences("DEMO",MODE_PRIVATE);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spe = sp.edit();

                String value1 =nm.getText().toString();
                String value2 = eml.getText().toString();

                spe.putString(value1,"");
                spe.putString(value2,"");

                spe.commit();

                Toast.makeText(sharedPref.this, "id is inserted", Toast.LENGTH_SHORT).show();


            }
        });


    }
}