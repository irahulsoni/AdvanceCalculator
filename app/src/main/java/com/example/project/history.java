package com.example.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import android.view.View.OnClickListener;
import module.GenerateRandom;

public class history extends AppCompatActivity implements OnClickListener {
    Button backButton;
    TextView dispText;
    ArrayList<GenerateRandom> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);
        Bundle b  = getIntent().getExtras();
        list = (ArrayList<GenerateRandom>) b.getSerializable("Result List");
        initialize();
        setOnclickListeners();
        load();
    }

    private void initialize(){
        backButton = findViewById(R.id.backButton);
        dispText = findViewById(R.id.displayText);
    }

    private void setOnclickListeners(){
        backButton.setOnClickListener(this);
    }

    private void load(){
        if(list.isEmpty()) {
            dispText.setText("You have not solved any question till now");
        }
        else{
            Calculate result = new Calculate();
            dispText.setText(result.getDisplayString(list));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.backButton:
                finish();
        }
    }
}
