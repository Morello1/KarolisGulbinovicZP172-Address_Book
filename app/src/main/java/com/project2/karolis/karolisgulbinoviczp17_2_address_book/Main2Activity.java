package com.project2.karolis.karolisgulbinoviczp17_2_address_book;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText vardas;
    EditText pavarde;
    EditText numeris;
    public final static String MESSAGE_KEY ="message.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Action2(View v) {
        vardas = (EditText) findViewById(R.id.Vardas);
        pavarde = (EditText) findViewById(R.id.Pavarde);
        numeris = (EditText) findViewById(R.id.numeris);
        String message = vardas.getText().toString();
        Intent i = new Intent(Main2Activity.this,MainActivity.class);
        i.putExtra(MESSAGE_KEY,message);
        startActivity(i);
    }


}
