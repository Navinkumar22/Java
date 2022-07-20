package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttondot, buttonClear, buttonEqual, buttonPower,buttonComma;
    EditText  viewersEditText;

    float ValueOne, ValueTwo;

    boolean Addition, Subtract, Multiplication, Division, Power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            button0 = (Button) findViewById(R.id.button0);
            button1 = (Button) findViewById(R.id.button1);
            button2 = (Button) findViewById(R.id.button2);
            button3 = (Button) findViewById(R.id.button3);
            button4 = (Button) findViewById(R.id.button4);
            button5 = (Button) findViewById(R.id.button5);
            button6 = (Button) findViewById(R.id.button6);
            button7 = (Button) findViewById(R.id.button7);
            button8 = (Button) findViewById(R.id.button8);
            button9 = (Button) findViewById(R.id.button9);
            buttondot = (Button) findViewById(R.id.buttondot);
            buttonAdd = (Button) findViewById(R.id.buttonadd);
            buttonSub = (Button) findViewById(R.id.buttonsub);
            buttonMul = (Button) findViewById(R.id.buttonmul);
            buttonDiv = (Button) findViewById(R.id.buttonDiv);
            buttonClear = (Button) findViewById(R.id.buttonClear);
            buttonEqual = (Button) findViewById(R.id.buttonEqual);
            viewersEditText = (EditText) findViewById(R.id.viewersEditText);
            buttonPower=findViewById(R.id.buttonPower);


           button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "0");

                }
            });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "1");

                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "2");

                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "3");

                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "4");

                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "5");

                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "7");

                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "8");

                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + "9");

                }
            });


            buttondot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + ".");

                }
            });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (viewersEditText == null) {
                        viewersEditText.setText("");
                    } else {
                        ValueOne = Float.parseFloat(viewersEditText.getText() + "");
                        Addition = true;

                        viewersEditText.setText(null);
                    }
                }
            });

            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(viewersEditText.getText() + "");
                    Subtract = true;

                    viewersEditText.setText(null);
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(viewersEditText.getText() + "");
                    Multiplication = true;

                    viewersEditText.setText(null);
                }
            });

            buttonDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(viewersEditText.getText() + "");
                    Division = true;

                    viewersEditText.setText(null);
                }
            });
            buttonPower.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(viewersEditText.getText() + "");
                    Power = true;
                    viewersEditText.setText(null);
                }
            });
          /*  buttonComma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 viewersEditText.setText(viewersEditText.getText() + ",");
              }
            });*/

            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueTwo = Float.parseFloat(viewersEditText.getText() + "");

                    if (Addition == true) {
                        viewersEditText.setText(ValueOne + ValueTwo + "");
                        Addition = false;
                    }

                    if (Subtract == true) {
                        viewersEditText.setText(ValueOne - ValueTwo + "");
                        Subtract = false;
                    }

                    if (Multiplication == true) {
                        viewersEditText.setText(ValueOne * ValueTwo + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                        viewersEditText.setText(ValueOne / ValueTwo + "");
                        Division = false;
                    }
                    if (Power == true) {
                        viewersEditText.setText(Math.pow(ValueOne, ValueTwo) + "");
                        Power = false;
                    }
                }
            });

            buttonClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText("");

                }
            });

            buttondot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewersEditText.setText(viewersEditText.getText() + ".");
                }
            });
        }

}