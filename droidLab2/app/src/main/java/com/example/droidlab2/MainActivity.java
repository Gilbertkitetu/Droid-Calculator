package com.example.droidlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final int CAMERA_REQUEST = 123;

    ImageView imageView;Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.button);

        imageView = findViewById(R.id.imageView);

    }

    public void btnClick (View v){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA_REQUEST);
            }

            public void onActivityResult(int requestcode, int resultcode, Intent data) {

                if (requestcode == CAMERA_REQUEST && resultcode == Activity.RESULT_OK) {
                    Bitmap Photo = (Bitmap) data.getExtras().get("data");
                    imageView.setImageBitmap(Photo);
                }
            }
}