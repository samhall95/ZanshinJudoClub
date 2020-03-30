package com.example.zanshinjudoclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CheckAge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_age);
    }

    public void openKidsRegistration(View view){
        Intent d = new Intent(this, KidsRegistration.class);
        startActivity(d);
    }

    public void openAdultRegistration(View view){
        Intent h = new Intent(this, AdultRegistration.class);
        startActivity(h);
    }

    public void openHomeScreen(View view){
        Intent p = new Intent(this, HomeScreen.class);
        startActivity(p);
    }
}
