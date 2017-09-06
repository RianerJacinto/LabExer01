package com.rianer.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rianer.labexer1.R;

public class MainActivity extends AppCompatActivity {

    EditText et_Quiz1;
    EditText et_Quiz2;
    EditText et_Seatworks;
    EditText et_LabExercises;
    EditText et_MajorExam;
    Button btn_Compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Quiz1 = (EditText) findViewById(R.id.etQuiz1);
        et_Quiz2 = (EditText) findViewById(R.id.etQuiz2);
        et_Seatworks = (EditText) findViewById(R.id.etSeatworks);
        et_LabExercises = (EditText) findViewById(R.id.etLabExercises);
        et_MajorExam = (EditText) findViewById(R.id.etMajorExam);
        btn_Compute = (Button) findViewById(R.id.btnCompute);
    }

    public void callSecondActivity(View view) {
        Intent intent = new Intent(this, ActivitySecond.class);
        double dQ1 =.10*(Integer.parseInt(et_Quiz1.getText().toString()));
        double dQ2 =.10*(Integer.parseInt(et_Quiz2.getText().toString()));
        double dSW =.10*(Integer.parseInt(et_Seatworks.getText().toString()));
        double dLE =.40*(Integer.parseInt(et_LabExercises.getText().toString()));
        double dME =.30*(Integer.parseInt(et_MajorExam.getText().toString()));
        double ra = dQ1 + dQ2 + dSW + dLE + dME;
        intent.putExtra("ra",Double.toString(ra));
        String fg = new String();
        if ( ra < 60 ) {
            fg = "Failed";
        } else if ( ra <= 65 ) {
            fg = "3.00";
        }
        else if ( ra <= 70 ) {
            fg = "2.75";
        }
        else if ( ra <= 75 ) {
            fg="2.50";
        }
        else if ( ra <= 80 ) {
            fg = "2.25";
        }
        else if ( ra <= 85 ) {
            fg = "2.00";
        }
        else if ( ra <= 90 ) {
            fg = "1.75";
        }else if ( ra <= 92 ) {
            fg = "1.5";
        }
        else if ( ra <= 94 ) {
            fg = "1.25";
        }
        else if ( ra <= 100 ) {
            fg = "1.00";
        }
        intent.putExtra("fg",fg);
        startActivity(intent);
    }
}
