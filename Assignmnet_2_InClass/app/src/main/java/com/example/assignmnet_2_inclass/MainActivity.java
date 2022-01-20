package com.example.assignmnet_2_inclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;
import java.text.DecimalFormat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText textedit;
    TextView textView, texteditPrice;
    final String TAG = "Demo";
    final double FivePercent = .05;
    final double TwentyPercent = .20;
    final double TenPercent = .10;
    final double FifteenPercent = .15;
    final double FiftyPercent = .50;
    DecimalFormat df=new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textedit = findViewById(R.id.TicketPriceUser);
        texteditPrice = findViewById(R.id.DiscountOutPut);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        findViewById(R.id.Calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String catman;
                double userInput = 0, DiscountPrice = 0;
                int discountButton = 0;

                try {
                    catman = textedit.getText().toString();
                    userInput = Double.parseDouble(catman);

                    discountButton = radioGroup.getCheckedRadioButtonId();
                    Log.d(TAG, "This is the priice:" + catman);

                    if (discountButton == R.id.radioButton) {
                        DiscountPrice = userInput - (userInput * (FivePercent));
                        Log.d(TAG, "This is the priice:" + DiscountPrice);
                        texteditPrice.setText("$ "+df.format(DiscountPrice) + "");
                    } else if (discountButton == R.id.radioButton2) {
                        DiscountPrice = userInput - (userInput * (TenPercent));
                        Log.d(TAG, "This is the priice:" + DiscountPrice);
                        texteditPrice.setText("$ "+df.format(DiscountPrice) + "");
                    } else if (discountButton == R.id.radioButton3) {
                        DiscountPrice = userInput - (userInput * (FifteenPercent));
                        Log.d(TAG, "This is the priice:" + DiscountPrice);
                        texteditPrice.setText("$ "+df.format(DiscountPrice) + "");
                    } else if (discountButton == R.id.radioButton4) {
                        DiscountPrice = userInput - (userInput * (TwentyPercent));
                        Log.d(TAG, "This is the priice:" + DiscountPrice);
                        texteditPrice.setText("$ "+df.format(DiscountPrice) + "");
                    } else if (discountButton == R.id.radioButton5) {
                        DiscountPrice = userInput - (userInput * (FiftyPercent));
                        Log.d(TAG, "This is the priice:" + DiscountPrice);
                        texteditPrice.setText("$ "+df.format(DiscountPrice) + "");
                    }



                } catch (Exception NumberFormatException) {
                    Toast.makeText(getApplicationContext(), "Wrong Format", Toast.LENGTH_LONG).show();
                    textedit.setText("");
                }





            }
        });
        findViewById(R.id.Clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textedit.setText("");
                texteditPrice.setText("");
                radioGroup.clearCheck();
                Log.d(TAG, "Hi do you work");
            }
        });

    }
}