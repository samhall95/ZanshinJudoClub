package com.example.zanshinjudoclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    public void openFirstSessionCongrats(View view){
        Intent b = new Intent(this, FirstSessionCongrats.class);
        startActivity(b);
    }

    public void openWhyJoin(View view){
        Intent l = new Intent(this, WhyJoin.class);
        startActivity(l);
    }

    public void openPayMatFees(View view){
        Intent m = new Intent(this, PayMatFees.class);
        startActivity(m);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }



}
