package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.practice.databinding.ActivityDatabaseBinding;

public class database extends AppCompatActivity {

    ActivityDatabaseBinding db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = ActivityDatabaseBinding.inflate(getLayoutInflater());
        setContentView(db.getRoot());


        sqLite sql = new sqLite(this);
        db.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = db.e1.getText().toString();

                int  no = Integer.parseInt(db.e2.getText().toString());
                sql.insert(name,no);
            }
        });

    }
}