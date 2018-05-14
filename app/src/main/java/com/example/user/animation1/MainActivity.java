package com.example.user.animation1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean showingCat1 = true;
//    ImageView imageView = findViewById(R.id.imageView);
//    ImageView imageView2 = findViewById(R.id.imageView2);


    public void fade(View view){


        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);

        if (showingCat1) {

            imageView.animate().alpha(0).scaleX(1.5f).scaleY(1.5f).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            showingCat1 = false;
        }
        else {
            imageView.animate().alpha(1).setDuration(2000);
            imageView.animate().scaleX(0.6f).scaleY(0.6f).setDuration(1000);
            imageView2.animate().alpha(0).setDuration(2000);
            showingCat1 = true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView.animate().setDuration(2000);
    }
}
