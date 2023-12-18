package com.example.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class ResumeActivity extends AppCompatActivity
{
    Button btnSubmit,btnReset;
    RadioButton rb,rg;
    RadioButton rbMale,rbFemale,rbOther,rbSingle,rbMarried,rbDivorced;
    TextInputEditText intxtFullName,intxtPhoneNumber,intxtEmail,intxtAddress;
    CheckBox chkenglish,chkhindi,chkgujarati,chkmarathi;
    RadioGroup rgGender,rgMaritalstatus;
    CheckBox chkSinging,chkDancing,chkTravelling,chkReading,chkMovies,chkLearning,chkPlaying,chkWriting;
    EditText txtsscMarks,txthscMarks,txtcollageMarks;
    EditText txtsscyear,txthscyear,txtcollageyear;
    TextInputEditText txtJobExprience;
    CheckBox chkCodeing,chkProblem,chkLeadership,chkTearmWork,chkCommunicationSkill,chkJobLearning;

    StringBuilder SelectLanguage = new StringBuilder();
    StringBuilder SelectSkill = new StringBuilder();
    StringBuilder SelectHobbies = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        initView();
    }

    private void initView()
    {

//        btnReset = findViewById(R.id.btnReset);

        btnSubmit = findViewById(R.id.btnSubmit);

        //-----------------------personal details-------------------//
            intxtFullName = findViewById(R.id.intxtFullName);
            intxtPhoneNumber = findViewById(R.id.intxtPhoneNumber);
            intxtEmail = findViewById(R.id.intxtEmail);
            intxtAddress = findViewById(R.id.intxtAddress);
        //-----------------------personal details-------------------//

        //-----------------------Language details-------------------//
            chkenglish = findViewById(R.id.chkenglish);
            chkhindi = findViewById(R.id.chkhindi);
            chkgujarati = findViewById(R.id.chkgujarati);
            chkmarathi = findViewById(R.id.chkmarathi);
        //-----------------------Langauge details-------------------//

        //-----------------------Select Gender-------------------//
            rgGender = findViewById(R.id.rgGender);
            rbMale = findViewById(R.id.rbMale);
            rbFemale = findViewById(R.id.rbFemale);
            rbOther = findViewById(R.id.rbOther);
        //-----------------------Select Gender-------------------//

        //-----------------------Select Maritalstatus-------------------//
            rgMaritalstatus = findViewById(R.id.rgMaritalstatus);
            rbSingle = findViewById(R.id.rbSingle);
            rbMarried = findViewById(R.id.rbMarried);
            rbDivorced = findViewById(R.id.rbDivorced);
        //-----------------------Select Maritalstatus-------------------//

        //-----------------------Hobbies-------------------//
            chkSinging = findViewById(R.id.chkSinging);
            chkDancing = findViewById(R.id.chkDancing);
            chkTravelling = findViewById(R.id.chkTravelling);
            chkReading = findViewById(R.id.chkReading);
            chkMovies = findViewById(R.id.chkMovies);
            chkLearning = findViewById(R.id.chkLearning);
            chkPlaying = findViewById(R.id.chkPlaying);
            chkWriting = findViewById(R.id.chkWriting);
        //-----------------------Hobbies-------------------//

        //-----------------------percentage-------------------//
            txtsscMarks = findViewById(R.id.txtsscMarks);
            txthscMarks = findViewById(R.id.txthscMarks);
            txtcollageMarks = findViewById(R.id.txtcollageMarks);
        //-----------------------percentage-------------------//

        //-----------------------Passing years-------------------//
            txtsscyear = findViewById(R.id.txtsscyear);
            txthscyear = findViewById(R.id.txthscyear);
            txtcollageyear = findViewById(R.id.txtcollageyear);
        //-----------------------Passing years-------------------//

        //-----------------------Job exprience-------------------//
            txtJobExprience = findViewById(R.id.txtJobExprience);
        //-----------------------Job exprience-------------------//

        //-----------------------check Job exprience-------------------//
            chkCodeing = findViewById(R.id.chkCodeing);
            chkProblem = findViewById(R.id.chkProblem);
            chkLeadership = findViewById(R.id.chkLeadership);
            chkTearmWork = findViewById(R.id.chkTearmWork);
            chkCommunicationSkill = findViewById(R.id.chkCommunicationSkill);
            chkJobLearning = findViewById(R.id.chkJobLearning);
        //-----------------------check Job exprience-------------------//


        btnSubmit.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                int SelectedRadiobutton = rgGender.getCheckedRadioButtonId();
                int SelectRb = rgMaritalstatus.getCheckedRadioButtonId();

                int SelectGender = rgGender.getCheckedRadioButtonId();
                int SelectMaratialStatus = rgMaritalstatus.getCheckedRadioButtonId();


                //-------------------Personal details---------------//
                    String Name = intxtFullName.getText().toString();
                    String Phone = intxtPhoneNumber.getText().toString();
                    String Email = intxtEmail.getText().toString();
                    String Address = intxtAddress.getText().toString();
                //-------------------Personal details---------------//

                //-------------------Gender---------------//
                    rb = findViewById(SelectGender);
                    String Gender = rb.getText().toString();
                //-------------------Gender---------------//

                //-------------------Maratial Status---------------//
                    rg = findViewById(SelectMaratialStatus);
                    String MaritalStatus = rg.getText().toString();
                //-------------------Maratial Status---------------//

                //-------------------Language---------------//
//                String English = chkenglish.getText().toString();
//                String Hindi = chkhindi.getText().toString();
//                String Gujarati = chkgujarati.getText().toString();
//                String Marathi = chkmarathi.getText().toString();
                //-------------------Language---------------//

                //-------------------Percentage---------------//
                    String sscMarks = txtsscMarks.getText().toString();
                    String hscMarks = txthscMarks.getText().toString();
                    String collageMarks = txtcollageMarks.getText().toString();
                //-------------------Percentage---------------//

                //-------------------year---------------//
                    String sscyear = txtsscyear.getText().toString();
                    String hscyear = txthscyear.getText().toString();
                    String collageyears = txtcollageyear.getText().toString();
                //-------------------year---------------//

                //----------------job Experience----------------//
                    String JobExprience = txtJobExprience.getText().toString();
                //----------------job Expreience----------------//

                //-----------------------personal details-------------------//
                if (intxtFullName.getText().toString().isEmpty() == true) {
                    intxtFullName.setError("please enter your name");
                    Toast.makeText(ResumeActivity.this, "Plesae enter your name", Toast.LENGTH_SHORT).show();
                }
                else if (intxtPhoneNumber.length() < 10)
                {
                    intxtPhoneNumber.setError("Please enter your Phone number");
                    Toast.makeText(ResumeActivity.this, "Enter MobileNumber Minimum 4 to 10 digit", Toast.LENGTH_SHORT).show();
                    Toast.makeText(ResumeActivity.this, "Plesae enter your Phone number", Toast.LENGTH_SHORT).show();
                }
                else if (intxtEmail.getText().toString().isEmpty() == true)
                {
                    intxtEmail.setError("Please enter your Email");
                    Toast.makeText(ResumeActivity.this, "Plesae enter your Email", Toast.LENGTH_SHORT).show();
                }
                else if (intxtAddress.getText().toString().isEmpty() == true)
                {
                    intxtAddress.setError("Please enter your Address");
                    Toast.makeText(ResumeActivity.this, "Plesae enter your Address", Toast.LENGTH_SHORT).show();
                }
                //-----------------------personal details-------------------//


                //-----------------------Language details-------------------//
                if (chkenglish.isChecked())
                {
                    SelectLanguage.append(" " + chkenglish.getText().toString());
                }
                if (chkhindi.isChecked())
                {
                    SelectLanguage.append(" " + chkhindi.getText().toString());
                }
                if (chkgujarati.isChecked())
                {
                    SelectLanguage.append(" " + chkgujarati.getText().toString());
                }
                if (chkmarathi.isChecked())
                {
                    SelectLanguage.append(" " + chkmarathi.getText().toString());
                }
                else if (SelectLanguage == null)
                {
//                    if (chkenglish.isChecked())
//                    {
//                        SelectLanguage.append(" " + chkenglish.getText().toString());
//                    }
//                    else if (chkhindi.isChecked())
//                    {
//                        SelectLanguage.append(" " + chkhindi.getText().toString());
//                    }
//                    else if (chkgujarati.isChecked())
//                    {
//                        SelectLanguage.append(" " + chkgujarati.getText().toString());
//                    }
//                    else if (chkmarathi.isChecked())
//                    {
//                        SelectLanguage.append(" " + chkmarathi.getText().toString());
//                    }
                    Toast.makeText(ResumeActivity.this, "please select the Language", Toast.LENGTH_SHORT).show();
                }
                //-----------------------Language details-------------------//

                //-----------------------Select Gender-------------------//
                 else if (SelectedRadiobutton == -1)
                 {
                    rb = findViewById(SelectedRadiobutton);
                    Toast.makeText(ResumeActivity.this, "Please select the gender", Toast.LENGTH_SHORT).show();
                 }
                //-----------------------Select Gender-------------------//

                //-----------------------Select Maritalstatus-------------------//
                else if (SelectRb == -1)
                {
                    rg = findViewById(SelectRb);
                    Toast.makeText(ResumeActivity.this, "Please select the Marital status", Toast.LENGTH_SHORT).show();
                }
                //-----------------------Select Maritalstatus-------------------//

                //-----------------------Hobbies-------------------//
                if (chkSinging.isChecked())
                {
                    SelectHobbies.append(" " + chkSinging.getText().toString());
                }
                if (chkDancing.isChecked())
                {
                    SelectHobbies.append(" " + chkDancing.getText().toString());
                }
                if (chkTravelling.isChecked())
                {
                    SelectHobbies.append(" " + chkTravelling.getText().toString());
                }
                if (chkReading.isChecked())
                {
                    SelectHobbies.append(" " + chkReading.getText().toString());
                }
                if (chkMovies.isChecked())
                {
                    SelectHobbies.append(" " + chkMovies.getText().toString());
                }
                if (chkLearning.isChecked())
                {
                    SelectHobbies.append(" " + chkLearning.getText().toString());
                }
                if (chkPlaying.isChecked())
                {
                    SelectHobbies.append(" " + chkPlaying.getText().toString());
                }
                if (chkWriting.isChecked())
                {
                    SelectHobbies.append(" " + chkWriting.getText().toString());
                }
                else if (SelectHobbies == null)
                {
//                    if (chkSinging.isChecked())
//                    {
//                        SelectHobbies.append(" " + chkSinging.getText().toString());
//                    }
//                    else if (chkDancing.isChecked())
//                    {
//                        SelectHobbies.append(" " + chkDancing.getText().toString());
//                    }
//                    else if (chkTravelling.isChecked())
//                    {
//                        SelectHobbies.append(" " + chkTravelling.getText().toString());
//                    }
//                    else if (chkReading.isChecked())
//                    {
//                        SelectHobbies.append(" " + chkReading.getText().toString());
//                    }
//                    else if (chkMovies.isChecked())
//                    {
//                        SelectHobbies.append(" " + chkMovies.getText().toString());
//                    }
//                    else if (chkLearning.isChecked())
//                    {
//                        SelectHobbies.append(" " + chkLearning.getText().toString());
//                    }
//                    else if (chkPlaying.isChecked())
//                    {
//                        SelectHobbies.append(" " + chkPlaying.getText().toString());
//                    }
//                    else if (chkWriting.isChecked())
//                    {
//                        SelectHobbies.append(" " + chkWriting.getText().toString());
//                    }
                    Toast.makeText(ResumeActivity.this, "Please select your Hobbies", Toast.LENGTH_SHORT).show();
                }

                //-----------------------Hobbies-------------------//

                //-----------------------percentage-------------------//
                else if (txtsscMarks.getText().toString().isEmpty() == true)
                {
                    txtsscMarks.setError("please enter your ssc marks");
                    Toast.makeText(ResumeActivity.this, "please enter your ssc marks", Toast.LENGTH_SHORT).show();
                }
                else if (txthscMarks.getText().toString().isEmpty() == true)
                {
                    txtsscMarks.setError("please enter your hsc marks");
                    Toast.makeText(ResumeActivity.this, "please enter your hsc marks", Toast.LENGTH_SHORT).show();
                }
                else if (txtcollageMarks.getText().toString().isEmpty() == true)
                {
                    txtsscMarks.setError("please enter your Gradutaion marks");
                    Toast.makeText(ResumeActivity.this, "please enter your Gradutaion marks", Toast.LENGTH_SHORT).show();
                }
                //-----------------------percentage-------------------//

                //-----------------------Passing years-------------------//
                else if (txtsscyear.getText().toString().isEmpty() == true)
                {
                    txtsscyear.setError("please enter your ssc year");
                    Toast.makeText(ResumeActivity.this, "please enter your ssc year", Toast.LENGTH_SHORT).show();
                }
                else if (txthscyear.getText().toString().isEmpty() == true)
                {
                    txthscyear.setError("please enter your hsc year");
                    Toast.makeText(ResumeActivity.this, "please enter your hsc year", Toast.LENGTH_SHORT).show();
                }
                else if (txtcollageyear.getText().toString().isEmpty() == true)
                {
                    txtcollageyear.setError("please enter your Gradutaion year");
                    Toast.makeText(ResumeActivity.this, "please enter your Gradutaion year", Toast.LENGTH_SHORT).show();
                }
                //-----------------------Passing years-------------------//

                //-----------------------Job exprience-------------------//
                else if (txtJobExprience.getText().toString().isEmpty() == true)
                {
                    txtJobExprience.setError("please enter your JobExprience year");
                    Toast.makeText(ResumeActivity.this, "please enter your JobExprience year", Toast.LENGTH_SHORT).show();
                }
                //-----------------------Job exprience-------------------//

                //-----------------------Hobbies-------------------//
                if (chkCodeing.isChecked())
                {
                    SelectSkill.append(" " + chkCodeing.getText().toString());
                }
                if (chkProblem.isChecked())
                {
                    SelectSkill.append(" " + chkProblem.getText().toString());
                }
                if (chkLeadership.isChecked())
                {
                    SelectSkill.append(" " + chkLeadership.getText().toString());
                }
                if (chkTearmWork.isChecked())
                {
                    SelectSkill.append(" " + chkTearmWork.getText().toString());
                }
                if (chkCommunicationSkill.isChecked())
                {
                    SelectSkill.append(" " + chkCommunicationSkill.getText().toString());
                }
                if (chkLearning.isChecked())
                {
                    SelectSkill.append(" " + chkLearning.getText().toString());
                }
               else if (SelectSkill == null)
               {
//                    if (chkCodeing.isChecked())
//                    {
//                        SelectSkill.append(" " + chkCodeing.getText().toString());
//                    }
//                    if (chkProblem.isChecked())
//                    {
//                        SelectSkill.append(" " + chkProblem.getText().toString());
//                    }
//                     if (chkLeadership.isChecked())
//                    {
//                        SelectSkill.append(" " + chkLeadership.getText().toString());
//                    }
//                     if (chkTearmWork.isChecked())
//                    {
//                        SelectSkill.append(" " + chkTearmWork.getText().toString());
//                    }
//                     if (chkCommunicationSkill.isChecked())
//                    {
//                        SelectSkill.append(" " + chkCommunicationSkill.getText().toString());
//                    }
//                     if (chkLearning.isChecked())
//                    {
//                        SelectSkill.append(" " + chkLearning.getText().toString());
//                    }

                    Toast.makeText(ResumeActivity.this, "Please select your Skill", Toast.LENGTH_SHORT).show();
                }
                //-----------------------Hobbies-------------------//
                else
                {
                    Intent i = new Intent(getApplicationContext(), FullResumeActivity.class);
                    i.putExtra("intxtFullName", Name);
                    i.putExtra("intxtPhoneNumber", Phone);
                    i.putExtra("intxtEmail", Email);
                    i.putExtra("intxtAddress", Address);

                    i.putExtra("SelectGender", Gender);
                    i.putExtra("SelectMaratialStatus", MaritalStatus);

                    i.putExtra("SelectLanguage", "->" + SelectLanguage);

                    i.putExtra("txtJobExprience", JobExprience);

                    i.putExtra("SelectHobbies", "->" + SelectHobbies);

                    i.putExtra("txtsscMarks", sscMarks);
                    i.putExtra("txthscMarks", hscMarks);
                    i.putExtra("txtcollageMarks", collageMarks);


                    i.putExtra("txtsscyear", sscyear);
                    i.putExtra("txthscyear", hscyear);
                    i.putExtra("txtcollageyear", collageyears);

                    i.putExtra("SelectSkill", "," + SelectSkill);
                    startActivity(i);
                }
            }
        });

    }
}
