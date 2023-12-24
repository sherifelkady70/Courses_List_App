package com.route.routeoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAndroidCourse(View v){
        Intent intent = new Intent(this,AndroidCourseActivity.class);
        startActivity(intent);
    }

    public void onIosCourse(View v){
        Intent intent = new Intent(this,IosCourseActivity.class);
        startActivity(intent);
    }

    public void onFullstackCourse(View v){
        Intent intent = new Intent(this,FullStackCourseActivity.class);
        startActivity(intent);
    }

}