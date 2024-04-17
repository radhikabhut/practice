package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class Web_view extends AppCompatActivity {

    EditText url;
    WebView wb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        url = findViewById(R.id.url);
        wb = findViewById(R.id.wb);

        url.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                wb.loadUrl("https://"+url.getText().toString());
                wb.setWebViewClient(new WebViewClient());
                wb.getSettings().setJavaScriptEnabled(true);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(wb.canGoBack())
            wb.canGoBack();
        else
            super.onBackPressed();
    }
}