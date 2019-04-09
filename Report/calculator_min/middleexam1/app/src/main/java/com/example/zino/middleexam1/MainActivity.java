package com.example.zino.middleexam1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonroll = (Button) findViewById(R.id.buttonroll);
        final Button buttonview = (Button) findViewById(R.id.buttonview);

        final TextView hiddentext = (TextView) findViewById(R.id.hiddentext);

        final ImageView hiddenimage = (ImageView) findViewById(R.id.hiddenimage);

        hiddentext.setVisibility(View.INVISIBLE);
        hiddentext.bringToFront();
        hiddenimage.setVisibility(View.INVISIBLE);
        hiddenimage.bringToFront();

        buttonroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonroll.setBackgroundResource(R.drawable.stroke3);
                buttonview.setBackgroundResource(R.drawable.stroke2);
                hiddenimage.setVisibility(View.VISIBLE);
                hiddentext.setVisibility(View.INVISIBLE);
            }
        });

        buttonview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonview.setBackgroundResource(R.drawable.stroke3);
                buttonroll.setBackgroundResource(R.drawable.stroke2);
                hiddentext.setVisibility(View.VISIBLE);
                hiddenimage.setVisibility(View.INVISIBLE);
            }
        });


    }
}
