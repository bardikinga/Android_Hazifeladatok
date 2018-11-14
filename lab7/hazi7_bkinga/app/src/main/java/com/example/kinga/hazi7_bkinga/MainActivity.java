package com.example.kinga.hazi7_bkinga;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.time.Instant;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ValutaAdapter valutaAdapter;
    private List<Valuta> countrys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerView = (RecyclerView) findViewById( R.id.rvID );
        recyclerView.setHasFixedSize( true );
        final GridLayoutManager layoutManager = new GridLayoutManager( MainActivity.this, 1 );
        recyclerView.setLayoutManager( layoutManager );
        countrys = Valuta.getValuta();
        valutaAdapter = new ValutaAdapter( MainActivity.this, countrys );
        recyclerView.setAdapter( valutaAdapter );
    }
}
