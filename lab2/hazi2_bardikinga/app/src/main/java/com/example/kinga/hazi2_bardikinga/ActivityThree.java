package com.example.kinga.hazi2_bardikinga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity {
    final String tag = "Status ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Button btnst = (Button) findViewById(R.id.btnst);
        Button btnfin = (Button) findViewById(R.id.btnfin);
        btnst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        btnfin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                finish();
            }
        });
        Log.d(tag, "Lepes az ActivityThree!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "On start");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "Activity Resume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "Activity Paused");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "Activity Stoped");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "Activity Destroy");
    }
}
