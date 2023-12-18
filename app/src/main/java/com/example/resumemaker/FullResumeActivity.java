package com.example.resumemaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FullResumeActivity extends AppCompatActivity
{

    TextView txtFullname,txtPhone,txtEmail,txtAddress,txtGender,txtMaratial,txtLanguage,txtssc,txthsc;
    TextView txtJob,txtCollage,txtsscyear,txthscyear,txtcollageyear,txtSkills,txtHobbies;
    Button btnBack;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_full_resume);

            initview();
        }

    private void initview()
    {

        txtFullname = findViewById(R.id.txtFullname);
        txtPhone = findViewById(R.id.txtPhone);
        txtEmail = findViewById(R.id.txtEmail);
        txtAddress = findViewById(R.id.txtAddress);

        txtGender = findViewById(R.id.txtGender);

        txtMaratial = findViewById(R.id.txtMaratial);

//        btnReset = findViewById(R.id.btnReset);

        btnBack = findViewById(R.id.btnBack);

        txtLanguage = findViewById(R.id.txtLanguage);

        txtJob = findViewById(R.id.txtJob);

        txtssc = findViewById(R.id.txtssc);
        txthsc = findViewById(R.id.txthsc);
        txtCollage = findViewById(R.id.txtCollage);
        txtsscyear = findViewById(R.id.txtsscyear);
        txthscyear = findViewById(R.id.txthscyear);
        txtcollageyear = findViewById(R.id.txtcollageyear);

        txtSkills = findViewById(R.id.txtSkills);

        txtHobbies = findViewById(R.id.txtHobbies);

        String Name,Phone,Email,Address,Gender,MarriageStatus,Language;
        String sscmarks,hscmarks,collagemarks,sscyear,hscyear,collageyear,Job,Skill,Hobbies;

        Name = getIntent().getExtras().getString("intxtFullName");
        Phone = getIntent().getExtras().getString("intxtPhoneNumber");
        Email = getIntent().getExtras().getString("intxtEmail");
        Address = getIntent().getExtras().getString("intxtAddress");

        Gender = getIntent().getExtras().getString("SelectGender");

        MarriageStatus = getIntent().getExtras().getString("SelectMaratialStatus");

        Language = getIntent().getStringExtra("SelectLanguage");

        Job = getIntent().getExtras().getString("txtJobExprience");

        sscmarks = getIntent().getExtras().getString("txtsscMarks");
        hscmarks = getIntent().getExtras().getString("txthscMarks");
        collagemarks = getIntent().getExtras().getString("txtcollageMarks");
        sscyear = getIntent().getExtras().getString("txtsscyear");
        hscyear = getIntent().getExtras().getString("txthscyear");
        collageyear = getIntent().getExtras().getString("txtcollageyear");

        Skill = getIntent().getStringExtra("SelectSkill");

        Hobbies = getIntent().getStringExtra("SelectHobbies");

        txtFullname.setText("Full Name:-"+Name);
        txtPhone.setText("Phone Number:-"+Phone);
        txtEmail.setText("Email:-" + Email);
        txtAddress.setText("Address:-" + Address);

        txtGender.setText("Gender:-" + Gender);

        txtMaratial.setText("Status:-"+ MarriageStatus);

        txtLanguage.setText("Language:-"+Language);

        txtHobbies.setText("Hobbies:-"+Hobbies);

        txtJob.setText(Job);

        txtssc.setText("10th(%):-"+sscmarks);
        txthsc.setText("12th(%):-"+hscmarks);
        txtCollage.setText("Graduation(%):-"+collagemarks);
        txtsscyear.setText("Passing Year(10th):-"+sscyear);
        txthscyear.setText("Passing Year(12th):-"+hscyear);
        txtcollageyear.setText("Passing Year(Graduation):-"+collageyear);

        txtSkills.setText(Skill);


        btnBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });
    }
}