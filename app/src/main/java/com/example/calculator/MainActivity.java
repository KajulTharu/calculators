package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    Button add,sub,mul ,div,floatt,mod;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       n1=findViewById(R.id.n1);
       n2=findViewById(R.id.n2);
       add=findViewById(R.id.add);
       sub=findViewById(R.id.sub);
       mul=findViewById(R.id.mul);
       div=findViewById(R.id.div);
       floatt=findViewById(R.id.floats);
       mod=findViewById(R.id.mod);
       result=findViewById(R.id.result);

        String num1,num2;
        num1=n1.getText().toString();
        num2=n2.getText().toString();

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            int add= Integer.parseInt(num1)+Integer.parseInt(num2);
            result.setText(String.valueOf(add));

           }
       });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int subs = Integer.parseInt(num1)-Integer.parseInt(num2);
                result.setText(String.valueOf(subs));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int muls = Integer.parseInt(num1)*Integer.parseInt(num2);
                result.setText(String.valueOf(muls));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int divs = Integer.parseInt(num1)/Integer.parseInt(num2);
                result.setText(String.valueOf(divs));


            }
        });








    }
}