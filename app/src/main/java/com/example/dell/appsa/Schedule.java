package com.example.dell.appsa;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        Intent home = new Intent(Schedule.this, Home.class);
                        startActivity(home);
                        break;
                    case R.id.profile:
                        Intent prof = new Intent(Schedule.this, Profile.class);
                        startActivity(prof);
                        break;
                    case R.id.dashboard:
                        Intent dash = new Intent(Schedule.this, Dashboard.class);
                        startActivity(dash);
                        break;
                    case R.id.schedule:
                        Intent sche = new Intent(Schedule.this, Schedule.class);
                        startActivity(sche);
                        break;
                }

                return true;
            }
        });
    }
}
