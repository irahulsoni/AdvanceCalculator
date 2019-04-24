package com.example.project;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import module.GenerateRandom ;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String result,KEY = "ok", res_plus, res_minus, res_times;
    Integer wswitch;
    Switch switc;
    ImageButton imagebuttonswitch;
    TextView textView;
    EditText DisplayResult, edittexttime;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonadd,
            buttondot, buttonequals, buttonreset,buttonminus,buttonmultiply,buttongenerate,history,buttonresume,buttonstop,buttonsave,buttonpause;
    Integer Answer = 0;
    Integer val1 = 0,  val2 = 0, rightAnswer= 0, wrongAnswer= 0;
    int min= 2, max = 9;
    String[] operators = {"+","-","*"};
    ArrayList<GenerateRandom> list = new ArrayList<>();
    String operator;
    GenerateRandom resultObj;
    private boolean isPaused = false;
    private boolean isCanceled = false;
    private long timeRemaining = 0;
CountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize() {

        button1 =  findViewById(R.id.button1);
        imagebuttonswitch =  findViewById(R.id.imagebuttonswitch);
        button2 = findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        button0 =  findViewById(R.id.button0);
        buttonadd =  findViewById(R.id.buttonAdd);
        buttonmultiply =  findViewById(R.id.buttonmultiply);
        buttondot = findViewById(R.id.buttondot);
        buttonreset =  findViewById(R.id.buttonreset);
        buttonequals =  findViewById(R.id.buttonequals);
        buttonminus = findViewById(R.id.buttonminus);
        DisplayResult = findViewById(R.id.DisplayResult);
        buttongenerate = findViewById(R.id.buttongenerate);
        buttonstop = findViewById(R.id.buttonstop);
        buttonresume = findViewById(R.id.buttonresume);
        buttonpause = findViewById(R.id.buttonpause);
        buttonsave = findViewById(R.id.buttonsave);
        edittexttime = findViewById(R.id.edittexttime);
        textView = findViewById(R.id.textView);
        history = findViewById(R.id.history);
        switc = findViewById(R.id.switc);


        imagebuttonswitch.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonadd.setOnClickListener(this);
        buttonmultiply.setOnClickListener(this);
        buttondot.setOnClickListener(this);
        buttonequals.setOnClickListener(this);
        buttonreset.setOnClickListener(this);
        buttonminus.setOnClickListener(this);
        buttongenerate.setOnClickListener(this);
        buttonstop.setOnClickListener(this);
        buttonresume.setOnClickListener(this);
        buttonpause.setOnClickListener(this);
        buttonsave.setOnClickListener(this);
        history.setOnClickListener(this);
        textView.setOnClickListener(this);
        switc.setOnClickListener(this);
        edittexttime.setOnClickListener(this);

        buttonsave.setEnabled(false);
        buttonstop.setEnabled(false);
        buttongenerate.setEnabled(true);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.switc:
                if (switc.isChecked()) {
                    buttongenerate.setVisibility(View.VISIBLE);
                    buttonmultiply.setEnabled(false);
                    history.setVisibility(View.VISIBLE);
                   edittexttime.setVisibility(View.VISIBLE);
                    buttonresume.setVisibility(View.VISIBLE);
                    buttonpause.setVisibility(View.VISIBLE);
                    buttonsave.setVisibility(View.VISIBLE);
                    buttonstop.setVisibility(View.VISIBLE);
                    buttonadd.setEnabled(false);
                //    buttonminus.setVisibility(View.INVISIBLE);
                    edittexttime.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);

                } else {
                    textView.setVisibility(View.INVISIBLE);
                    buttongenerate.setVisibility(View.INVISIBLE);
                    //  generateequal.setVisibility(View.INVISIBLE);
                    history.setVisibility(View.INVISIBLE);
                    buttonmultiply.setEnabled(true);
                    buttonresume.setVisibility(View.INVISIBLE);
                    buttonpause.setVisibility(View.INVISIBLE);
                    buttonsave.setVisibility(View.INVISIBLE);
                    buttonstop.setVisibility(View.INVISIBLE);
                    buttonadd.setEnabled(true);
                    buttonminus.setEnabled(true);
                    edittexttime.setVisibility(View.INVISIBLE);

                }
                break;
            case R.id.button1:
                result = DisplayResult.getText().toString() + "1";
                DisplayResult.setText(result);
                break;
            case R.id.button2:
                result = DisplayResult.getText().toString() + "2";
                DisplayResult.setText(result);
                break;
            case R.id.button3:
                result = DisplayResult.getText().toString() + "3";
                DisplayResult.setText(result);
                break;
            case R.id.button4:
                result = DisplayResult.getText().toString() + "4";
                DisplayResult.setText(result);
                break;
            case R.id.button5:
                result = DisplayResult.getText().toString() + "5";
                DisplayResult.setText(result);
                break;
            case R.id.button6:
                result = DisplayResult.getText().toString() + "6";
                DisplayResult.setText(result);
                break;
            case R.id.button7:
                result = DisplayResult.getText().toString() + "7";
                DisplayResult.setText(result);
                break;
            case R.id.button8:
                result = DisplayResult.getText().toString() + "8";
                DisplayResult.setText(result);
                break;
            case R.id.button9:
                result = DisplayResult.getText().toString() + "9";
                DisplayResult.setText(result);
                break;
            case R.id.button0:
                result = DisplayResult.getText().toString() + "0";
                DisplayResult.setText(result);
                break;
            case R.id.buttondot:
                result = DisplayResult.getText().toString() + ".";
                DisplayResult.setText(result);
                break;
            case R.id.buttonAdd:
                res_plus = DisplayResult.getText().toString();
                DisplayResult.setText("");
                wswitch = 1;
                break;

            case R.id.buttonminus:
                    result = DisplayResult.getText().toString() + "-";

                res_minus = DisplayResult.getText().toString();
                DisplayResult.setText("");
                wswitch = 2;
                break;

            case R.id.buttonmultiply:
                res_times = DisplayResult.getText().toString();
                DisplayResult.setText("");
                wswitch = 3;
                break;
            case R.id.imagebuttonswitch:
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory(Intent.CATEGORY_HOME);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                break;

            case R.id.history:
                Intent intent = new Intent(this, history.class);
                intent.putExtra("Result List", list);
                startActivity(intent);
                break;

                case R.id.buttonsave:
                    list.add(resultObj);
                    Toast.makeText(this, "Result Saved!", Toast.LENGTH_SHORT).show();
                    break;


            case R.id.buttongenerate:
                buttonsave.setEnabled(false);
                buttonresume.setEnabled(false);
                buttonstop.setEnabled(true);
                buttongenerate.setEnabled(false);
                DisplayResult.setText(null);
                textView.setText("");
                generate();

                CountDownTimer timer = null;
                long millisInFuture = 10000;
                long countDownInterval = 1000;

    countDownTimer = new CountDownTimer(millisInFuture, countDownInterval) {
        public void onTick(long millisUntilFinished) {
            //do something in every tick
            if (isPaused || isCanceled) {
                //If the user request to cancel or paused the
                //CountDownTimer we will cancel the current instance
                cancel();
            } else {
                //Display the remaining seconds to app interface
                //1 second = 1000 milliseconds
                edittexttime.setText("Time Remaining: " + millisUntilFinished / 1000);
                //Put count down timer remaining time in a variable
                timeRemaining = millisUntilFinished;
            }
        }

        public void onFinish() {
            //Do something when count down finished
           generate();
start();

        }
    }.start();
                break;

            case R.id.buttonresume:

                buttongenerate.setEnabled(false);
                buttonresume.setEnabled(false);
                //Enable the pause and cancel button
                buttonstop.setEnabled(true);
                buttonstop.setEnabled(true);
