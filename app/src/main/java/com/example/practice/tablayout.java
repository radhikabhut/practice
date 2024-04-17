package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class tablayout extends AppCompatActivity {

    TabLayout tl;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
        tl = findViewById(R.id.tl);
        vp = findViewById(R.id.vp);

        viewpagermanager adapter =new viewpagermanager(getSupportFragmentManager());
        vp.setAdapter(adapter);
        tl.setupWithViewPager(vp);


    }
}