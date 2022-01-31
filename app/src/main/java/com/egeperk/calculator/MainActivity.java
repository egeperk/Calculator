package com.egeperk.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //// Global olarak tanıt. onCreate içerisinde findViewById ile göster tüm diğer bloklarda kullan.

    EditText number1Text;
    EditText number2Text;
    TextView resultText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1);
        number2Text = findViewById(R.id.number2);
        resultText = findViewById(R.id.tv_result);



    }

    /////String'i integer'a çevirmek  için parseInt()----------- int number1 = Integer.parseInt(number1Text.getText().toString())

    public void sum(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Lütfen değer giriniz!");
        }
        else {

        double number1 = Double.parseDouble(number1Text.getText().toString());
        double number2 = Double.parseDouble(number2Text.getText().toString());
        double result = number1 + number2;

        resultText.setText("" + result);
        }

    }
    public void deduct(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Lütfen değer giriniz!"); }
        else {
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number2Text.getText().toString());
            double result = number1 - number2;

            resultText.setText("" + result);
        }
    }
    public void multiply(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Lütfen değer giriniz!");
        }
        else {
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number2Text.getText().toString());
            double result = number1 * number2;

            resultText.setText("" + result);
        }
    }
    public void divide(View view) {



        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Lütfen değer giriniz!");
        }
        else {
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number2Text.getText().toString());
            double result = number1 / number2;

            resultText.setText("" + result);
        }
        if(number2Text.getText().toString().matches("0")) {
            resultText.setText("Tanımsız");
        }


    }



}