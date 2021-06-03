package com.example.vtusgpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityCGPA extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5,et6,et7,et8;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c_g_p);

        et1=findViewById((R.id.editTextTextPersonName7));
        et2=findViewById((R.id.editTextTextPersonName2));
        et3=findViewById((R.id.editTextTextPersonName3));
        et4=findViewById((R.id.editTextTextPersonName4));
        et5=findViewById((R.id.editTextTextPersonName5));
        et6=findViewById((R.id.editTextTextPersonName));
        et7=findViewById((R.id.editTextTextPersonName8));
        et8=findViewById((R.id.editTextTextPersonName20));
        tv1=findViewById((R.id.textView24));
        tv2=findViewById((R.id.textView25));

    }
    public void Calculate(View V){
        float sem1 = Float.parseFloat(et1.getText().toString());
        float sem2 = Float.parseFloat(et2.getText().toString());
        float sem3 = Float.parseFloat(et3.getText().toString());
        float sem4 = Float.parseFloat(et4.getText().toString());
        float sem5 = Float.parseFloat(et5.getText().toString());
        float sem6 = Float.parseFloat(et6.getText().toString());
        float sem7 = Float.parseFloat(et7.getText().toString());
        float sem8 = Float.parseFloat(et8.getText().toString());
        if(sem1<=10.0&&sem2<=10.0&&sem3<=10.0&&sem4<=10.0&&sem5<=10.0&&sem6<=10.0&&sem8<=10.0) {
            if (sem3 == 0.0 && sem4 == 0.0 && sem5 == 0.0 && sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((float) (20.0 * sem1 + 20.0 * sem2) / 40.0);
                float percentage = (float) ((float) (cgpa - 0.75) * 10.0);
                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem4 == 0.0 && sem5 == 0.0 && sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((float) (20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0) / 64.0);
                float percentage = (float) ((float) (cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem5 == 0.0 && sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0 + 24.0 * sem4) / 88.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0 + 24.0 * sem4 + 25 * sem5) / 113.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0 + 24.0 * sem4 + 25 * sem5 + 24 * sem6) / 137.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem8 == 0.0) {
                float cgpa = (float)((20.0 * sem1 + 20.0 * sem2 + sem3 * 24.0 + 24.0 * sem4 + 25 * sem5 + 24 * sem6 + 20 * sem7) / 157.0);
                float percentage =(float) ((cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else {
                float cgpa = (float) ((20.0 * sem1 + 20.0 * sem2 + 24.0 * sem3 + 24.0 * sem4 + 25 * sem5 + 24 * sem6 + 20 * sem7 + 18 * sem8) / 175.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);
                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            }
        }

    }

}