package com.example.kinga.hazi5_bkinga;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {

    String[] animals = {"Macska", "Kutya", "Hal", "Madar","Kigyo"};

    List<String> lista = new ArrayList<String>(Arrays.asList(animals));
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.listaID);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.rendez:
                Collections.sort(lista, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareToIgnoreCase(o2);
                    }
                });
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "Rendezes Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.delete:
                lista.clear();
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "Delete Selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch (item.getItemId()) {
            case R.id.piros:
                info.targetView.setBackgroundColor(Color.RED);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.zold:
                info.targetView.setBackgroundColor(Color.GREEN);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.sarga:
                info.targetView.setBackgroundColor(Color.YELLOW);
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }
}