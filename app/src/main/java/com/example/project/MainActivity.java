package com.example.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    TextView Answer;
    EditText firstNumber, secondNumber;
    Button multiply, divide, add, subtract, square, root, log, inverse, xn;

    float NumberOne;
    float NumberTwo;
    float solution;
    int counter = 0;

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
        square = findViewById(R.id.square);
        root = findViewById(R.id.root);
        log = findViewById(R.id.log);
        inverse = findViewById(R.id.inverse);
        xn = findViewById(R.id.xn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || secondNumber == null
                        || firstNumber.length() == 0 || secondNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    NumberTwo = Float.parseFloat(secondNumber.getText().toString());
                    solution = NumberOne + NumberTwo;
                    Answer.setText(String.valueOf(solution));
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || secondNumber == null
                        || firstNumber.length() == 0 || secondNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    NumberTwo = Float.parseFloat(secondNumber.getText().toString());
                    solution = NumberOne - NumberTwo;
                    Answer.setText(String.valueOf(solution));
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || secondNumber == null
                        || firstNumber.length() == 0 || secondNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    NumberTwo = Float.parseFloat(secondNumber.getText().toString());
                    solution = NumberOne * NumberTwo;
                    Answer.setText(String.valueOf(solution));
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || secondNumber == null
                        || firstNumber.length() == 0 || secondNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    NumberTwo = Float.parseFloat(secondNumber.getText().toString());
                    if (NumberTwo == 0) {
                        Answer.setText("YOU CANT DO THAT!");
                    } else {
                        solution = NumberOne / NumberTwo;
                        Answer.setText(String.valueOf(solution));
                    }
                }
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || firstNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    solution = NumberOne * NumberOne;
                    Answer.setText(String.valueOf(solution));
                }
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || firstNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    solution = (float) Math.sqrt(NumberOne);
                    Answer.setText(String.valueOf(solution));
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || firstNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    solution = (float) Math.log(NumberOne);
                    Answer.setText(String.valueOf(solution));
                }
            }
        });

        inverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || firstNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    solution = 1 / NumberOne;
                    Answer.setText(String.valueOf(solution));
                }
            }
        });

        xn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == null || secondNumber == null
                        || firstNumber.length() == 0 || secondNumber.length() == 0) {
                    Answer.setText("Your inputs are invalid");
                } else {
                    NumberOne = Float.parseFloat(firstNumber.getText().toString());
                    NumberTwo = Float.parseFloat(secondNumber.getText().toString());
                    solution = (float) Math.pow(NumberOne, NumberTwo);
                    Answer.setText(String.valueOf(solution));
                }
            }
        });
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            counter++;
            if (counter % 2 == 0) {
                secondNumber.setText(firstNumber.getText());
                firstNumber.setText("");
            } else {
                firstNumber.setText(Answer.getText());
                secondNumber.setText("");
                Answer.setText("");
            }
        }
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            secondNumber.setText("");
            firstNumber.setText("");
            Answer.clearComposingText();
        }
        return true;
    }
}
