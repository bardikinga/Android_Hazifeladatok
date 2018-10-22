package com.example.kinga.hazi4_bkinga;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
    String[] infoArray = {"Euro",
            "Dolar american",
            "Lira sterlina",
            "Dolar austrian",
            "Dolar canadian",
            "Franc elvetian",
            "Corona daneza",
            "Forint maghiar"
    };
    Integer[] imageArray = {R.drawable.eur,
            R.drawable.usd,
            R.drawable.gbp,
            R.drawable.aud,
            R.drawable.cad,
            R.drawable.chf,
            R.drawable.dkk,
            R.drawable.huf
    };

    String[] cumarArray = {"4,4100 RON", "3,9750 RON", "6,1250 RON", "2,9600 RON", "3,0950 RON", "4,2300 RON", "0,5850 RON", "0,0136 RON"};
    String[] vanzariArray = {"4,5500 RON", "4,1450 RON", "6,3550 RON", "3,0600 RON", "3,2650 RON", "4,3300 RON", "0,6150 RON", "0,0146 RON"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter kinezet = new CustomListAdapter(this, nameArray, infoArray, imageArray, cumarArray, vanzariArray);
        listView = (ListView) findViewById(R.id.listaID);
        listView.setAdapter(kinezet);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), Detali.class);
                String message = infoArray[position];
                intent.putExtra("nev", message);
                String message2 = cumarArray[position];
                intent.putExtra("veves", message2);
                String message3 = vanzariArray[position];
                intent.putExtra("eladas", message3);

                startActivity(intent);

            }
        });

    }
}
