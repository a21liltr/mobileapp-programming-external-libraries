package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.my_image);
        String imageURL = "https://plus.unsplash.com/premium_photo-1674035036840-02832578b956?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1780&q=80";

        // Using external library Picasso to load an image from URL into my Image View.
        Picasso.get()
                .load(imageURL)
                .placeholder(R.drawable.buffering)
                .into(imageView);
    }
}
