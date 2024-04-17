package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class rc_home extends AppCompatActivity {

    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rc_home);
        rcv = findViewById(R.id.rcv);

        ArrayList<P_model> data = new ArrayList<>();
        data.add(new P_model("abc","1234567896",R.drawable.b1));
        data.add(new P_model("abc","1234567896",R.drawable.b2));
        data.add(new P_model("abc","1234567896",R.drawable.b3));
        data.add(new P_model("abc","1234567896",R.drawable.b4));
        data.add(new P_model("abc","1234567896",R.drawable.b5));
        data.add(new P_model("abc","1234567896",R.drawable.b6));
        data.add(new P_model("abc","1234567896",R.drawable.b7));
        data.add(new P_model("abc","1234567896",R.drawable.b8));
        data.add(new P_model("abc","1234567896",R.drawable.b9));
        data.add(new P_model("abc","1234567896",R.drawable.b10));
        data.add(new P_model("abc","1234567896",R.drawable.b11));
        data.add(new P_model("abc","1234567896",R.drawable.b12));

        rcv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rcv.setAdapter(new Adapter(getApplicationContext(),data));
    }
}