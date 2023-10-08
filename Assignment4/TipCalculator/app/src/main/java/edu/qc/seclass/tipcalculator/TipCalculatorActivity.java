package edu.qc.seclass.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void computeTip(View view) {
        EditText checkAmount = (EditText)findViewById(R.id.checkAmountValue);
        EditText partySize = (EditText)findViewById(R.id.partySizeValue);
        EditText tip15 = (EditText)findViewById(R.id.fifteenPercentTipValue);
        EditText tip20 = (EditText)findViewById(R.id.twentyPercentTipValue);
        EditText tip25 = (EditText)findViewById(R.id.twentyfivePercentTipValue);
        EditText totaltip15 = (EditText)findViewById(R.id.fifteenPercentTotalValue);
        EditText totaltip20 = (EditText)findViewById(R.id.twentyPercentTotalValue);
        EditText totaltip25 = (EditText)findViewById(R.id.twentyfivePercentTotalValue);

        String amountText = checkAmount.getText().toString();
        String sizeText = partySize.getText().toString();

        if (amountText.isEmpty() || sizeText.isEmpty()) {
            Toast.makeText(this, "You must enter values to compute.", Toast.LENGTH_SHORT).show();
        } else {
            double amount = Double.parseDouble(checkAmount.getText().toString());
            double size = Double.parseDouble(partySize.getText().toString());
            if (amount <= 0 || size <= 0) {
                Toast.makeText(this, "Input must be greater than zero.", Toast.LENGTH_SHORT).show();
            } else {
                double tip15val = Math.round((amount / size) * .15);
                double tip20val = Math.round((amount / size) * .20);
                double tip25val = Math.round((amount / size) * .25);
                double totaltip15val = Math.round((amount / size) + tip15val);
                double totaltip20val = Math.round((amount / size) + tip20val);
                double totaltip25val = Math.round((amount / size) + tip25val);

                tip15.setText(String.valueOf((int) tip15val));
                tip20.setText(String.valueOf((int) tip20val));
                tip25.setText(String.valueOf((int) tip25val));
                totaltip15.setText(String.valueOf((int) totaltip15val));
                totaltip20.setText(String.valueOf((int) totaltip20val));
                totaltip25.setText(String.valueOf((int) totaltip25val));
            }
        }




    }
}
