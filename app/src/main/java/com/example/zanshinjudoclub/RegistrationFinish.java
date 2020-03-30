package com.example.zanshinjudoclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationFinish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_finish);

    }
    public void openHomeScreen(View view){
        Intent g = new Intent(this, HomeScreen.class);
        startActivity(g);
    }
    public void openVideo(View view){
        Intent k = new Intent(this, Video.class);
        startActivity(k);
    }

}
