package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Animation extends AppCompatActivity {
TextView textanim;
Button scale,translate,alpha,rotate;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        textanim = findViewById(R.id.textanim);
        scale = findViewById(R.id.scale);
        rotate = findViewById(R.id.rotate);
        translate = findViewById(R.id.translate);
        alpha = findViewById(R.id.alpha);



        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.view.animation.Animation move =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textanim.startAnimation(move);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.view.animation.Animation rotate =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                textanim.startAnimation(rotate);

            }
        });

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.view.animation.Animation alpha =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                textanim.startAnimation(alpha);
            }
        });

        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.view.animation.Animation scale =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                textanim.startAnimation(scale);
            }
        });





    }
}