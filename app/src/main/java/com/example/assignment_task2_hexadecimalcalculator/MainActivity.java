package com.example.assignment_task2_hexadecimalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private Button bac, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private Button btnA, btnB, btnC, btnD, btnE, btnF;
    private Button bplus, bminus, bmul, bdiv, beq;
    private Button bsin, bcos, bpow;
    private TextView txtView;
    private int input1 = 0;
    private int input2 = 0;
    private int choice = -1;
    private String ar,sr,mr,dr,sin_r,cos_r,pr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bac = findViewById(R.id.bac);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);

        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnE = findViewById(R.id.btnE);
        btnF = findViewById(R.id.btnF);

        bplus = findViewById(R.id.bplus);
        bminus = findViewById(R.id.bminus);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        beq = findViewById(R.id.beq);

        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bpow = findViewById(R.id.bpow);

        bac.setOnClickListener(this);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnF.setOnClickListener(this);

        bplus.setOnClickListener(this);
        bminus.setOnClickListener(this);
        bmul.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        beq.setOnClickListener(this);

        bsin.setOnClickListener(this);
        bcos.setOnClickListener(this);
        bpow.setOnClickListener(this);

        txtView = findViewById(R.id.txtView);
    }

    @Override
    public void onClick(View view) {
        String s1;
        switch (view.getId()) {
            case R.id.bac:
                txtView.setText("");
                input1 = 0;
                input2 = 0;
                break;
            case R.id.b0:
                s1 = txtView.getText().toString();
                s1 = s1 + "0";
                txtView.setText(s1);
                break;
            case R.id.b1:
                s1 = txtView.getText().toString();
                s1 = s1 + "1";
                txtView.setText(s1);
                break;
            case R.id.b2:
                s1 = txtView.getText().toString();
                s1 = s1 + "2";
                txtView.setText(s1);
                break;
            case R.id.b3:
                s1 = txtView.getText().toString();
                s1 = s1 + "3";
                txtView.setText(s1);
                break;
            case R.id.b4:
                s1 = txtView.getText().toString();
                s1 = s1 + "4";
                txtView.setText(s1);
                break;
            case R.id.b5:
                s1 = txtView.getText().toString();
                s1 = s1 + "5";
                txtView.setText(s1);
                break;
            case R.id.b6:
                s1 = txtView.getText().toString();
                s1 = s1 + "6";
                txtView.setText(s1);
                break;
            case R.id.b7:
                s1 = txtView.getText().toString();
                s1 = s1 + "7";
                txtView.setText(s1);
                break;
            case R.id.b8:
                s1 = txtView.getText().toString();
                s1 = s1 + "8";
                txtView.setText(s1);
                break;
            case R.id.b9:
                s1 = txtView.getText().toString();
                s1 = s1 + "9";
                txtView.setText(s1);
                break;
            case R.id.btnA:
                s1 = txtView.getText().toString();
                s1 = s1 + "A";
                txtView.setText(s1);
                break;
            case R.id.btnB:
                s1 = txtView.getText().toString();
                s1 = s1 + "B";
                txtView.setText(s1);
                break;
            case R.id.btnC:
                s1 = txtView.getText().toString();
                s1 = s1 + "C";
                txtView.setText(s1);
                break;
            case R.id.btnD:
                s1 = txtView.getText().toString();
                s1 = s1 + "D";
                txtView.setText(s1);
                break;
            case R.id.btnE:
                s1 = txtView.getText().toString();
                s1 = s1 + "E";
                txtView.setText(s1);
                break;
            case R.id.btnF:
                s1 = txtView.getText().toString();
                s1 = s1 + "F";
                txtView.setText(s1);
                break;
            case R.id.bplus:
                input1 = Integer.parseInt(txtView.getText().toString(),16);
                choice = 0;
                txtView.setText("");
                break;
            case R.id.bminus:
                input1 = Integer.parseInt(txtView.getText().toString(),16);
                choice = 1;
                txtView.setText("");
                break;
            case R.id.bmul:
                input1 = Integer.parseInt(txtView.getText().toString(),16);
                choice = 2;
                txtView.setText("");
                break;
            case R.id.bdiv:
                input1 = Integer.parseInt(txtView.getText().toString(),16);
                choice = 3;
                txtView.setText("");
                break;
            case R.id.bsin:
                input1 = Integer.parseInt(txtView.getText().toString(),16);
                choice = 4;
                txtView.setText("sin(" + input1 + ")");
                break;
            case R.id.bcos:
                input1 = Integer.parseInt(txtView.getText().toString(),16);
                choice = 5;
                txtView.setText("cos(" + input1 + ")");
                break;
            case R.id.bpow:
                input1 = Integer.parseInt(txtView.getText().toString(),16);
                choice = 6;
                txtView.setText("");
                break;
            case R.id.beq:
                int add_result = 0;
                int sub_result = 0;
                int mul_result = 0;
                double div_result = 0;
                double sin_result_in_deg = 0;
                double cos_result_in_deg = 0;
                int pow_result = 0;

                if (choice == 0) {
                    input2 = Integer.parseInt(txtView.getText().toString(),16);
                    add_result = input1 + input2;
                    ar = Integer.toHexString(add_result).toUpperCase();
                } else if (choice == 1) {
                    input2 = Integer.parseInt(txtView.getText().toString(),16);
                    sub_result = input1 - input2;
                    sr = Integer.toHexString(sub_result).toUpperCase();
                } else if (choice == 2) {
                    input2 = Integer.parseInt(txtView.getText().toString(),16);
                    mul_result = input1 * input2;
                    mr = Integer.toHexString(mul_result).toUpperCase();
                } else if (choice == 3) {
                    input2 = Integer.parseInt(txtView.getText().toString(),16);
                    div_result = input1 / input2;
                    //dr = Integer.toHexString(div_result);
                } else if (choice == 4) {
                    sin_result_in_deg = Math.sin(Math.toRadians((input1)));
                    //sin_r = Integer.toHexString(sin_result_in_deg);
                }else if (choice == 5) {
                    cos_result_in_deg = Math.cos(Math.toRadians((input1)));
                    //cos_r = Integer.toHexString(cos_result_in_deg);
                }else if (choice == 6) {
                    input2 = Integer.parseInt(txtView.getText().toString(),16);
                    pow_result = (int) Math.pow(input1,input2);
                }
                if (choice == 0)
                    txtView.setText(ar + "");
                else if (choice == 1)
                    txtView.setText(sr + "");
                else if (choice == 2)
                    txtView.setText(mr + "");
                else if (choice == 3)
                    txtView.setText(div_result + "");
                else if (choice == 4)
                    txtView.setText(sin_result_in_deg + "");
                else if (choice == 5)
                    txtView.setText(cos_result_in_deg + "");
                else if (choice == 6)
                    txtView.setText(pow_result + "");
        }
    }
}