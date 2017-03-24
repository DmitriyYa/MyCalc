package com.example.dima.mycalc;

import java.math.BigDecimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    TextView mainMonitor;
    TextView memoryMonitor;

    public static StringBuilder stringBuilderMain;
    public static StringBuilder stringBuilderMamory;
    public static StringBuilder stringBuilderResult;
    public static BigDecimal bd;
    public static double res;
    public static String sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        stringBuilderMain = new StringBuilder();
        stringBuilderMamory = new StringBuilder();
        stringBuilderResult = new StringBuilder();

        mainMonitor = (TextView) findViewById(R.id.textView1);
        memoryMonitor = (TextView) findViewById(R.id.textView2);
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
                if (mainMonitor.getText().length() == 0) {
                    memoryMonitor.setText("");
                }
                mainMonitor.setText("");
                break;

            case R.id.button2:
                mainMonitor.setText(memoryMonitor.getText());
                break;

            case R.id.button3:
                memoryMonitor.setText(mainMonitor.getText());
                break;

            case R.id.button4:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                if (stringBuilderMain.length() > 0) {
                    stringBuilderMain.setLength(stringBuilderMain.length() - 1);
                }
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button5:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("7");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button6:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("8");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button7:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("9");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button8:
                sign = "/";
                stringBuilderResult = new StringBuilder(mainMonitor.getText());
                mainMonitor.setText("");
                break;

            case R.id.button9:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("4");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button10:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("5");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button11:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("6");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button12:
                sign = "*";
                stringBuilderResult = new StringBuilder(mainMonitor.getText());
                mainMonitor.setText("");
                break;

            case R.id.button13:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("1");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button14:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("2");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button15:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("3");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button16:
                if (mainMonitor.getText().length() == 0) {
                    mainMonitor.setText("");
                    mainMonitor.setText("-");
                    break;
                } else {
                    sign = "-";
                    stringBuilderResult = new StringBuilder(mainMonitor.getText());
                    mainMonitor.setText("");
                    break;
                }
            case R.id.button17:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                stringBuilderMain.append("0");
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button18:
                stringBuilderMain = new StringBuilder(mainMonitor.getText());
                if (stringBuilderMain.length() == 0) {
                    stringBuilderMain.append("0.");
                } else {
                    stringBuilderMain.append(".");
                }
                mainMonitor.setText(stringBuilderMain);
                break;

            case R.id.button19:
                if (stringBuilderResult.length() > 0 && mainMonitor.getText().length() > 0) {
                    switch (sign) {
                        case "-":
                            res = Double.parseDouble(stringBuilderResult.toString()) - Double.parseDouble(mainMonitor.getText().toString());
                            if (res % 1 == 0){
                                bd = new BigDecimal(res);
                            }
                            else {
                                bd = new BigDecimal(res).setScale(5, BigDecimal.ROUND_UP).stripTrailingZeros();
                            }
                            mainMonitor.setText(String.valueOf(bd));
                            break;
                        case "+":
                            res = Double.parseDouble(stringBuilderResult.toString()) + Double.parseDouble(mainMonitor.getText().toString());
                            if (res % 1 == 0){
                                bd = new BigDecimal(res);
                            }
                            else {
                                bd = new BigDecimal(res).setScale(5, BigDecimal.ROUND_UP).stripTrailingZeros();
                            }
                            mainMonitor.setText(String.valueOf(bd));
                            break;
                        case "*":
                            res = Double.parseDouble(stringBuilderResult.toString()) * Double.parseDouble(mainMonitor.getText().toString());
                            if (res % 1 == 0){
                                bd = new BigDecimal(res);
                            }
                            else {
                                bd = new BigDecimal(res).setScale(5, BigDecimal.ROUND_UP).stripTrailingZeros();
                            }
                            mainMonitor.setText(String.valueOf(bd));
                            break;
                        case "/":
                            if (Double.parseDouble(mainMonitor.getText().toString()) == 0) {
                                Toast.makeText(this, "На ноль делить нельзя", Toast.LENGTH_SHORT).show();

                            } else {
                                res = Double.parseDouble(stringBuilderResult.toString()) / Double.parseDouble(mainMonitor.getText().toString());
                                if (res % 1 == 0){
                                    bd = new BigDecimal(res);
                                }
                                else {
                                    bd = new BigDecimal(res).setScale(5, BigDecimal.ROUND_UP).stripTrailingZeros();
                                }
                                mainMonitor.setText(String.valueOf(bd));

                            }
                            break;
                    }
                    stringBuilderResult.setLength(0);
                    res = 0;
                }
                break;

            case R.id.button20:
                sign = "+";
                stringBuilderResult = new StringBuilder(mainMonitor.getText());
                mainMonitor.setText("");
                break;
        }
    }


}
