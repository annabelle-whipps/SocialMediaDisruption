package com.example.socialmediadisruption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView carButton, logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        carButton = (ImageView)findViewById(R.id.carButton);
        logOutButton = (ImageView) findViewById(R.id.logOutButton);

        carButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewCarDisruptions = new Intent(Home.this, CarTravelDisruptions.class);
                startActivity(viewCarDisruptions);
            }
        });

        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logOutOfApp = new Intent(Home.this, MainActivity.class);
                startActivity(logOutOfApp);
            }
        });
    }

}
