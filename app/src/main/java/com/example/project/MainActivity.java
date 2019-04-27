package com.example.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.KeyEvent;

import java.security.Key;
/*
hello
 */

public class MainActivity extends AppCompatActivity {
    TextView Answer;
    EditText firstNumber, secondNumber;
    Button multiply, divide, add, subtract;

    int NumberOne;
    int NumberTwo;
    float solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Answer = findViewById(R.id.answer);
        firstNumber = findViewById(R.id.firstNum);
        secondNumber = findViewById(R.id.secondNum);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberOne = Integer.parseInt(firstNumber.getText().toString());
                NumberTwo = Integer.parseInt(secondNumber.getText().toString());
                solution = NumberOne + NumberTwo;
                Answer.setText(String.valueOf(solution));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberOne = Integer.parseInt(firstNumber.getText().toString());
                NumberTwo = Integer.parseInt(secondNumber.getText().toString());
                solution = NumberOne - NumberTwo;
                Answer.setText(String.valueOf(solution));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberOne = Integer.parseInt(firstNumber.getText().toString());
                NumberTwo = Integer.parseInt(secondNumber.getText().toString());
                solution = NumberOne * NumberTwo;
                Answer.setText(String.valueOf(solution));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberOne = Integer.parseInt(firstNumber.getText().toString());
                NumberTwo = Integer.parseInt(secondNumber.getText().toString());
                if (NumberTwo == 0) {
                    Answer.setText("YOU CANT DO THAT!");
                } else {
                    solution = NumberOne / NumberTwo;
                    Answer.setText(String.valueOf(solution));
                }
            }
        });
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN || keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            firstNumber.setText("");
            secondNumber.setText("");
            Answer.setText("");
            return true;
        }
        return true;
    }
}
