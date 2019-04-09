package com.example.asus.calc_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, bdot, bequal, breset;
    TextView ans;
    double var1, var2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc1);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        b3=(Button) findViewById(R.id.btn3);
        b4=(Button) findViewById(R.id.btn4);
        b5=(Button) findViewById(R.id.btn5);
        b6=(Button) findViewById(R.id.btn6);
        b7=(Button) findViewById(R.id.btn7);
        b8=(Button) findViewById(R.id.btn8);
        b9=(Button) findViewById(R.id.btn9);
        b0=(Button) findViewById(R.id.btn0);
        badd=(Button) findViewById(R.id.badd);
        bsub=(Button) findViewById(R.id.bsub);
        bmul=(Button) findViewById(R.id.bmul);
        bdiv=(Button) findViewById(R.id.bdiv);
        bdot=(Button) findViewById(R.id.bdot);
        bequal=(Button) findViewById(R.id.b);
        breset=(Button) findViewById(R.id.btnreset);

        ans=(TextView) findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        } );
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");
            }
        } );
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");
            }
        } );
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");
            }
        } );
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");
            }
        } );
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");
            }
        } );
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");
            }
        } );
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");
            }
        } );
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"9");
            }
        } );
        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");
            }
        } );
        bdot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText()+".");
            }
        } );
        badd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                add=true;
                ans.setText(null);
            }
        } );
        bsub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                sub=true;
                ans.setText(null);
            }
        } );
        bmul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                mul=true;
                ans.setText(null);
            }
        } );
        bdiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                div=true;
                ans.setText(null);
            }
        } );
        breset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ans.setText(null);
            }
        } );
        bequal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var2=Double.parseDouble(ans.getText()+"");
                if (add==true){
                    ans.setText(var1+var2+"");
                    add=false;
                }
                else if (sub==true){
                    ans.setText(var1-var2+"");
                    sub=false;
                }
                else if (mul==true){
                    ans.setText(var1*var2+"");
                    mul=false;
                }
                else if (div==true){
                    ans.setText(var1/var2+"");
                    div=false;
                }
            }
        } );

    }
}
