package com.basiccalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button addbt, subbt,mulbt,divbt,acbt,exitbt,eqbt,bt_0,bt_1,bt_2,bt_3,bt_4,bt_5,bt_6,bt_7,bt_8,bt_9,dotbt;
    private TextView textview;

    String number = new String("");
    String calcoprator = new String("");

    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addbt = (Button) findViewById(R.id.Btid16);
        subbt = (Button) findViewById(R.id.Btid12);
        mulbt = (Button) findViewById(R.id.Btid8);
        divbt = (Button) findViewById(R.id.Btid4);
        acbt = (Button) findViewById(R.id.Btid1);
        exitbt = (Button) findViewById(R.id.Btid17);
        eqbt = (Button) findViewById(R.id.Btid20);
        bt_0 = (Button) findViewById(R.id.Btid18);
        bt_1 = (Button) findViewById(R.id.Btid13);
        bt_2 = (Button) findViewById(R.id.Btid14);
        bt_3 = (Button) findViewById(R.id.Btid15);
        bt_4 = (Button) findViewById(R.id.Btid9);
        bt_5 = (Button) findViewById(R.id.Btid10);
        bt_6 = (Button) findViewById(R.id.Btid11);
        bt_7 = (Button) findViewById(R.id.Btid5);
        bt_8 = (Button) findViewById(R.id.Btid6);
        bt_9 = (Button) findViewById(R.id.Btid7);
        dotbt = (Button) findViewById(R.id.Btid19);


        textview = (TextView) findViewById(R.id.textviewId);


        addbt.setOnClickListener(this);
        subbt.setOnClickListener(this);
        mulbt.setOnClickListener(this);
        divbt.setOnClickListener(this);
        acbt.setOnClickListener(this);
        exitbt.setOnClickListener(this);
        eqbt.setOnClickListener(this);
        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);
        dotbt.setOnClickListener(this);


    }


    public String buidlnumber(String num, String s){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(num);
        stringBuilder.append(s);

        return stringBuilder.toString();

    }


    public double calculate(String numcalc, Double resultcalc, String oprator){

        if(numcalc != ""){


            double numc = Double.parseDouble(numcalc);

            double resultfnc = resultcalc;

            if(resultfnc == 0){

                resultfnc = numc;
                number = "";

            }

            else {


                if(oprator == "+"){

                    resultfnc = resultfnc + numc;

                }

                if(oprator == "-"){

                    resultfnc = resultfnc - numc;

                }

                if(oprator == "*"){

                    resultfnc = resultfnc * numc;

                }

                if(oprator == "/"){

                    resultfnc = resultfnc / numc;

                }

                calcoprator = "";
                number = "";

            }

            return resultfnc;


        }

        else{

            return resultcalc;

        }


    }



    @Override
    public void onClick(View v) {


        if(v.getId() == R.id.Btid18)
        {
            number = buidlnumber(number, "0");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid13)
        {
            number = buidlnumber(number, "1");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid14)
        {
            number = buidlnumber(number, "2");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid15)
        {
            number = buidlnumber(number, "3");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid9)
        {
            number = buidlnumber(number, "4");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid10)
        {
            number = buidlnumber(number, "5");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid11)
        {
            number = buidlnumber(number, "6");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid5)
        {
            number = buidlnumber(number, "7");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid6)
        {
            number = buidlnumber(number, "8");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid7)
        {
            number = buidlnumber(number, "9");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid19)
        {
            number = buidlnumber(number, ".");
            textview.setText(number);
        }

        if(v.getId() == R.id.Btid20)
        {

            try {
                result = calculate(number,result,calcoprator);
                textview.setText(String.valueOf(result));
                calcoprator = "";
                number = "";
            }
            catch (Exception e) {
                textview.setText(String.valueOf(result));
                calcoprator = "";
                number = "";
            }

        }

        if(v.getId() == R.id.Btid16)
        {

            if(calcoprator != ""){

                result = calculate(number,result,calcoprator);
                textview.setText(String.valueOf(result));
                calcoprator = "+";

            }

            else {

                result = calculate(number,result,calcoprator);
                number = "";
                textview.setText(String.valueOf(result));
                calcoprator = "+";

            }


        }

        if(v.getId() == R.id.Btid12)
        {

            if(calcoprator != ""){

                result = calculate(number,result,calcoprator);
                textview.setText(String.valueOf(result));
                calcoprator = "-";

            }

            else{

                result = calculate(number,result,calcoprator);
                number = "";
                textview.setText(String.valueOf(result));
                calcoprator = "-";

            }


        }

        if(v.getId() == R.id.Btid8)
        {

            if(calcoprator != ""){

                result = calculate(number,result,calcoprator);
                textview.setText(String.valueOf(result));
                calcoprator = "*";

            }

            else {

                result = calculate(number, result, calcoprator);
                number = "";
                textview.setText(String.valueOf(result));
                calcoprator = "*";

            }

        }

        if(v.getId() == R.id.Btid4)
        {

            if(calcoprator != ""){

                result = calculate(number,result,calcoprator);
                textview.setText(String.valueOf(result));
                calcoprator = "/";

            }

            else {

                result = calculate(number, result, calcoprator);
                number = "";
                textview.setText(String.valueOf(result));
                calcoprator = "/";

            }

        }

        if(v.getId() == R.id.Btid1)
        {
            number = "";
            calcoprator = "";
            result = 0;
            textview.setText("0");
        }

        if(v.getId() == R.id.Btid17)
        {
            //exit();
            Toast.makeText(MainActivity.this,R.string.ToastTxt3,Toast.LENGTH_SHORT).show();
            finish();
        }


    }



    public void exit(){

        AlertDialog.Builder alartDialogBuilder;
        alartDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alartDialogBuilder.setIcon(R.drawable.warning);
        alartDialogBuilder.setTitle(R.string.AlertTitle);
        alartDialogBuilder.setMessage(R.string.AlertMessage);
        alartDialogBuilder.setPositiveButton(R.string.PositiveButtonTxt, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this,R.string.ToastTxt4,Toast.LENGTH_SHORT).show();
                finish();

            }
        });

        alartDialogBuilder.setNegativeButton(R.string.NegativeButtonTxt, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this,R.string.ToastTxt5,Toast.LENGTH_SHORT).show();
                dialog.cancel();

            }
        });

        AlertDialog alertDialog = alartDialogBuilder.create();
        alertDialog.show();

    }



    @Override
    public void onBackPressed() {

        exit();

    }



}




