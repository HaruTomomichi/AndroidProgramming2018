package com.example.zino.finalproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Phase2 extends AppCompatActivity {

    public MediaPlayer music2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phase2);

        LinearLayout layout2 = findViewById(R.id.layout2);
        AnimationDrawable animationDrawable = (AnimationDrawable) layout2.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        music2 = MediaPlayer.create(this,R.raw.practice);
        music2.start();

        Button okay1 = (Button) findViewById(R.id.okay1);

        okay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Phase2.this,Phase3.class);
                startActivity(intent);
            }
        });
    }
}
