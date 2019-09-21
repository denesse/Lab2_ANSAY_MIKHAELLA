package com.ansay.lab2_ansay_mikhaella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ValidateCourse extends AppCompatActivity {
    EditText course1, course2, course3, course4, course5, course6, course7, course8, inCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_course);
        inCourse = findViewById(R.id.inCourse);
    }
    public void back (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void check(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        //comparing input from iput and from sahredpreference file
        String c1SP = sp.getString("course1", null); //from file
        String c2SP = sp.getString("course2", null);
        String c3SP = sp.getString("course3", null);
        String c4SP = sp.getString("course4", null);
        String c5SP = sp.getString("course5", null);
        String c6SP = sp.getString("course6", null);
        String c7SP = sp.getString("course7", null);
        String c8SP = sp.getString("course8", null);

        String cc = inCourse.getText().toString();


        if (c1SP.equals(cc) || c2SP.equals(cc) || c3SP.equals(cc) || c4SP.equals(cc) || c5SP.equals(cc) || c6SP.equals(cc) || c7SP.equals(cc) || c8SP.equals(cc)) {
            Toast.makeText(this, "Course is available in UST", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Course not available", Toast.LENGTH_LONG).show();
        }
    }
    }


