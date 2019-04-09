package com.example.zino.inputbig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final EditText answer;
        final TextView result;
        Button button;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = (EditText) findViewById(R.id.answer);
        button = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = answer.getText().toString();
               result.setText(str);
            }
        });
    }
}
