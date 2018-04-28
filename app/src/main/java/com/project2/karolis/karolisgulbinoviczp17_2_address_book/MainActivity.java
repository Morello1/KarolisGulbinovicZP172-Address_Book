package com.project2.karolis.karolisgulbinoviczp17_2_address_book;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String MESSAGE_KEY ="message.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        TextView tekstas = new TextView(this);
        setContentView(tekstas);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
            public void Action(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }}
