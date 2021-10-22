package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;

    Button sendBtn;
    EditText textphoneNo;
    EditText textMessage;
    String phoneNo;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBtn = (Button) findViewById(R.id.send);
        textphoneNo = (EditText) findViewById(R.id.phoneNumber);
        textMessage = (EditText) findViewById(R.id.message);

        sendBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                sendSMSMessage();
            }
        });

    }
    protected void sendSMSMessage () {
        phoneNo = textphoneNo.getText().toString();
        message = textMessage.getText().toString();

        if((ContextCompat.checkSelfPermission(
                this, Manifest.permission.SEND_SMS
        )!= getPackageManager().PERMISSION_GRANTED)){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.SEND_SMS)){

            }else{
                ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.SEND_SMS},
                MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult (int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {

                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "SMS FAILED, Please try again", Toast.LENGTH_LONG).show();
                    return;
                }
                break;
            }
        }
    }
}