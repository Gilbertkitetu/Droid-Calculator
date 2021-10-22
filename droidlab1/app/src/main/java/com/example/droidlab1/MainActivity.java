package com.example.droidlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Receiving send data
        //Intent intent = getIntent();
        //eg
        //intent.getStringExtra("key1");
        //intent.getIntExtra("key2", 0); 0 is a default value,

        //RECEIVING BUNDLE
            //Intent intent = getIntent();
                //bundle et = new Bundle();
                //et.getStringExtras("key1");
                //et.getIntExtras("key2");

        EditText name = findViewById(R.id.name);
        EditText regNo = findViewById(R.id.regNo);
        EditText age = findViewById(R.id.age);
        EditText email = findViewById(R.id.email);
        EditText phoneNumber = findViewById(R.id.phoneNumber);

        //TextView   for text views

        //The object for the droidlab1 class
        //student is the object name...

        Droidlab1 student = new Droidlab1();
        student.name =  "kitetu";
        student.age = 10;
        student.phone_number = "071243535";
        student.email = "kitetu@gmail.com";
        student.regNo = "C026-01-122/2019";

        String ageString = Integer.toString(student.age);

        //convert string to integer Integer.parseInt(...);

        name.setText(student.name);
        regNo.setText(student.regNo);
        //age.setText(Integer.toString(student.age));
        age.setText(ageString);
        email.setText(student.email);
        phoneNumber.setText(student.phone_number);

        //textview.setText();


        //getting text from input
        //student.name = name.getText()



//Intents
        //types 1. Implicit 2. Explicit
        //Explicit - start other apps within the OS. eg phone camera app, audio, video, maps
        //Implicit - used to start other activities
        //TO USE THEM WE CREATE AN OBJECT and PASS THE REFERENCE TO THE ACTIVITY WE ARE JUMBING TO.

        //code
        //      {

        //Intent intent = new Intent(getApplicationContext(), MainActivity1.class *class to link to*);

                // this is where you pass data to the next activity but how???????????
            //Three ways
                //1. Single data value
                //2. Usage of collection of values (bundles)
                //3. Adapter class
                        // 1. intent.putExtra(key, data value ); the key should not be duplicated
                                //intent.putExtra("key1", 25);
                        //2. bundle way
                                //Bundle bundle = new Bundle();
                                //bundle.putStringExtra("key1", "joan"):
                                    //bundle.putIntExtra("key2", 35);
                                //intent.putExtras(bundle);
        //startActivity(intent);

        //      }


//Buttons
    //botton.setonClickListener()

}

//PUT YOUR OWN METHOD HERE!!!!
//    METHOD NAME (PARAMETER) {
//        BODY
//                RETURN TYPE
//    }

    //EG
    public void showMe () {

    }


//public void Main String args[] {
//    }
}