buttonpause.setEnabled(true);
                //Specify the current state is not paused and canceled.
                isPaused = false;
                isCanceled = false;
                long millisInFuture1 = timeRemaining;
                long countDownInterval1 = 1000;

                //Initialize a new CountDownTimer instance
                new CountDownTimer(millisInFuture1, countDownInterval1){
                    public void onTick(long millisUntilFinished){
                        //Do something in every tick
                        if(isPaused || isCanceled)
                        {
                            //If user requested to pause or cancel the count down timer
                            cancel();
                        }
                        else {
                            edittexttime.setText("Time Remaining:" + millisUntilFinished / 1000);
                            //Put count down timer remaining time in a variable
                            long timeRemaining1 = millisUntilFinished;
                        }
                    }
                    public void onFinish(){
                        timeRemaining = 10000;
                        generate();
                        start();
                        //Disable the pause, resume and cancel button
                        buttonpause.setEnabled(true);
                        buttonresume.setEnabled(false);
                        buttonstop.setEnabled(true);
                        //Enable the start button
                        buttongenerate.setEnabled(true);
                        validateAnswer();
                    }
                }.start();
                break;

            case R.id.buttonreset:
                DisplayResult.setText("");
                textView.setText("");
                break;


            case R.id.buttonpause:
                isPaused = true;

                //Enable the resume and cancel button
                buttonresume.setEnabled(true);
                buttonstop.setEnabled(true);
                //Disable the start and pause button
                buttongenerate.setEnabled(false);
                buttonpause.setEnabled(false);
                break;


            case R.id.buttonstop:
                buttonsave.setEnabled(true);
                buttonstop.setEnabled(false);
                buttonpause.setEnabled(false);
                buttongenerate.setEnabled(true);
                isCanceled = true;
                Toast.makeText(this,  "Finished", Toast.LENGTH_SHORT).show();
                countDownTimer.cancel();
