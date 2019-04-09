package com.example.zino.finalproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;

public class Phase5 extends AppCompatActivity {

    public MediaPlayer music3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phase5);

        LinearLayout layout5 = findViewById(R.id.layout5);
        AnimationDrawable animationDrawable = (AnimationDrawable) layout5.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        music3 = MediaPlayer.create(this,R.raw.welcome);
        music3.start();

        Button complete1 = (Button)findViewById(R.id.complete1);

        final EditText edit = (EditText)findViewById(R.id.inputname);

        complete1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Phase5.this,Phase6.class);
                intent.putExtra("name",String.valueOf(edit.getText()));
                startActivity(intent);
            }
        });
    }
}