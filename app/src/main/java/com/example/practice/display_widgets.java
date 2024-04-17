package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class display_widgets extends AppCompatActivity {

    TextView nameTextView, emailTextView, genderTextView, interestsTextView,ageTextView,countryTextView,cityTextView;
    SeekBar ageSeekBar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_widgets);

        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        genderTextView = findViewById(R.id.genderTextView);
        interestsTextView = findViewById(R.id.interestsTextView);
        ageTextView = findViewById(R.id.ageTextView);
        ageSeekBar = findViewById(R.id.ageSeekBar);
        countryTextView= findViewById(R.id.countryTextView);
        cityTextView = findViewById(R.id.cityTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String email = extras.getString("email");
            String gender = extras.getString("gender");
            String interests = extras.getString("interests");
            int age = extras.getInt("age");
            String country = extras.getString("country");
            String city = extras.getString("city");

            // Set retrieved data to TextViews
            nameTextView.setText("Name: " + name);
            emailTextView.setText("Email: " + email);
            genderTextView.setText("Gender: " + gender);
            interestsTextView.setText("Interests: " + interests);
            countryTextView.setText("Country: " + country);
            ageTextView.setText("Age: " + age);
            cityTextView.setText("City: " + city);


            // Set age to SeekBar
            ageSeekBar.setProgress(age);

        }
    }
}



