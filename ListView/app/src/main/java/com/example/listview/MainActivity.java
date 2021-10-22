package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listOfItems);

        final String[] data = {"Facebook", "WhatsApp", "YouTube", " TikTok"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Create a new activity for each data item which has a logo and a small description.

                //workinng with images =: stote the images in the drawable founder. xml format
                //draw an image view.
                //declare the image view
                //Load th iamge
                //drawable = getResourse().getDrawable(R.drawable.xxxxx image name);
                //ImageView.setImageDrawable(drawable);

               // Toast.makeText(getApplicationContext(),adapter.getItem(i),Toast.LENGTH_SHORT).show();

            }
        });
    }
}