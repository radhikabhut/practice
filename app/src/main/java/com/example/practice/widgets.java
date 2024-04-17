package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class widgets extends AppCompatActivity {

    EditText nameEditText, emailEditText;
    RadioGroup genderRadioGroup;
    RadioButton maleRadioButton, femaleRadioButton;
    CheckBox sportsCheckBox, musicCheckBox, readingCheckBox;
    Button registerButton,changeThemeButton;

    SeekBar ageSeekBar;
    TextView ageTextView;

    Spinner citySpinner;

    AutoCompleteTextView countryAutoCompleteTextView;
    String[] countries = {"India", "Bharat", "Hindustan"};
    private boolean isDarktheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);
        setAppTheme();

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        maleRadioButton = findViewById(R.id.maleRadioButton);
        femaleRadioButton = findViewById(R.id.femaleRadioButton);
        sportsCheckBox = findViewById(R.id.sportsCheckBox);
        musicCheckBox = findViewById(R.id.musicCheckBox);
        readingCheckBox = findViewById(R.id.readingCheckBox);
        ageSeekBar = findViewById(R.id.ageSeekBar);
        ageTextView = findViewById(R.id.ageTextView);
        registerButton = findViewById(R.id.registerButton);
        countryAutoCompleteTextView = findViewById((R.id.countryAutoCompleteTextView));
        citySpinner = findViewById(R.id.citySpinner);
        changeThemeButton = findViewById(R.id.changeThemeButton);

        // Set up AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line, countries);
        countryAutoCompleteTextView.setAdapter(adapter);
        citySpinner.setAdapter(adapter);

        ageSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ageTextView.setText("Age: "+progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =  nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String gender = maleRadioButton.isChecked()?"Male":"Female";
                String interests = "";
                if (sportsCheckBox.isChecked()) {
                    interests += "sports, ";
                }
                if (musicCheckBox.isChecked()) {
                    interests += "Music, ";
                }
                if (readingCheckBox.isChecked()) {
                    interests += "Reading";
                }

                // Remove trailing comma and space if any
                if (interests.length() > 2) {
                    interests = interests.substring(0, interests.length() - 2);
                }
                String countries = countryAutoCompleteTextView.getText().toString();
                String city = citySpinner.getSelectedItem().toString();

                int age = ageSeekBar.getProgress();


                Intent in = new Intent(getApplicationContext(), display_widgets.class);
                in.putExtra("name",name);

                in.putExtra("email",email);
                in.putExtra("gender",gender);
                in.putExtra("interests",interests);
                in.putExtra("city", city);
                in.putExtra("countriess",countries);
                in.putExtra("age", age);

                if(countries != null &&! countries.isEmpty())
                {
                    in.putExtra("country" , countries);
                }
                else{
                    in.putExtra("country","not specified");
                }


                startActivity(in);

            }

        });
        Button changeThemeButton = findViewById(R.id.changeThemeButton);
        changeThemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle theme on button click
                isDarktheme = !isDarktheme;
                setAppTheme();
                recreate(); // Recreate the activity to apply the new theme
            }
        });

       
    }


    private void setAppTheme() {
        if (isDarktheme) {
            // Set dark theme
            setTheme(R.style.AppThemeDark);
        } else {
            // Set light theme
            setTheme(R.style.Base_Theme_Practice);
        }
    }
}