package com.example.vtusgpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityCGPA2 extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5,et6,et7,et8;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c_g_p_a2);

        et1=findViewById((R.id.editTextTextPersonName6));
        et2=findViewById((R.id.editTextTextPersonName11));
        et3=findViewById((R.id.editTextTextPersonName12));
        et4=findViewById((R.id.editTextTextPersonName13));
        et5=findViewById((R.id.editTextTextPersonName14));
        et6=findViewById((R.id.editTextTextPersonName15));
        et7=findViewById((R.id.editTextTextPersonName16));
        et8=findViewById((R.id.editTextTextPersonName17));
        tv1=findViewById((R.id.textView26));
        tv2=findViewById((R.id.textView27));
    }
    public void Calculate(View V) {
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
                float cgpa = (float) ((float) (24.0 * sem1 + 24.0 * sem2) / 48.0);
                float percentage = (float) ((float) (cgpa - 0.75) * 10.0);
                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem4 == 0.0 && sem5 == 0.0 && sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((float) (24.0 * sem1 + 24.0 * sem2 + sem3 * 28.0) / 76.0);
                float percentage = (float) ((float) (cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem5 == 0.0 && sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((24.0 * sem1 + 24.0 * sem2 + sem3 * 28.0 + 28.0 * sem4) / 104.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem6 == 0.0 && sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((24.0 * sem1 + 24.0 * sem2 + sem3 * 28.0 + 28.0 * sem4 + 26 * sem5) / 130.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem7 == 0.0 && sem8 == 0.0) {
                float cgpa = (float) ((24.0 * sem1 + 24.0 * sem2 + sem3 * 28.0 + 28.0 * sem4 + 26.0 * sem5 + 26.0 * sem6) / 156.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else if (sem8 == 0.0) {
                float cgpa = (float) ((24.0 * sem1 + 24.0 * sem2 + sem3 * 28.0 + 28.0 * sem4 + 26.0 * sem5 + 26.0 * sem6 + 24.0 * sem7) / 180.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);

                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            } else {
                float cgpa = (float) ((24.0 * sem1 + 24.0 * sem2 + 28.0 * sem3 + 28.0 * sem4 + 26.0 * sem5 + 26.0 * sem6 + 24.0 * sem7 + 20.0 * sem8) / 200.0);
                float percentage = (float) ((cgpa - 0.75) * 10.0);
                tv1.setText(String.valueOf(cgpa));
                tv2.setText(String.valueOf(percentage));
            }
        }
    }
}