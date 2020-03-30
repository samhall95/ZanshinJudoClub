package com.example.zanshinjudoclub;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class KidsRegistration extends AppCompatActivity {

    private Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_registration);


        EditText parentsAddress1 = (EditText) findViewById(R.id.parentsAddress1);
        String parAddress1 = parentsAddress1.getText().toString();
        log.i("KidsRegistration", "Parents Address: " + parAddress1);
        EditText parentsAddress2 = (EditText) findViewById(R.id.parentsAddress2);
        String parAddress2 = parentsAddress2.getText().toString();
        log.i("KidsRegistration", "Parenst Address: " + parAddress2);
        EditText parentsPhone = (EditText) findViewById(R.id.parentsPhone);
        String parPhone = parentsPhone.getText().toString();
        log.i("KidsRegistration", "Parents Phone: " + parPhone);
        EditText parentsEmail = (EditText) findViewById(R.id.parentsEmail);
        String parEmail = parentsEmail.getText().toString();
        log.i("KidsRegistration", "Parents Email: " + parEmail);
        EditText parentsPostcode = (EditText) findViewById(R.id.parentsPostcode);
        String parPostcode = parentsPostcode.getText().toString();
        log.i("KidsRegistration", "Parents Postcode: " + parPostcode);
        EditText emergencyNameK = (EditText) findViewById(R.id.emergencyNameK);
        String emgName = emergencyNameK.getText().toString();
        log.i("KidsRegistration", "Emergency Name: " + emgName);
        EditText emergencyRelationK = (EditText) findViewById(R.id.emergencyRelationK);
        String emgRelation = emergencyRelationK.getText().toString();
        log.i("KidsRegistration", "Emergency Relation: " + emgRelation);
        EditText emergencyAddress1K = (EditText) findViewById(R.id.emergencyAddress1K);
        String emgAddress1 = emergencyAddress1K.getText().toString();
        log.i("KidsRegistration", "Emergency Address: " + emgAddress1);
        EditText emergencyAddress2k = (EditText) findViewById(R.id.emergencyAddress2K);
        String emgAddress2 = emergencyAddress2k.getText().toString();
        log.i("KidsRegistration", "Emergency Address: " + emgAddress2);
        EditText emergencyPhoneK = (EditText) findViewById(R.id.emergencyPhoneK);
        String emgPhone = emergencyPhoneK.getText().toString();
        log.i("KidsRegistration", "Emergency Phone: " + emgPhone);
        EditText emergencyEmailK = (EditText) findViewById(R.id.emergencyEmailK);
        String emgEmail = emergencyEmailK.getText().toString();
        log.i("KidsRegistration", "Emergency Email: " + emgEmail);
        EditText emergencyPostcodeK = (EditText) findViewById(R.id.emergencyPostcodeK);
        String emgPostcode = emergencyPostcodeK.getText().toString();
        log.i("KidsRegistration", "Emergency Postcode: " + emgPostcode);
    }

    public void openHomeScreen(View view){
        final Intent q = new Intent(this, HomeScreen.class);
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Return To Home Screen")
                .setMessage("Do you want to cancel and return home?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(q);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void openKidsConsent(View view){
        Intent e = new Intent(this, KidsConsent.class);
        EditText kidsPlayerName = (EditText) findViewById(R.id.kidsPlayerName);
        String playerName = kidsPlayerName.getText().toString();
        log.i("KidsRegistration", "Name: " + playerName);
        EditText kidsDateOfBirth = (EditText) findViewById(R.id.kidsDateOfBirth);
        String dateOfBirth = kidsDateOfBirth.getText().toString();
        log.i("KidsRegistration", "Date of Birth: " + dateOfBirth);
        EditText parentsName = (EditText) findViewById(R.id.parentsName);
        String parName = parentsName.getText().toString();
        log.i("KidsRegistration", "Parents Name: " + parName);
        EditText parentsRelation = (EditText) findViewById(R.id.parentsRelation);
        String parRelation = parentsRelation.getText().toString();
        log.i("KidsRegistration", "Relation: " + parRelation);
        EditText parentsAddress1 = (EditText) findViewById(R.id.parentsAddress1);
        String parAddress1 = parentsAddress1.getText().toString();
        log.i("KidsRegistration", "Parents Address: " + parAddress1);
        EditText parentsAddress2 = (EditText) findViewById(R.id.parentsAddress2);
        String parAddress2 = parentsAddress2.getText().toString();
        log.i("KidsRegistration", "Parenst Address: " + parAddress2);
        EditText parentsPhone = (EditText) findViewById(R.id.parentsPhone);
        String parPhone = parentsPhone.getText().toString();
        log.i("KidsRegistration", "Parents Phone: " + parPhone);
        EditText parentsEmail = (EditText) findViewById(R.id.parentsEmail);
        String parEmail = parentsEmail.getText().toString();
        log.i("KidsRegistration", "Parents Email: " + parEmail);
        EditText parentsPostcode = (EditText) findViewById(R.id.parentsPostcode);
        String parPostcode = parentsPostcode.getText().toString();
        log.i("KidsRegistration", "Parents Postcode: " + parPostcode);
        EditText emergencyNameK = (EditText) findViewById(R.id.emergencyNameK);
        String emgName = emergencyNameK.getText().toString();
        log.i("KidsRegistration", "Emergency Name: " + emgName);
        EditText emergencyRelationK = (EditText) findViewById(R.id.emergencyRelationK);
        String emgRelation = emergencyRelationK.getText().toString();
        log.i("KidsRegistration", "Emergency Relation: " + emgRelation);
        EditText emergencyAddress1K = (EditText) findViewById(R.id.emergencyAddress1K);
        String emgAddress1 = emergencyAddress1K.getText().toString();
        log.i("KidsRegistration", "Emergency Address: " + emgAddress1);
        EditText emergencyAddress2k = (EditText) findViewById(R.id.emergencyAddress2K);
        String emgAddress2 = emergencyAddress2k.getText().toString();
        log.i("KidsRegistration", "Emergency Address: " + emgAddress2);
        EditText emergencyPhoneK = (EditText) findViewById(R.id.emergencyPhoneK);
        String emgPhone = emergencyPhoneK.getText().toString();
        log.i("KidsRegistration", "Emergency Phone: " + emgPhone);
        EditText emergencyEmailK = (EditText) findViewById(R.id.emergencyEmailK);
        String emgEmail = emergencyEmailK.getText().toString();
        log.i("KidsRegistration", "Emergency Email: " + emgEmail);
        EditText emergencyPostcodeK = (EditText) findViewById(R.id.emergencyPostcodeK);
        String emgPostcode = emergencyPostcodeK.getText().toString();
        log.i("KidsRegistration", "Emergency Postcode: " + emgPostcode);

        startActivity(e);
    }
}
