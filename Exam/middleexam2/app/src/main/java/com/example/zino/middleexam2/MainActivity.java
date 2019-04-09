package com.example.zino.middleexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Switch switchbutton = (Switch) findViewById(R.id.switch1);

        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.Hide);

        final RadioButton radiobutton1 = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton radiobutton2 = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton radiobutton3 = (RadioButton) findViewById(R.id.radioButton3);

        final ImageView imageview = (ImageView) findViewById(R.id.imageView);
        final TextView textView = (TextView) findViewById(R.id.textView2);

        final Button endbutton = (Button) findViewById(R.id.button2);
        final Button startbutton = (Button) findViewById(R.id.button3);

        linearLayout.setVisibility(View.INVISIBLE);

        switchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchbutton.isChecked()) {
                    linearLayout.setVisibility(View.VISIBLE);
                }
                else {
                    linearLayout.setVisibility(View.INVISIBLE);
                    radiobutton1.setChecked(false);
                    radiobutton2.setChecked(false);
                    radiobutton3.setChecked(false);
                    imageview.setVisibility(View.INVISIBLE);
                }
            }
        });

        radiobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageview.setVisibility(View.VISIBLE);
                imageview.setImageResource(R.drawable.image1);
            }
        });
        radiobutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageview.setVisibility(View.VISIBLE);
                imageview.setImageResource(R.drawable.image2);
            }
        });
        radiobutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageview.setVisibility(View.VISIBLE);
                imageview.setImageResource(R.drawable.image3);
            }
        });
        endbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchbutton.setChecked(false);
                linearLayout.setVisibility(View.INVISIBLE);
                radiobutton1.setChecked(false);
                radiobutton2.setChecked(false);
                radiobutton3.setChecked(false);
                imageview.setVisibility(View.INVISIBLE);
            }
        });
    }
}
