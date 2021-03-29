package com.example.changebackground_switchandtogglebuttonex061;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    View screenView;
    Switch swDN;
    ToggleButton tb;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenView = (View) findViewById(R.id.screenView);
        swDN = (Switch) findViewById(R.id.swDN);
        tb =(ToggleButton) findViewById(R.id.tb);
        btn = (Button) findViewById(R.id.btn);
    }

    public void onSwitch(View view) {}

    public void goToggle(View view) {}

    public void clickMe(View view) {
        if (swDN.isChecked()){
            if (tb.isChecked()){
                screenView.setBackgroundColor(Color.rgb(255,0,0));
            }
            else {
                screenView.setBackgroundColor(Color.rgb(0,255,51));
            }
        }
        else {
            if (tb.isChecked()){
                screenView.setBackgroundColor(Color.rgb(255,255,0));
            }
            else {
                screenView.setBackgroundColor(Color.rgb(9,0,255));
            }
        }
    }
}