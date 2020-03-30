package com.example.zanshinjudoclub;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdultRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult_registration);
    }
    public void openAdultConsent(View view){
        Intent i = new Intent(this, AdultConsent.class);
        startActivity(i);
    }
    public void openHomeScreen(View view) {
        final Intent s = new Intent(this, HomeScreen.class);
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Return To Home Screen")
                .setMessage("Do you want to cancel and return home?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(s);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
