package com.example.kinga.hazi7_bkinga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detaly extends AppCompatActivity {

    public static final String EXTRA_VALUTA = "EXTRA_VALUTA";
    private Valuta valuta;
    private TextView tvName;
    private TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaly);

        TextView nev = (TextView) findViewById(R.id.nametextViewID);
        TextView info = (TextView) findViewById(R.id.infotextViewID);

        valuta = (Valuta) getIntent().getExtras().getSerializable(EXTRA_VALUTA);
        nev.setText(valuta.getVname());
        info.setText(valuta.getVinfo());

    }
}
