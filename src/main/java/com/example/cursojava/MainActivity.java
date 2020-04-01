package com.example.cursojava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1 ,num2, result;
    Button buttonPlus , buttonMult , bulltonSub, buttonDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.editText1_1);
        num2 = findViewById(R.id.editText2_2);
        result = findViewById(R.id.editText3_1);

        buttonPlus = findViewById(R.id.buttonPlus);//
        buttonMult = findViewById(R.id.buttonMult);//
        bulltonSub = findViewById(R.id.buttonSub);
        buttonDiv = findViewById(R.id.buttonDivi);

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numb1, numb2, resul;
                numb1 = Double.parseDouble(num1.getText().toString());
                numb2 = Double.parseDouble(num2.getText().toString());
                if (numb2 == 0 ){
                    Toast.makeText(getApplicationContext(),"Divisao invalida", Toast.LENGTH_SHORT).show();
                }else {
                    resul = numb1 / numb2;
                    result.setText(String.valueOf(resul));
                }
            }
        });

        bulltonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numb1, numb2, resul;
                numb1 = Double.parseDouble(num1.getText().toString());
                numb2 = Double.parseDouble(num2.getText().toString());
                resul = numb1 - numb2;
                result.setText(String.valueOf(resul));
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numb1, numb2, resul;
                numb1 = Double.parseDouble(num1.getText().toString());
                numb2 = Double.parseDouble(num2.getText().toString());
                resul = numb1 * numb2;
                result.setText(String.valueOf(resul));
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numb1, numb2, resul;
                numb1 = Double.parseDouble(num1.getText().toString());
                numb2 = Double.parseDouble(num2.getText().toString());
                resul = numb1 + numb2;
                result.setText(String.valueOf(resul));
            }
        });
    }
}
