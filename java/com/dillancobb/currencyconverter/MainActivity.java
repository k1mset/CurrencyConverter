package com.dillancobb.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // Double used to store the value of each currency when converting it
    public double val;

    // convertJPY method to store yen value, then display the toast of the returned yen value
    public void convertJPY(View view) {
        val = 109.71;

        Toast.makeText(MainActivity.this, "¥" + calcMoney(val),
                Toast.LENGTH_LONG).show();
    }

    // convertEUR method to store euro value, then display the toast of the returned euro value
    public void convertEUR(View view) {
        val = 0.89;

        Toast.makeText(MainActivity.this, "€" + calcMoney(val),
                Toast.LENGTH_LONG).show();
    }

    // convertGBP method to store gbp value, then display the toast of the returned gbp value
    public void convertGBP(View view) {
        val = 0.79;

        Toast.makeText(MainActivity.this, "£" + calcMoney(val),
                Toast.LENGTH_LONG).show();
    }

    // convertAUD method to store aud value, then display the toast of the returned aud value
    public void convertAUD(View view) {
        val = 1.45;

        Toast.makeText(MainActivity.this, "$" + calcMoney(val),
                Toast.LENGTH_LONG).show();
    }

    // convertCAD method to store cad value, then display the toast of the returned cad value
    public void convertCAD(View view) {
        val = 1.35;

        Toast.makeText(MainActivity.this, "$" + calcMoney(val),
                Toast.LENGTH_LONG).show();
    }

    // convertCHF method to store chf value, then display the toast of the returned chf value
    public void convertCHF(View view) {
        val = 1;

        Toast.makeText(MainActivity.this, "SFr." + calcMoney(val),
                Toast.LENGTH_LONG).show();
    }

    // convertCNH method to store cnh value, then display the toast of the returned cnh value
    public void convertCNH(View view) {
        val = 6.93;

        Toast.makeText(MainActivity.this, "¥" + calcMoney(val),
                Toast.LENGTH_LONG).show();
    }

    // convertSEK method to store kr value, then display the toast of the returned kr value
    public void convertSEK(View view) {
        val = 9.62;

        Toast.makeText(MainActivity.this, "kr" + calcMoney(val),
                Toast.LENGTH_LONG).show();
    }

    // calcMoney method takes in a double parameter ($ to currency value) and multiplies that
    // against the number of dollars inputted into the edit text. Returns a formatted string
    // of the amount to be displayed to the user.
    public String calcMoney(double currVal) {
        EditText money = (EditText) findViewById(R.id.txtAmount);
        double totalValue;
        double dollarValue;

        DecimalFormat currencyFormat = new DecimalFormat("0.00");

        dollarValue = Double.parseDouble(money.getText().toString());
        totalValue = dollarValue * currVal;

        return currencyFormat.format(totalValue);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
