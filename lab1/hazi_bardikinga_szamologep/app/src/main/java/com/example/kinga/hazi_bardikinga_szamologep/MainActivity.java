package com.example.kinga.hazi_bardikinga_szamologep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1=(EditText) findViewById(R.id.editText);
        final EditText szam2=(EditText) findViewById(R.id.editText2);
        final Button plusz=(Button) findViewById(R.id.plusz);
        final Button minus=(Button) findViewById(R.id.minusz);
        final Button szorzas=(Button) findViewById(R.id.szorzas);
        final Button osztas=(Button) findViewById(R.id.osztas);
        final TextView tv=(TextView) findViewById(R.id.textView);

        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double eredmeny=Double.parseDouble(szam1.getText().toString())+Double.parseDouble(szam2.getText().toString());
                    tv.setText(Double.toString(eredmeny));
                } catch (NumberFormatException e){

                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double eredmeny=Double.parseDouble(szam1.getText().toString())-Double.parseDouble(szam2.getText().toString());
                    tv.setText(Double.toString(eredmeny));
                } catch (NumberFormatException e){

                }
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double eredmeny=Double.parseDouble(szam1.getText().toString())*Double.parseDouble(szam2.getText().toString());
                    tv.setText(Double.toString(eredmeny));
                }catch (NumberFormatException e) {

                }
            }
        });

         osztas.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 try {
                     double eredmeny=Double.parseDouble(szam1.getText().toString())/Double.parseDouble(szam2.getText().toString());
                     tv.setText(Double.toString(eredmeny));
                 }catch (NumberFormatException e){

                 }
          }
         });
    }
}
