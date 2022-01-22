/*
HomeWork 1
Tip Calculator
Drac
 */


package com.example.homework_1_tipcalc;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    final String TAG = "Demo";
    EditText textedit;
    SeekBar seekBar;
    TextView textViewSeek, textTotal, moneyTip, totalPerPerson;
    final double TenPercent = .10;
    final double FiftinePercen = .15;
    final double eighteenPercen = .18;
    String batman = "";
    int tipPercent = 0, numberDiv = 1, start = 0;
    double userInput = 0, tipInMoney = 0, TotalOwed = 0, finalAmount = 0, ScrollTip = 0;
    DecimalFormat df = new DecimalFormat("0.00");
    boolean handled = false, one = false, two = false, three = false, four = false;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is the start of the Try catch so that only numbers are permitted as a value
        try {
            textedit = findViewById(R.id.editTextNumberDecimal5);
        /*
        This is the declaration of the RadioGroups and Radio Buttons both sets radio Group one
         for percentage and radio group 2 for number of people
         */
            RadioGroup radioGroup = findViewById(R.id.radioGroup);
            RadioButton radioButton = findViewById(R.id.radioButton1);
            RadioButton radioButton2 = findViewById(R.id.radioButton2);
            RadioButton radioButton3 = findViewById(R.id.radioButton3);
            RadioButton radioButton4 = findViewById(R.id.radioButton4);

            RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
            RadioButton radioButton6 = findViewById(R.id.radioButton6);
            RadioButton radioButton7 = findViewById(R.id.radioButton7);
            RadioButton radioButton8 = findViewById(R.id.radioButton8);
            // setting the values of the text that changes
            seekBar = findViewById(R.id.seekBar);
            textViewSeek = findViewById(R.id.textView11);
            moneyTip = findViewById(R.id.textView10);
            textTotal = findViewById(R.id.textView9);
            totalPerPerson = findViewById(R.id.textView12);
            totalPerPerson.setText("$0.0");
            //Seting the radioButtons to false so that they do not work till a value is place in by the user
            radioButton2.setEnabled(false);
            radioButton3.setEnabled(false);
            radioButton4.setEnabled(false);
            radioButton6.setEnabled(false);
            radioButton7.setEnabled(false);
            radioButton8.setEnabled(false);
            textViewSeek.setText("40%");

            // This is the text change listener so that everything is updated as it is typed in or deleted
            textedit.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    handled = false;
                }

                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    /*
                    checks to see if the userinfo field is not empty
                     once it is not empty all the buttons are enabled
                     */

                    if (textedit.length() > 0) {
                        batman = textedit.getText().toString();
                        handled = true;
                        radioButton2.setEnabled(true);
                        radioButton3.setEnabled(true);
                        radioButton4.setEnabled(true);
                        radioButton6.setEnabled(true);
                        radioButton7.setEnabled(true);
                        radioButton8.setEnabled(true);

                        // checks to see if button is check and that the the typed text is one after the decimal
                        if (radioButton.isChecked() && !batman.equalsIgnoreCase(".")) {
                            seekBar.setEnabled(false);
                            seekBar.setProgress(40);
                            userInput = Double.parseDouble(batman);
                            tipInMoney = (userInput * TenPercent);
                            TotalOwed = tipInMoney + userInput;
                            Log.d(TAG, tipInMoney + "" + " Money Tip");
                            Log.d(TAG, "Hit there");
                            moneyTip.setText("$" + df.format(tipInMoney) + "");
                            textTotal.setText("$" + TotalOwed + "");
                            if (one) {
                                finalAmount = TotalOwed / 1;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (two) {
                                finalAmount = TotalOwed / 2;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (three) {
                                finalAmount = TotalOwed / 3;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (four) {
                                finalAmount = TotalOwed / 4;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            }


                        } else if (radioButton2.isChecked() && !batman.equalsIgnoreCase(".")) {
                            seekBar.setProgress(40);
                            seekBar.setEnabled(false);
                            userInput = Double.parseDouble(batman);
                            tipInMoney = (userInput * FiftinePercen);
                            TotalOwed = tipInMoney + userInput;
                            Log.d(TAG, tipInMoney + "" + " Money Tip");
                            Log.d(TAG, "Hit there");
                            moneyTip.setText("$" + df.format(tipInMoney) + "");
                            textTotal.setText("$" + df.format(TotalOwed) + "");
                            if (one) {
                                finalAmount = TotalOwed / 1;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (two) {
                                finalAmount = TotalOwed / 2;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (three) {
                                finalAmount = TotalOwed / 3;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (four) {
                                finalAmount = TotalOwed / 4;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            }


                        } else if (radioButton3.isChecked() && !batman.equalsIgnoreCase(".")) {
                            seekBar.setProgress(40);
                            seekBar.setEnabled(false);
                            userInput = Double.parseDouble(batman);
                            tipInMoney = (userInput * eighteenPercen);
                            TotalOwed = tipInMoney + userInput;
                            radioGroup2.getCheckedRadioButtonId();
                            Log.d(TAG, tipInMoney + "" + " Money Tip");
                            Log.d(TAG, "Hit there");
                            moneyTip.setText("$" + df.format(tipInMoney) + "");
                            textTotal.setText("$" + df.format(TotalOwed) + "");
                            if (one) {
                                finalAmount = TotalOwed / 1;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (two) {
                                finalAmount = TotalOwed / 2;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (three) {
                                finalAmount = TotalOwed / 3;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (four) {
                                finalAmount = TotalOwed / 4;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            }


                        } else if (radioButton4.isChecked() && !batman.equalsIgnoreCase(".")) {
                            seekBar.setEnabled(true);

                            seekBar.setMin(40);
                            userInput = Double.parseDouble(batman);
                            double tipconverter = 40;
                            tipconverter = tipconverter / 100;
                            tipInMoney = (userInput * (tipconverter));
                            TotalOwed = tipInMoney + userInput;
                            moneyTip.setText("$" + df.format(tipInMoney) + "");
                            textTotal.setText("$" + TotalOwed + "");
                            if (one) {
                                finalAmount = TotalOwed / 1;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (two) {
                                finalAmount = TotalOwed / 2;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (three) {
                                finalAmount = TotalOwed / 3;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            } else if (four) {
                                finalAmount = TotalOwed / 4;
                                totalPerPerson.setText("$" + df.format(finalAmount) + "");

                            }


                        }

                    }

                }

                /*
                   checks to see if the userinfo field is not empty
                    once it is not empty all the buttons are enabled
                    */
                @Override
                public void afterTextChanged(Editable editable) {
                    if (textedit.length() > 0 && !batman.equalsIgnoreCase(".")) {
                        batman = textedit.getText().toString();
                        handled = true;
                        radioButton2.setEnabled(true);
                        radioButton3.setEnabled(true);
                        radioButton4.setEnabled(true);
                        radioButton6.setEnabled(true);
                        radioButton7.setEnabled(true);
                        radioButton8.setEnabled(true);

                    } else if (textedit.length() <= 0) {
                        handled = false;
                        moneyTip.setText("$0.0");
                        textTotal.setText("$0.0");
                        textViewSeek.setText("40%");
                        totalPerPerson.setText("$0.0");
                        radioGroup.check(R.id.radioButton1);
                        radioGroup2.check((R.id.radioButton5));
                        radioButton2.setEnabled(false);
                        radioButton3.setEnabled(false);
                        radioButton4.setEnabled(false);
                        radioButton6.setEnabled(false);
                        radioButton7.setEnabled(false);
                        radioButton8.setEnabled(false);
                    }
                    if (radioButton.isChecked() && handled && !batman.equalsIgnoreCase(".")) {
                        userInput = Double.parseDouble(batman);
                        tipInMoney = (userInput * TenPercent);
                        TotalOwed = tipInMoney + userInput;
                        Log.d(TAG, tipInMoney + "" + " Money Tip");
                        Log.d(TAG, "Hit there");
                        moneyTip.setText("$" + df.format(tipInMoney) + "");
                        textTotal.setText("$" + df.format(TotalOwed) + "");
                        totalPerPerson.setText("$" + df.format(TotalOwed) + "");


                    }
                }
            });
            /*
             sets the seekBar max and min and sets progress to 40 and
             makes it not enabled before custom is selected
            seekBar.setMax(50);
             */

            seekBar.setMin(40);
            seekBar.setProgress(40);
            seekBar.setEnabled(false);

            /*
            This is the start of the first radio Group listener this check
            to see what tep percentage that the user wants
             */

            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    //this get the users input as a string
                    batman = textedit.getText().toString();


                    tipPercent = radioGroup.getCheckedRadioButtonId();

                    // This check to see if the radio id is the id that is selected and works for the corresponding if statement

                    //10%
                    if (tipPercent == R.id.radioButton1 && handled) {
                        seekBar.setEnabled(false);
                        seekBar.setProgress(40);
                        userInput = Double.parseDouble(batman);
                        tipInMoney = (userInput * TenPercent);
                        TotalOwed = tipInMoney + userInput;
                        Log.d(TAG, tipInMoney + "" + " Money Tip");
                        Log.d(TAG, "Hit there");
                        moneyTip.setText("$" + df.format(tipInMoney) + "");
                        textTotal.setText("$" + df.format(TotalOwed) + "");
                        if (one) {
                            finalAmount = TotalOwed / 1;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (two) {
                            finalAmount = TotalOwed / 2;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (three) {
                            finalAmount = TotalOwed / 3;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (four) {
                            finalAmount = TotalOwed / 4;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        }

                        //15%
                    } else if (tipPercent == R.id.radioButton2 && handled) {
                        seekBar.setEnabled(false);
                        seekBar.setProgress(40);
                        userInput = Double.parseDouble(batman);
                        tipInMoney = (userInput * FiftinePercen);
                        TotalOwed = tipInMoney + userInput;
                        Log.d(TAG, tipInMoney + "" + " Money Tip");
                        Log.d(TAG, "Hit there");
                        moneyTip.setText("$" + df.format(tipInMoney) + "");
                        textTotal.setText("$" + df.format(TotalOwed) + "");
                        if (one) {
                            finalAmount = TotalOwed / 1;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (two) {
                            finalAmount = TotalOwed / 2;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (three) {
                            finalAmount = TotalOwed / 3;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (four) {
                            finalAmount = TotalOwed / 4;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        }

                        //18%
                    } else if (tipPercent == R.id.radioButton3 && handled) {
                        seekBar.setEnabled(false);
                        seekBar.setProgress(40);
                        userInput = Double.parseDouble(batman);
                        tipInMoney = (userInput * eighteenPercen);
                        TotalOwed = tipInMoney + userInput;
                        radioGroup2.getCheckedRadioButtonId();
                        Log.d(TAG, tipInMoney + "" + " Money Tip");
                        Log.d(TAG, "Hit there");
                        moneyTip.setText("$" + df.format(tipInMoney) + "");
                        textTotal.setText("$" + TotalOwed + "");
                        if (one) {
                            finalAmount = TotalOwed / 1;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (two) {
                            finalAmount = TotalOwed / 2;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (three) {
                            finalAmount = TotalOwed / 3;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (four) {
                            finalAmount = TotalOwed / 4;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        }

                        //custom
                    } else if (tipPercent == R.id.radioButton4 && handled) {
                        seekBar.setEnabled(true);
                        seekBar.setMin(40);
                        userInput = Double.parseDouble(batman);
                        double tipconverter = 40;
                        tipconverter = tipconverter / 100;
                        tipInMoney = (userInput * (tipconverter));
                        TotalOwed = tipInMoney + userInput;
                        moneyTip.setText("$" + df.format(tipInMoney) + "");
                        textTotal.setText("$" + df.format(TotalOwed) + "");
                        if (one) {
                            finalAmount = TotalOwed / 1;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (two) {
                            finalAmount = TotalOwed / 2;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (three) {
                            finalAmount = TotalOwed / 3;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        } else if (four) {
                            finalAmount = TotalOwed / 4;
                            totalPerPerson.setText("$" + df.format(finalAmount) + "");

                        }


                    }


                }


            });

            /*
             This is the seekBar listener once custom is selected this become enabled allowing
             the user to scroll and find the desired tip percentage
             */

            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    textViewSeek.setText(i + "" + "%");
                    userInput = Double.parseDouble(batman);
                    double tipconverter = i;
                    tipconverter = tipconverter / 100;
                    tipInMoney = (userInput * (tipconverter));
                    TotalOwed = tipInMoney + userInput;
                    Log.d(TAG, tipInMoney + "" + " Money Tip");
                    Log.d(TAG, "Hit there");
                    moneyTip.setText("$" + df.format(tipInMoney) + "");
                    textTotal.setText("$" + TotalOwed + "");
                    if (one) {
                        finalAmount = TotalOwed / 1;
                        totalPerPerson.setText("$" + df.format(finalAmount) + "");

                    } else if (two) {
                        finalAmount = TotalOwed / 2;
                        totalPerPerson.setText("$" + df.format(finalAmount) + "");

                    } else if (three) {
                        finalAmount = TotalOwed / 3;
                        totalPerPerson.setText("$" + df.format(finalAmount) + "");

                    } else if (four) {
                        finalAmount = TotalOwed / 4;
                        totalPerPerson.setText("$" + df.format(finalAmount) + "");

                    }
                    Log.d(TAG, ScrollTip + "");

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
            // This is the clear button sets everything back to its original state
            findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    radioGroup.clearCheck();
                    radioGroup2.clearCheck();
                    textViewSeek.setText("40%");
                    seekBar.setProgress(40);
                    seekBar.setEnabled(false);
                    start = 0;
                    radioGroup.check(R.id.radioButton1);
                    radioGroup2.check(R.id.radioButton5);
                    moneyTip.setText("$0.0");
                    textTotal.setText("$0.0");
                    totalPerPerson.setText("$0.0");
                    textedit.setText("");
                }
            });

            /*
             This is the second radioGroup wear the user selects how many
              people they wish to divide the bill by sets the currently click one to true once it
             its true the corresponding math is done in the currently selected group1 and group 2
             */
            //
            //
            radioGroup2.setOnCheckedChangeListener((radioGroup21, i) -> {
                numberDiv = radioGroup21.getCheckedRadioButtonId();

                if (numberDiv == R.id.radioButton5) {
                    one = true;
                    two = false;
                    three = false;
                    four = false;
                    finalAmount = TotalOwed / 1;
                    totalPerPerson.setText("$" + df.format(finalAmount) + "");
                    Log.d(TAG, "Did you get here 1");
                } else if (numberDiv == R.id.radioButton6) {
                    one = false;
                    two = true;
                    three = false;
                    four = false;

                    finalAmount = TotalOwed / 2;
                    totalPerPerson.setText("$" + df.format(finalAmount) + "");
                    Log.d(TAG, "Did you get here 2");
                } else if (numberDiv == R.id.radioButton7) {
                    one = false;
                    two = false;
                    three = true;
                    four = false;
                    finalAmount = TotalOwed / 3;
                    totalPerPerson.setText("$" + df.format(finalAmount) + "");
                    Log.d(TAG, "Did you get here 3");
                } else if (numberDiv == R.id.radioButton8) {
                    one = false;
                    two = false;
                    three = false;
                    four = true;
                    finalAmount = TotalOwed / 4;
                    totalPerPerson.setText("$" + df.format(finalAmount) + "");
                    Log.d(TAG, "Did you get here 4");
                }

            });

            // catches the exception
        } catch (Exception NumberFormatException) {
            Toast.makeText(getApplicationContext(), "Wrong Format", Toast.LENGTH_LONG).show();
            textedit.setText("");
        }

    }

}