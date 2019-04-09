package com.example.zino.finalproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Phase1 extends AppCompatActivity {

    public MediaPlayer music1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase1);

        LinearLayout layout1 = findViewById(R.id.layout1);
        AnimationDrawable animationDrawable = (AnimationDrawable) layout1.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        music1 = MediaPlayer.create(this,R.raw.main);
        music1.start();

        Button start = (Button)findViewById(R.id.start1);

        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Phase1.this,Phase2.class);
                startActivity(intent);
                music1.stop();
            }
        });
    }
}
