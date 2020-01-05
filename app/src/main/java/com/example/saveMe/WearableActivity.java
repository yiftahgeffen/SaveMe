package com.example.saveMe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hackathon.R;

public class WearableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wearable);
    }

    public void openEmergencyContact(View view) {
        Intent intent = new Intent(this, EmergencyContacts.class);
        startActivity(intent);
    }
}
