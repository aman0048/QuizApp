package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    int count = 0;
    Button btn,clear;
    RadioGroup radio1;
    RadioGroup radio2;
    RadioGroup radio3;
    RadioGroup radio4;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.submit);
        clear = (Button)findViewById(R.id.clear);
        radio1 = (RadioGroup) findViewById(R.id.radiogroup1);
        radio2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radio3 = (RadioGroup) findViewById(R.id.radiogroup3);
        radio4 = (RadioGroup) findViewById(R.id.radiogroup4);

        radio1.clearCheck();
        radio2.clearCheck();
        radio3.clearCheck();
        radio4.clearCheck();

        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // Get the selected Radio Button
                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
            }
        });
        radio2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // Get the selected Radio Button
                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
            }
        });
        radio3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // Get the selected Radio Button
                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
            }
        });
        radio4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // Get the selected Radio Button
                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
            }
        });

//        LinearLayout layout1 = (LinearLayout) findViewById(R.id.linearlayout1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ans1 = radio1.getCheckedRadioButtonId();
                int ans2 = radio2.getCheckedRadioButtonId();
                int ans3 = radio3.getCheckedRadioButtonId();
                int ans4 = radio4.getCheckedRadioButtonId();

                r1 = (RadioButton) findViewById(ans1);
                r2 = (RadioButton) findViewById(ans2);
                r3 = (RadioButton) findViewById(ans3);
                r4 = (RadioButton) findViewById(ans4);
//                String s1 = r1.getText().toString();
                String s1 = r1.getText().toString();
                String s2 = r2.getText().toString();
                String s3 = r3.getText().toString();
                String s4 = r4.getText().toString();
                String correctAns1 = "mucormycosis";
                String correctAns2 = "3.14";
                String correctAns3 = "yes";
                String correctAns4 = "100A/B";

                if (s1.contentEquals(correctAns1)) {
                    count+=1;
                }

                if (s2.contentEquals(correctAns2)) {
                    count++;
                }
                if (s3.contentEquals(correctAns3)) {
                    count++;
                }
                if (s4.contentEquals(correctAns4)) {
                    count++;
                }
                //waise toh isse se ghamta farak nhi padna chaiye but still i am doing;

//                if (ans1 == -1) {
//                    Toast.makeText(MainActivity.this, "No answer has been selected", Toast.LENGTH_SHORT).show();
//                } else {
//
//                    RadioButton radioButton = (RadioButton) radio1.findViewById(ans1);
//
//                    Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//                    count++;
//                }
//
//                if (ans2 == -1) {
//                    Toast.makeText(MainActivity.this, "No answer has been selected", Toast.LENGTH_SHORT).show();
//                } else {
//
//                    RadioButton radioButton = (RadioButton) radio2.findViewById(ans2);
//
//                    Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//                    count++;
//                }
//
//                if (ans3 == -1) {
//                    Toast.makeText(MainActivity.this, "No answer has been selected", Toast.LENGTH_SHORT).show();
//
//                } else {
//
//                    RadioButton radioButton = (RadioButton) radio3.findViewById(ans3);
//
//                    Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//                    count++;
//                }
//
//                if (ans4 == -1) {
//                    Toast.makeText(MainActivity.this, "No answer has been selected", Toast.LENGTH_SHORT).show();
//                }
//                else {
//
//                    RadioButton radioButton = (RadioButton) radio4.findViewById(ans4);
//
//                    Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//                    count++;
//                }
                Toast.makeText(MainActivity.this, String.valueOf(count), Toast.LENGTH_SHORT).show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                radio1.clearCheck();
                radio2.clearCheck();
                radio3.clearCheck();
                radio4.clearCheck();
            }
        });
    }
}

