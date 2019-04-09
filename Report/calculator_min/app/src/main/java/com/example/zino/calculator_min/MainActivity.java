package com.example.zino.calculator_min;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button bplu,bmin,bmul,bdiv,breset;
    Button bequ,bdot;
    TextView answer;
    double var1,var2;
    boolean plu,min,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=(Button) findViewById(R.id.button0);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);

        bplu=(Button) findViewById(R.id.buttonplu);
        bmin=(Button) findViewById(R.id.buttonmin);
        bmul=(Button) findViewById(R.id.buttonmul);
        bdiv=(Button) findViewById(R.id.buttondiv);
        breset=(Button) findViewById(R.id.buttonreset);

        bequ=(Button) findViewById(R.id.buttonequ);
        bdot=(Button) findViewById(R.id.buttondot);

        answer = (TextView) findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+".");
            }
        });
        bplu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(answer.getText() + "");
                plu = true;
                answer.setText(null);
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(answer.getText() + "");
                min = true;
                answer.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(answer.getText() + "");
                mul = true;
                answer.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(answer.getText() + "");
                div = true;
                answer.setText(null);
            }
        });
        breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               answer.setText(null);
            }
        });
        bequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               var2 = Double.parseDouble(answer.getText()+"");

               if (plu == true) {
                   answer.setText(var1+var2+"");
                   plu = false;
               }
               else if (min == true) {
                   answer.setText(var1-var2+"");
                   min = false;
               }
               else if (mul == true) {
                   answer.setText(var1*var2+"");
                   mul = false;
               }
               else if (div == true) {
                   answer.setText(var1/var2+"");
                   div = false;
               }
            }
        });
    }
}
