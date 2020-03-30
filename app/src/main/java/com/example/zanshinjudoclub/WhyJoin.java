package com.example.zanshinjudoclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WhyJoin extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why_join);
    }

    public void openRegistrationSearch(View view){
        Intent n = new Intent(this, RegistrationSearch.class);
        startActivity(n);
    }
}
