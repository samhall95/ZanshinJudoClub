package com.example.zanshinjudoclub;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdultConsent extends AppCompatActivity {

    public void openRegistrationFinish(View view){
        Intent j = new Intent(this, RegistrationFinish.class);
        startActivity(j);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult_consent);
    }
    public void openHomeScreen(View view) {
        final Intent t = new Intent(this, HomeScreen.class);
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Return To Home Screen")
                .setMessage("Do you want to cancel and return home?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(t);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

}
