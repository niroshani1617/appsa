package com.example.dell.appsa;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        Intent home = new Intent(Home.this, Home.class);
                        startActivity(home);
                        break;
                    case R.id.profile:
                        Intent prof = new Intent(Home.this, Profile.class);
                        startActivity(prof);
                        break;
                    case R.id.dashboard:
                        Intent dash = new Intent(Home.this, Profile.class);
                        startActivity(dash);
                        break;
                    case R.id.schedule:
                        Intent sche = new Intent(Home.this, Profile.class);
                        startActivity(sche);
                        break;
                }

                return true;
            }
        });

    }
}
