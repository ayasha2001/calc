package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDot,bC,bPlus,bMin,bMul,bDiv,bEquals;
    Float val1,val2;
    String operator;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bDot=findViewById(R.id.bDot);
        bC=findViewById(R.id.bC);
        bPlus=findViewById(R.id.bPlus);
        bMin=findViewById(R.id.bMin);
        bMul=findViewById(R.id.bMul);
        bDiv=findViewById(R.id.bDiv);
        bEquals=findViewById(R.id.bEquals);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String t = textView.getText().toString();
              //  int p=Integer.parseInt(t);
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("1");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "1");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("2");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "2");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("3");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("4");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("5");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("6");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "6");
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("7");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("8");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("9");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "9");
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("0");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ "0");
                }
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(null);
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().isEmpty())
                {
                    textView.setText("0.");
                }
                else
                {
                    textView.setText(textView.getText().toString()+ ".");
                }

            }
        });
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator="plus";
                val1=Float.parseFloat(textView.getText().toString());
                textView.setText(null); // or textView.setText(String.valueOf(val1+val2));
            }
        });
        bMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator="minus";
                val1=Float.parseFloat(textView.getText().toString());
                textView.setText(null);
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator="multiply";
                val1=Float.parseFloat(textView.getText().toString());
                textView.setText(null);
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator="divide";
                val1=Float.parseFloat(textView.getText().toString());
                textView.setText(null);
            }
        });

        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2=Float.parseFloat(textView.getText().toString());
                if(operator=="plus"){
                    textView.setText(String.valueOf(val1+val2));
                }
                else if(operator=="minus")
                {
                    textView.setText(String.valueOf(val1-val2));
                }
                else if(operator=="multiply")
                {
                    textView.setText(String.valueOf(val1*val2));
                }
                else if(operator=="divide")
                {
                    textView.setText(String.valueOf(val1/val2));
                }
            }
        });

    }
}