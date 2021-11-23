package com.hanoak.demo;

import static com.hanoak.demo.R.id.edittext;
import static com.hanoak.demo.R.id.up;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class calculator extends AppCompatActivity {
    private EditText display ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        display = findViewById(edittext);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                if (getString(R.id.edittext).equals(display.getText().toString() ) ){
                    display.setText(" ");
                }
            }
        });
    }
    private void updateText (String strToAdd){
        String oldStr =display.getText().toString();
        int cursorPos =display.getSelectionStart();
        String leftStr= oldStr.substring(0,cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
        display.setSelection(cursorPos+1);




    }


    public void  zeroB(View View){
        updateText("0");

    }
    public void  UNB(View View){
        updateText("1");

    }
    public void  DEUXB(View View){
updateText("2");
    }
    public void  TROISB(View View){
updateText("3");
    }
    public void  QB(View View){
        updateText("4");

    }
    public void  CINQB(View View){
        updateText("5");

    }
    public void SIXB(View View){
        updateText("6");

    }
    public void  sEPTB(View View){
        updateText("7");

    }
    public void  HB(View View){
        updateText("8");

    }
    public void  NB(View View){
        updateText("9");

    }
    public void  PLUSB(View View){
        updateText("+");

    }
    public void  MULTIPLICATIONB(View View){
        updateText("-");

    }
    public void  EQUALB(View View){
        updateText("=");

    }
    public void  SOUSTRACTION(View View){
        updateText("-");

    }
    public void  PARENTHESEB(View View){
        updateText("()");

    }
    public void  PLUSMOINS(View View){
        updateText("+/-");

    }
    public void  aDDITION(View View){
        updateText("+");

    }
    public void  dIVISION(View View){
        updateText("/");

    }
    public void  CLEAR(View View){
        display.setText("") ;

    }
    public void  VIRGULE(View View){
        updateText(".");

    }
    public void  MODULO(View View){
        updateText("%");

    }
}