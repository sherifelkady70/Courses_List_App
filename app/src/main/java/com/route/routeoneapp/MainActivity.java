package com.route.routeoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onViewClick(View v){
        if(v.getId()==R.id.androidImage || v.getId()==R.id.androidBtn){
            startDetailsCourseActivity(Constants.ANDROID);
        }else if(v.getId()==R.id.iosImage || v.getId()==R.id.iosBtn){
            startDetailsCourseActivity(Constants.IOS);
        }else if(v.getId()==R.id.fullstackImage || v.getId() == R.id.fullstackBtn){
            startDetailsCourseActivity(Constants.FULLSTACK);
        }
    }

    public void startDetailsCourseActivity(String courseName){
        Intent intent = new Intent(this,DetailsCourseActivity.class);
        intent.putExtra(Constants.KEYINTENT,courseName);
        startActivity(intent);
    }
}