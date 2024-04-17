package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.TextView;

public class cardview extends AppCompatActivity {

    CardView cardView;
    TextView titleTextView,contentTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

         cardView = findViewById(R.id.cardView);
         titleTextView = findViewById(R.id.titleTextView);
         contentTextView = findViewById(R.id.contentTextView);

        // Set title and content for the CardView
        titleTextView.setText("Sample Title");
        contentTextView.setText("Sample Content");
    }
}