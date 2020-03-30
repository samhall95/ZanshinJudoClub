package com.example.zanshinjudoclub;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KidsConsent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_consent);
    }


    public void openRegistrationFinish(View view){
        Intent f = new Intent(this, RegistrationFinish.class);
        startActivity(f);
    }

    public void openHomeScreen(View view){
        final Intent r = new Intent(this, HomeScreen.class);
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Return To Home Screen")
                .setMessage("Do you want to cancel and return home?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(r);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
