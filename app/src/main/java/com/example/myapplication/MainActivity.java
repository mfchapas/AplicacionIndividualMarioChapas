package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Num1, Num2;
    Button suma, resta, mult, div;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);

        suma=findViewById(R.id.sumar);
        resta=findViewById(R.id.restar);
        mult=findViewById(R.id.mult);
        div=findViewById(R.id.div);
        resultado=findViewById(R.id.resultado);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String N1= Num1.getText().toString();
        String N2= Num2.getText().toString();

        int integer1=Integer.parseInt(N1);
        int integer2=Integer.parseInt(N2);

        int respuesta=0;


        switch (v.getId()) {
            case R.id.sumar:
                respuesta=integer1+integer2;
                break;
            case R.id.restar:
                respuesta=integer1-integer2;
                break;
            case R.id.mult:
                respuesta=integer1*integer2;
                break;
            case R.id.div:
                respuesta=integer1/integer2;
                break;
        }
        resultado.setText(""+respuesta);
    }
}
