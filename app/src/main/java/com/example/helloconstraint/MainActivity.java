package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnToast;
    private Button btnCount;
    private TextView Countt;
    private Button btnZero;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast=findViewById(R.id.button2);
        btnCount=findViewById(R.id.button3);
        btnZero=findViewById(R.id.buttonZero);
        Countt=findViewById(R.id.textView2);

        btnToast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(MainActivity.this,"Hello Toast!",Toast.LENGTH_LONG).show();
            }
        });
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = count + 1;
                Countt.setText("" + count);
                btnZero.setBackgroundColor(getResources().getColor(R.color.Green33));

                if(count%2==0) {
                    btnCount.setBackgroundColor(getResources().getColor(R.color.Black00));
                }

                if(count%2==1) {
                    btnCount.setBackgroundColor(getResources().getColor(R.color.FireRed));
                }
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                Countt.setText("" + count);
                btnZero.setBackgroundColor(getResources().getColor(R.color.gray));
                btnCount.setBackgroundColor(getResources().getColor(R.color.purple_700));
            }
        });

    }
}