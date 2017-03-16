package com.example.dima.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    StringBuilder textViewBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        textViewBuilder = new StringBuilder();


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                textViewBuilder.setLength(0);
                textView.setText(textViewBuilder);
                break;

            case R.id.button2:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_LONG).show();
                } else {
                    textViewBuilder.append("/");
                }
                textView.setText(textViewBuilder);
                break;

            case R.id.button3:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_LONG).show();
                } else {
                    textViewBuilder.append("*");
                }
                textView.setText(textViewBuilder);
                break;

            case R.id.button4:
                if (textViewBuilder.length() > 0) {
                    textViewBuilder.setLength(textViewBuilder.length() - 1);
                }
                textView.setText(textViewBuilder);
                break;

            case R.id.button5:
                textViewBuilder.append("7");
                textView.setText(textViewBuilder);
                break;

            case R.id.button6:
                textViewBuilder.append("8");
                textView.setText(textViewBuilder);
                break;

            case R.id.button7:
                textViewBuilder.append("9");
                textView.setText(textViewBuilder);
                break;

            case R.id.button8:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_LONG).show();
                } else {
                    textViewBuilder.append("-");
                }
                textView.setText(textViewBuilder);
                break;

            case R.id.button9:
                textViewBuilder.append("4");
                textView.setText(textViewBuilder);
                break;

            case R.id.button10:
                textViewBuilder.append("5");
                textView.setText(textViewBuilder);
                break;

            case R.id.button11:
                textViewBuilder.append("6");
                textView.setText(textViewBuilder);
                break;

            case R.id.button12:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_LONG).show();
                } else {
                    textViewBuilder.append("+");
                }
                textView.setText(textViewBuilder);
                break;

            case R.id.button13:
                textViewBuilder.append("1");
                textView.setText(textViewBuilder);
                break;

            case R.id.button14:
                textViewBuilder.append("2");
                textView.setText(textViewBuilder);
                break;

            case R.id.button15:
                textViewBuilder.append("3");
                textView.setText(textViewBuilder);
                break;

            case R.id.button16:

                break;

            case R.id.button17:
                textViewBuilder.append("0");
                textView.setText(textViewBuilder);
                break;

            case R.id.button18:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_LONG).show();
                } else {
                    textViewBuilder.append(".");
                }
                textView.setText(textViewBuilder);
                break;

            case R.id.button19:

                break;

            case R.id.button20:
                textView.setText(calculate(textViewBuilder));
                break;
        }
    }

    public static String calculate(StringBuilder stringBuilder) {
        String result = "Давай сам считай!";

        return result;
    }

    public static boolean isSign(StringBuilder stringBuilder) {
        boolean result = false;
        char[] sighs = {'.', '+', '-', '*', '/'};
        char lastChar = stringBuilder.charAt(stringBuilder.length() - 1);
        for (char c : sighs) {
            if (c == lastChar) {
                result = true;
            }
        }
        return result;
    }
}
