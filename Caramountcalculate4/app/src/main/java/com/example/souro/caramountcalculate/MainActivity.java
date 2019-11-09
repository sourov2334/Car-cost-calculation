package com.example.souro.caramountcalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private EditText one,two,three,four,five,six,seven,eight;
    private TextView one1,one2,one3,one4;
    String num1,num2,num3,num4,num8,num11;
    double number1,number2,number3,number5,number11,number9;
    private Button button,refresh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=(EditText)findViewById(R.id.one);
        two=(EditText)findViewById(R.id.two);
        three=(EditText)findViewById(R.id.three);
        four=(EditText)findViewById(R.id.four);
        one1=(TextView) findViewById(R.id.one1);
        one2=(TextView) findViewById(R.id.one2);
        five=(EditText)findViewById(R.id.five);
        one3=(TextView) findViewById(R.id.one3);
        six=(EditText)findViewById(R.id.six);
        seven=(EditText)findViewById(R.id.seven);
        eight=(EditText)findViewById(R.id.eight);
        one4=(TextView) findViewById(R.id.one4);
        button = (Button)findViewById(R.id.button);
        refresh = (Button)findViewById(R.id.refresh);

        two.setText("5");
        eight.setText("500");
        one.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                MainActivity.this.updateValue();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.this.updateValue();
            }

            @Override
            public void afterTextChanged(Editable s) {

                MainActivity.this.updateValue();
            }
        });

        two.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                MainActivity.this.updateValue();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.this.updateValue();
            }

            @Override
            public void afterTextChanged(Editable s) {

                MainActivity.this.updateValue();
            }
        });
        three.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                MainActivity.this.updateValue();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.this.updateValue();
            }

            @Override
            public void afterTextChanged(Editable s) {

                MainActivity.this.updateValue();
            }
        });

        four.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                MainActivity.this.updateValue();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.this.updateValue();
            }

            @Override
            public void afterTextChanged(Editable s) {

                MainActivity.this.updateValue();
            }
        });

        five.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                MainActivity.this.updateValue();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.this.updateValue();
            }

            @Override
            public void afterTextChanged(Editable s) {

                MainActivity.this.updateValue();
            }
        });
        six.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                MainActivity.this.updateValue();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.this.updateValue();
            }

            @Override
            public void afterTextChanged(Editable s) {

                MainActivity.this.updateValue();
            }
        });
        seven.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                MainActivity.this.updateValue();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.this.updateValue();
            }

            @Override
            public void afterTextChanged(Editable s) {

                MainActivity.this.updateValue();
            }
        });
        eight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                MainActivity.this.updateValue();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                MainActivity.this.updateValue();
            }

            @Override
            public void afterTextChanged(Editable s) {

                MainActivity.this.updateValue();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,contact.class);
                startActivity(intent);
            }
        });
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= getIntent();
                finish();
                startActivity(intent);
            }
        });

    }


    private void updateValue(){
        num1=one.getText().toString();
        num2=two.getText().toString();
        num3=three.getText().toString();
        String num5 = four.getText().toString();
        String num9 = five.getText().toString();
        String num12 = six.getText().toString();
        String num13 = seven.getText().toString();
        String num14 = eight.getText().toString();

        if(null!=num1&& num1.length()>0 && null!=num2&& num2.length()>0 && null!=num3&& num3.length()>0){

            try{
                number1=Double.parseDouble(num1);
                number2=Double.parseDouble(num2);
                number3=Double.parseDouble(num3);
                double number4 = (number1*number2)/100;
                number5 = number1+number3+number4;
                number5 = Double.parseDouble(new DecimalFormat("#.###").format(number5));
                num4 = Double.toString(number5);


                if(null!=one1){
                    one1.setText("Total: "+num4+" YEN");

                }

                else{
                    one1.setText(" ");

                }
            }
            catch (Exception e){

            }
        }
        if(null==num1&& num1.length()<0 && null==num2&& num2.length()<0 && null==num3&& num3.length()<0){
            one1.setText(" ");
        }

        if(null!=num5&& num5.length()>0){
            try{
                double number6 = Double.parseDouble(num5);
                double number7 = Double.parseDouble(num4);
                double number8 = number7/number6;
                number8 = Double.parseDouble(new DecimalFormat("#.###").format(number8));
                num8 = Double.toString(number8);
                if(null!=one2)
                    one2.setText("Equals: "+num8+" DOLLARS");
                else
                    one2.setText(" ");
            }
            catch (Exception e){

            }
        }
        if(null==num5&& num5.length()<0){
            one2.setText(" ");
        }

        if(null!=num9&& num9.length()>0){

            try{
                number9 = Double.parseDouble(num9);
                double number10 = Double.parseDouble(num8);
                number11 = number9*number10;
                number11 = Double.parseDouble(new DecimalFormat("#.###").format(number11));
                num11 = Double.toString(number11);
                if(null!=one3)
                    one3.setText("Equals: "+num11+" TAKA");
                else
                    one3.setText(" ");
            }
            catch (Exception e){

            }
        }
        if(null==num9&& num9.length()<0){
            one3.setText(" ");
        }


        if(null!=num12&& num12.length()>0){

            try{
                double number12 = Double.parseDouble(num12);
                double number13 = Double.parseDouble(num13);
                double number14 = Double.parseDouble(num14);
                double number15=  number14*number9;
                double number16 = number11+number12+number13+number15;
                number16 = Double.parseDouble(new DecimalFormat("#.###").format(number16));
                String taka = Double.toString(number16);
                if(null!=one4)
                    one4.setText("Tolal Amount\n"+taka+" TAKA");
                else
                    one4.setText(" ");
            }
            catch (Exception e){

            }
        }
        if(null==num12&& num12.length()<0){
            one4.setText(" ");
        }

    }
}
