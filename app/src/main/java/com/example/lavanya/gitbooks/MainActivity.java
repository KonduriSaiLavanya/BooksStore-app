package com.example.lavanya.gitbooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);
        t3=findViewById(R.id.text3);
        t4=findViewById(R.id.text4);
        t5=findViewById(R.id.text5);
        t6=findViewById(R.id.text6);
        t7=findViewById(R.id.text7);
        t8=findViewById(R.id.text8);
        t9=findViewById(R.id.text9);
        t10=findViewById(R.id.text10);
        t11=findViewById(R.id.text11);
        t12=findViewById(R.id.text12);
        t13=findViewById(R.id.text13);
        t14=findViewById(R.id.text14);
        Toast.makeText(this, "Welcome to the Books Store", Toast.LENGTH_SHORT).show();


    }
}
