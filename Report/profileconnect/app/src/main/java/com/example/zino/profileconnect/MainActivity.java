package com.example.zino.profileconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nametext = (EditText) findViewById(R.id.nametext);
        final EditText phonetext = (EditText) findViewById(R.id.phonetext);
        final EditText emailtext = (EditText) findViewById(R.id.emailtext);
        final EditText messagetext = (EditText) findViewById(R.id.messagetext);

        final Button buttonsave = (Button) findViewById(R.id.button1);
        final Button buttondel = (Button) findViewById(R.id.button2);
        final Button buttoncancel = (Button) findViewById(R.id.button3);

        final Number count = 0;

        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i<5; i++) {

                }
            }
        });

        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              for (int i=0; i<5; i++) {

              }
            }
        });

        buttoncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nametext.setText(NULL);
                phonetext.setText(NULL);
                emailtext.setText(NULL);
                messagetext.setText(NULL);
            }
        });
    }

}
