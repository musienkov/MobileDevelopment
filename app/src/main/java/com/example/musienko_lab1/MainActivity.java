package com.example.musienko_lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView productText;
    TextView firmText;
    RadioGroup radioGroupProduct;
    RadioGroup radioGroupFirm;
    RadioButton radioButtonProduct;
    RadioButton radioButtonFirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productText = (TextView) findViewById(R.id.product);
        firmText = (TextView)findViewById(R.id.firm);
        radioGroupProduct = findViewById(R.id.radioProduct);
        radioGroupFirm = findViewById(R.id.radioFirm);
    }


    public void clickCancel(View view) {
        firmText.setText("");
        productText.setText("");
    }

    public void clickOk(View view) {
        int radioIdProduct = radioGroupProduct.getCheckedRadioButtonId();
        int radioIdFirm = radioGroupFirm.getCheckedRadioButtonId();
        radioButtonProduct = findViewById(radioIdProduct);
        radioButtonFirm = findViewById(radioIdFirm);
        firmText.setText(radioButtonFirm.getText());
        productText.setText(radioButtonProduct.getText());
    }
}