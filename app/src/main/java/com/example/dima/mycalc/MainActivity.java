package com.example.dima.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
    public static TextView textView1;
    public static TextView textView2;
    public static TextView textView3;

    public static StringBuilder textViewBuilder;
    public static StringBuilder memory;
    public static StringBuilder result;
    public static boolean isCalсulate = false;
    public static final char[] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[] signs = {'.', '+', '-', '*', '/'};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewBuilder = new StringBuilder();
        memory = new StringBuilder();
        result = new StringBuilder();

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
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
                textView1.setText(textViewBuilder);
                textView2.setText(textViewBuilder);
                textView3.setText(textViewBuilder);
                break;

            case R.id.button2:
                if (isDigit(textViewBuilder)) {
                    Toast.makeText(this, "Введите знак", Toast.LENGTH_SHORT).show();
                } else {
                    textViewBuilder.append(memory);
                }
                textView1.setText(textViewBuilder);
                break;

            case R.id.button3:
                memory.setLength(0);
                memory.append(result);
                textView2.setText(memory);
                break;

            case R.id.button4:
                if (textViewBuilder.length() > 0) {
                    textViewBuilder.setLength(textViewBuilder.length() - 1);
                }
                textView1.setText(textViewBuilder);
                break;

            case R.id.button5:
                textViewBuilder.append("7");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button6:
                textViewBuilder.append("8");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button7:
                textViewBuilder.append("9");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button8:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_SHORT).show();
                } else {
                    textViewBuilder.append("/");
                }
                textView1.setText(textViewBuilder);
                break;

            case R.id.button9:
                textViewBuilder.append("4");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button10:
                textViewBuilder.append("5");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button11:
                textViewBuilder.append("6");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button12:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_SHORT).show();
                } else {
                    textViewBuilder.append("*");
                }
                textView1.setText(textViewBuilder);
                break;

            case R.id.button13:
                textViewBuilder.append("1");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button14:
                textViewBuilder.append("2");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button15:
                textViewBuilder.append("3");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button16:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_SHORT).show();
                } else {
                    textViewBuilder.append("-");
                }
                textView1.setText(textViewBuilder);
                break;

            case R.id.button17:
                textViewBuilder.append("0");
                textView1.setText(textViewBuilder);
                break;

            case R.id.button18:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_SHORT).show();
                } else {
                    textViewBuilder.append(".");
                }
                textView1.setText(textViewBuilder);
                break;

            case R.id.button19:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_SHORT).show();
                } else {
                    result = calculate(textViewBuilder);
                }
                textView3.setText(result);
                break;

            case R.id.button20:
                if (isSign(textViewBuilder)) {
                    Toast.makeText(this, "Введите цифру", Toast.LENGTH_SHORT).show();
                } else {
                    textViewBuilder.append("+");
                }
                textView1.setText(textViewBuilder);
                break;
        }
    }

    /**
     * Условия расчета:
     *
     * @param stringBuilder
     * @return
     */
    public static StringBuilder calculate(StringBuilder stringBuilder) {
        StringBuilder result = new StringBuilder();
        String plus = "+";
        String minus = "-";
        String multipl = "*";
        String dictionary = "/";

        String[] digits = stringBuilder.toString().split("[+\\-*/]");
        String[] signs = stringBuilder.toString().split("\\d+\\.*\\d*");

        List<Double> digitsList = new LinkedList<>();
        List<String> signlist = new LinkedList<>();

        for (int i = 0; i < digits.length; i++) {
            digitsList.add(Double.parseDouble(digits[i]));
        }

        for (int i = 1; i < signs.length; i++) {
            signlist.add(signs[i]);
        }

        while (digitsList.size() != 1) {
            for (int i = 0; i < signlist.size(); i++) {
                if (signlist.get(i).equals(multipl)) {
                    digitsList.set(i, digitsList.get(i) * digitsList.get(i + 1));
                    digitsList.remove(i + 1);
                    signlist.remove(i);
                    i--;
                    continue;
                }
                if (signlist.get(i).equals(dictionary)) {
                    digitsList.set(i, digitsList.get(i) / digitsList.get(i + 1));
                    digitsList.remove(i + 1);
                    signlist.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < signlist.size(); i++) {
                if (signlist.get(i).equals(plus)) {
                    digitsList.set(i, digitsList.get(i) + digitsList.get(i + 1));
                    digitsList.remove(i + 1);
                    signlist.remove(i);
                    i--;
                    continue;
                }
                if (signlist.get(i).equals(minus)) {
                    digitsList.set(i, digitsList.get(i) - digitsList.get(i + 1));
                    digitsList.remove(i + 1);
                    signlist.remove(i);
                    i--;
                }
            }
        }

        result.append(digitsList.get(0));
        textViewBuilder.setLength(0);
        textView1.setText(textViewBuilder);
        return result;
    }

    /**
     * проверяет, что  последний символ знак действия
     *
     * @param stringBuilder
     * @return
     */
    public static boolean isSign(StringBuilder stringBuilder) {
        boolean result = false;

        if (stringBuilder.length() > 0) {
            char lastChar = stringBuilder.charAt(stringBuilder.length() - 1);
            for (char c : signs) {
                if (c == lastChar) {
                    result = true;
                }
            }
        } else {
            result = true;
        }
        return result;
    }

    /**
     * проверяет, что последний символ цифра
     *
     * @param stringBuilder
     * @return
     */
    public static boolean isDigit(StringBuilder stringBuilder) {
        boolean result = false;

        if (stringBuilder.length() > 0) {
            char lastChar = stringBuilder.charAt(stringBuilder.length() - 1);
            for (char c : digit) {
                if (c == lastChar) {
                    result = true;
                }
            }
        } else {
            result = true;
        }
        return result;
    }


}
