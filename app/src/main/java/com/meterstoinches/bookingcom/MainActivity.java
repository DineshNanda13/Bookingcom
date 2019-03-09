package com.meterstoinches.bookingcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.currentlocation);
        e2=(EditText)findViewById(R.id.cin);
        e3=(EditText)findViewById(R.id.cout);
        e4=(EditText)findViewById(R.id.room);
        e5=(EditText)findViewById(R.id.adults);
        e6=(EditText)findViewById(R.id.children);
        rg=(RadioGroup)findViewById(R.id.radiogroups);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.eg_menu,menu);
        return true;
    }

    public void searchbtn(View view) {
        Intent s = new Intent(MainActivity.this,Main2Activity.class);
        s.putExtra("checkin",e2.getText().toString());
        int a = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(a);
        s.putExtra("radio",rb.getText().toString());
        s.putExtra("rooms",e4.getText().toString());
        s.putExtra("kids",e6.getText().toString());
        s.putExtra("adults",e5.getText().toString());
        startActivity(s);


    }
}
