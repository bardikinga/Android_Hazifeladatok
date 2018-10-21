package com.example.kinga.hazi4_bkinga;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

class Detali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detali);
        String savedExtra = getIntent().getStringExtra("nev");
        TextView myText = (TextView) findViewById(R.id.infotextViewID);
        String savedExtra2 = getIntent().getStringExtra("veves");
        TextView myText2 = (TextView) findViewById(R.id.vevesID);
        String savedExtra3 = getIntent().getStringExtra("eladas");
        TextView myText3 = (TextView) findViewById(R.id.eladasID);
        myText.setText(savedExtra);
        myText2.setText(savedExtra2);
        myText3.setText(savedExtra3);
    }
}
