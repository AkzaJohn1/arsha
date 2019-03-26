package com.example.admin.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText number11,number2;
Button btn;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Addition(View V)
    {
        number11=(EditText)findViewById(R.id.num1);
        number2=(EditText)findViewById(R.id.num2);
        btn=(Button)findViewById(R.id.ADD);
        res=(TextView)findViewById(R.id.answer);
        int i=Integer.parseInt(number11.getText().toString());
        int j=Integer.parseInt(number2.getText().toString());
        int k=i+j;
        res.setText(String.valueOf(k));


    }
}
