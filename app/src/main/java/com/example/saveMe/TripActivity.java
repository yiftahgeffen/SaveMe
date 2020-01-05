package com.example.saveMe;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.example.hackathon.R;
public class TripActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);
        supportInvalidateOptionsMenu();
    }
    public void openMenuBar(View view) {

        Intent intent = new Intent(this, TripActivity.class);
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu, popup.getMenu());

        popup.show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        System.out.println("helle_2");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        System.out.println("helle_3");
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.wearable_devices:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

//    public void openWearableActivity(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }

}
