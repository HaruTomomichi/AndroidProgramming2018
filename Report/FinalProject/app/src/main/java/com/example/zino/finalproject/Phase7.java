package com.example.zino.finalproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Phase7 extends AppCompatActivity {

    public MediaPlayer music5;

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phase7);

        LinearLayout layout7 = findViewById(R.id.final_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) layout7.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        Intent intent = new Intent(this.getIntent());
        score = intent.getIntExtra("score",0);
        TextView final_name = (TextView) findViewById(R.id.result);
        final_name.setText(Integer.toString(score));

        music5 = MediaPlayer.create(this,R.raw.end);
        music5.start();

        final Button reset = (Button) findViewById(R.id.reset);
        final Button exit = (Button) findViewById(R.id.exit);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
                finish();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                finish();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
