package com.example.min9yuth.exer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggleButton = (ToggleButton) this.findViewById(R.id.toggleButton) ;

        final LinearLayout linearLayout=(LinearLayout) findViewById(R.id.linear);

        final RadioButton radioButton1=(RadioButton) findViewById(R.id.radioButton);
        final RadioButton radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        final RadioButton radioButton3=(RadioButton)findViewById(R.id.radioButton3);

        final ImageView imageView=(ImageView) findViewById(R.id.imageView);

        final Button endbutton=(Button)findViewById(R.id.button3);
        final Button initialbutton=(Button)findViewById(R.id.button4);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButton.isChecked()){
                    linearLayout.setVisibility(View.VISIBLE);
                }else{
                    linearLayout.setVisibility(View.INVISIBLE);
                    radioButton1.setChecked(false);
                    radioButton2.setChecked(false);
                    radioButton3.setChecked(false);
                    imageView.setVisibility(View.INVISIBLE);
                }
            }
        });

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.a);
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.m);
            }
        });
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable.z);
            }
        });
        endbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initialbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleButton.setChecked(false);
                linearLayout.setVisibility(View.INVISIBLE);
                radioButton1.setChecked(false);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                imageView.setVisibility(View.INVISIBLE);
            }
        });

    }
}