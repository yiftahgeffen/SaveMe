package com.example.saveMe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hackathon.R;

public class MyTripsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytrips);
    }

    public void openTrip(View view) {
        Intent intent = new Intent(this, TripActivity.class);
        startActivity(intent);
    }
}
