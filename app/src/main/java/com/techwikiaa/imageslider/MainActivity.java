package com.techwikiaa.imageslider;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         RelativeLayout logoIV;


        List<SlideModel> imageList = new ArrayList<>(); // Create movie image list
        List<SlideModel> newsList = new ArrayList<>(); // Create news image list


/*
        imageList.add(new SlideModel(R.drawable.venom,"movie VENOM", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.ironlady,"movie ironlady", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.thor,"movie thor", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.johnwick,"movie johnwick", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.rampage,"movie rampage",ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList);


        // on below line we are initializing our variables.
        logoIV = findViewById(R.id.relative2);

        // on below line we are setting background color to transparent
        logoIV.setBackground(getDrawable(R.drawable.ultron));
        logoIV.setBackgroundColor(getResources().getColor(android.R.color.background_dark));


 */
    }


    }

