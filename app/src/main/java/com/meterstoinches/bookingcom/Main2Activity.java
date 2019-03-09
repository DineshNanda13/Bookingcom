package com.meterstoinches.bookingcom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText g1,g2,g3,g4,g5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        g1=(EditText)findViewById(R.id.cindate);
        g2=(EditText)findViewById(R.id.rd);
        g3=(EditText)findViewById(R.id.rm);
        g4=(EditText)findViewById(R.id.child);
        g5=(EditText)findViewById(R.id.adul);

        String m1=getIntent().getStringExtra("checkin");
        g1.setText(m1);
        String m2=getIntent().getStringExtra("radio");
        g2.setText(m2);
        String m3=getIntent().getStringExtra("rooms");
        g3.setText(m3);
        String m4=getIntent().getStringExtra("kids");
        g4.setText(m4);
        String m5=getIntent().getStringExtra("adults");
        g5.setText(m5);


    }
}
