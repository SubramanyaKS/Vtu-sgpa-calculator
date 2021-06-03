package com.example.vtusgpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SgpaCalculation extends AppCompatActivity {

    EditText s1,s2,s3,s4,s5,s6,s7,s8,s9;
    EditText c1,c2,c3,c4,c5,c6,c7,c8,c9,sg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa_calculation);

        s1=findViewById((R.id.editText9));
        s2=findViewById((R.id.editText10));
        s3=findViewById((R.id.editText18));
        s4=findViewById((R.id.editText19));
        s5=findViewById((R.id.editText21));
        s6=findViewById((R.id.editText22));
        s7=findViewById((R.id.editText23));
        s8=findViewById((R.id.editText24));
        s9=findViewById((R.id.editText25));

        c1=findViewById((R.id.editText26));
        c2=findViewById((R.id.editText27));
        c3=findViewById((R.id.editText28));
        c4=findViewById((R.id.editText29));
        c5=findViewById((R.id.editText30));
        c6=findViewById((R.id.editText31));
        c7=findViewById((R.id.editText32));
        c8=findViewById((R.id.editText33));
        c9=findViewById((R.id.editText34));
        sg=findViewById((R.id.editText35));

    }
    public void SgpaCalculation(View V){
        int sb1 = Integer.parseInt(s1.getText().toString());
        int sb2 = Integer.parseInt(s2.getText().toString());
        int sb3 = Integer.parseInt(s3.getText().toString());
        int sb4 = Integer.parseInt(s4.getText().toString());
        int sb5 = Integer.parseInt(s5.getText().toString());
        int sb6 = Integer.parseInt(s6.getText().toString());
        int sb7 = Integer.parseInt(s7.getText().toString());
        int sb8 = Integer.parseInt(s8.getText().toString());
        int sb9 = Integer.parseInt(s9.getText().toString());
        int cred1 = Integer.parseInt(c1.getText().toString());
        int cred2 = Integer.parseInt(c2.getText().toString());
        int cred3 = Integer.parseInt(c3.getText().toString());
        int cred4 = Integer.parseInt(c4.getText().toString());
        int cred5 = Integer.parseInt(c5.getText().toString());
        int cred6 = Integer.parseInt(c6.getText().toString());
        int cred7 = Integer.parseInt(c7.getText().toString());
        int cred8 = Integer.parseInt(c8.getText().toString());
        int cred9 = Integer.parseInt(c9.getText().toString());

        if(sb1<=100 &&sb2<=100&&sb3<=100&&sb4<=100&&sb5<=100&&sb6<=100&&sb7<=100&&sb9<=100&&cred9<=4&&sb8<=100&&cred1<=4&&cred2<=4&&cred3<=4&&cred4<=4&&cred5<=4&&cred6<=4&&cred7<=4&&cred8<=4){
            int r1=((sb1/10)+1)*cred1;
            int r2=((sb2/10)+1)*cred2;
            int r3=((sb3/10)+1)*cred3;
            int r4=((sb4/10)+1)*cred4;
            int r5=((sb5/10)+1)*cred5;
            int r6=((sb6/10)+1)*cred6;
            int r7=((sb7/10)+1)*cred7;
            int r8=((sb8/10)+1)*cred8;
            int r9=((sb9/10)+1)*cred9;

            int ctotal = cred1+cred2+cred3+cred4+cred5+cred6+cred7+cred8+cred9;

            int sum=r1+r2+r3+r4+r5+r6+r7+r8+r9;
            float s =  (float)(sum);
            float c =  (float)(ctotal);
            float sgpa = s/c;
            sg.setText(String.valueOf(sgpa));
        }
        else{
            s1.setText("");
            s2.setText("");
            s3.setText("");
            s4.setText("");
            s5.setText("");
            s6.setText("");
            s7.setText("");
            s8.setText("");
            s9.setText("");
            c1.setText("");
            c2.setText("");
            c3.setText("");
            c4.setText("");
            c5.setText("");
            c6.setText("");
            c7.setText("");
            c8.setText("");
            c9.setText("");
        }
    }
}