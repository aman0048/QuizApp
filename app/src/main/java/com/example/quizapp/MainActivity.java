package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.submit);
        RadioGroup radio1 = (RadioGroup) findViewById(R.id.radiogroup1);
        RadioGroup radio2 = (RadioGroup) findViewById(R.id.radiogroup2);
        RadioGroup radio3 = (RadioGroup) findViewById(R.id.radiogroup3);
        RadioGroup radio4 = (RadioGroup) findViewById(R.id.radiogroup4);



        LinearLayout layout1 = (LinearLayout) findViewById(R.id.linearlayout1); 

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int count = 0;
                int ans1 = radio1.getCheckedRadioButtonId();
                int ans2 = radio2.getCheckedRadioButtonId();
                int ans3 = radio3.getCheckedRadioButtonId();
                int ans4 = radio4.getCheckedRadioButtonId();

                RadioButton r1 = (RadioButton) findViewById(ans1);
                RadioButton r2 = (RadioButton) findViewById(ans2);
                RadioButton r3 = (RadioButton) findViewById(ans3);
                RadioButton r4 = (RadioButton) findViewById(ans4);
//                String s1 = r1.getText().toString();
                String s1 = (String) r1.getText();
                String s2 = (String) r2.getText();
                String s3 = (String) r3.getText();
                String s4 = (String) r4.getText();
                String correctAns1 = "mucormycosis";
                String correctAns2 = "3.14";
                String correctAns3 = "yes";
                String correctAns4 = "100A/B";

//                if (s1.equals(correctAns1)) {
//                    count++;
//                }
//
//                if (s2.equals(correctAns2)) {
//                    count++;
//                }
//                if (s3.equals(correctAns3)) {
//                    count++;
//                }
//                if (s4.equals(correctAns4)) {
//                    count++;
//                }
                //waise toh isse se ghamta farak nhi padna chaiye but still i am doing;
                ArrayList<String>al=new ArrayList<>();
                ArrayList<String>al1 = new ArrayList<>();

                    al.add(s1);
                    al.add(s2);
                    al.add(s3);
                    al.add(s4);
                    al1.add(correctAns1);
                    al1.add(correctAns2);
                    al1.add(correctAns3);
                    al1.add(correctAns4);
                    for(int i=0;i<al.size();i++){
                        if(al.get(i).equals(al1.get(i))){
                            count++;
                        }
                    }

                TextView display = new TextView(MainActivity.this);
                display.setText(count);
                
                layout1.addView(display);

                Toast.makeText(getBaseContext(),display.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}

