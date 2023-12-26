package com.route.routeoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URISyntaxException;

public class DetailsCourseActivity extends AppCompatActivity {

    ImageView imageCourse;
    TextView textCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_course);
        imageCourse=findViewById(R.id.imageCourse);
        textCourse=findViewById(R.id.textCourse);
        textCourse.setMovementMethod(new ScrollingMovementMethod());
       Intent intent = getIntent();
       if(intent==null) return;
       String courseName = intent.getStringExtra(Constants.KEYINTENT);
       switch (courseName){
           case Constants.ANDROID:
               imageCourse.setImageResource(R.drawable.android);
               textCourse.setText(Constants.ANDROID_COURSE_DETAILS);
               break;
           case Constants.IOS:
               imageCourse.setImageResource(R.drawable.ios);
               textCourse.setText(Constants.IOS_COURSE_DETAILS);
               break;
           case Constants.FULLSTACK:
               imageCourse.setImageResource(R.drawable.fullstack);
               textCourse.setText(Constants.FULLSTACK_COURSE_DETAILS);
               break;
       }

    }
}