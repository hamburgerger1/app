package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size=30;
    public void bigger(View v){
        TextView txv;
        txv=(TextView) findViewById(R.id.txv);
        txv.setTextSize(++size);
    }
    public void display(View v){
        EditText name=(EditText)findViewById(R.id.name);
        TextView text2=(TextView) findViewById(R.id.txv);
        text2.setText(name.getText().toString());
    }
}