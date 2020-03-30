package com.example.zanshinjudoclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstSessionCongrats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_session_congrats);
    }

    public void openCheckAge(View view){
        Intent c = new Intent(this, CheckAge.class);
        startActivity(c);
    }

    public void openHomeScreen(View view){
        Intent o = new Intent(this, HomeScreen.class);
        startActivity(o);
    }
}