//                calculateResult();
                break;


            case R.id.buttonequals:
                if (switc.isChecked()) {

                    calculateResult();
                } else {
                    switch (wswitch) {
                        case 1:
                            if (res_plus.matches("") || DisplayResult.getText().toString().matches("")) {
                                DisplayResult.setText("");
                            } else {
                                Answer = Integer.parseInt(res_plus) + Integer.parseInt(DisplayResult.getText().toString());
                                result = Integer.toString(Answer);
                                DisplayResult.setText(result);

                            }
                            break;

                        case 2:
                            if (res_minus.matches("") || DisplayResult.getText().toString().matches("")) {
                                DisplayResult.setText("");
                            } else {
                                Answer = Integer.parseInt(res_minus) - Integer.parseInt(DisplayResult.getText().toString());
                                result = Double.toString(Answer);
                                DisplayResult.setText(result);
                            }
                            break;

                        case 3:
                            if (res_minus.matches("") || DisplayResult.getText().toString().matches("")) {
                                DisplayResult.setText("");
                            } else {
                                Answer = Integer.parseInt(res_minus) * Integer.parseInt(DisplayResult.getText().toString());
                                result = Double.toString(Answer);
                                DisplayResult.setText(result);
                            }
                            break;

                    }
                }
                break;

        }
    }
    private void generate(){
        Random random = new Random();
        DisplayResult.setText(null);
        val1 = new Random().nextInt((max - min) + 1) + min;
        val2 = new Random().nextInt((max - min) + 1) + min;
        int index = random.nextInt(3);
        operator = operators[index];
        textView.setText(val1 +operator+ val2);
    }
    private void validateAnswer() {
        edittexttime.setText("-");
         buttonsave.setEnabled(true);
        history.setEnabled(true);
        buttonreset.setEnabled(false);
        buttonequals.setEnabled(false);
        buttongenerate.setText("Play");
        calculateResult();
    }

    private void calculateResult() {
        int userValue = 0;
        if (timeRemaining == 0 && DisplayResult.getText().toString().equals("")){
            Toast.makeText(this, "Not Answered", Toast.LENGTH_SHORT).show();
            userValue = Integer.MAX_VALUE;
        }
        else if(!DisplayResult.getText().toString().equals("")) {
            userValue = Integer.parseInt(DisplayResult.getText().toString());
        }
            Calculate calc = new Calculate();
            Boolean result = calc.calculate(val1, val2, userValue, operator, list);
            Toast.makeText(this, result + "", Toast.LENGTH_SHORT).show();
        generate();
        countDownTimer.start();
        }
    }

