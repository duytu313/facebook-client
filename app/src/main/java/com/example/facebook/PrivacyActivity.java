package com.example.facebook;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PrivacyActivity extends AppCompatActivity {

    private ImageView imgBack;
    private LinearLayout privacy1, privacy2, privacy3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        imgBack = findViewById(R.id.imgBack);
        privacy1 = findViewById(R.id.privacy1);
        privacy2 = findViewById(R.id.privacy2);
        privacy3 = findViewById(R.id.privacy3);


        imgBack.setOnClickListener(v -> finish());


        privacy1.setOnClickListener(v ->
                Toast.makeText(PrivacyActivity.this, "Edit post viewing permissions", Toast.LENGTH_SHORT).show());

        privacy2.setOnClickListener(v ->
                Toast.makeText(PrivacyActivity.this, "Edit personal information viewing permissions", Toast.LENGTH_SHORT).show());

        privacy3.setOnClickListener(v ->
                Toast.makeText(PrivacyActivity.this, "Edit search and connection permissions", Toast.LENGTH_SHORT).show());
    }
}
