package com.example.kinga.hazi2_bardikinga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {
    final String tag = "Status ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Button btnstart = (Button) findViewById(R.id.btnstart);
        Button btnfinish = (Button) findViewById(R.id.btnfinish);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityThree.class);
                startActivity(intent);
            }
        });
        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                finish();
            }
        });
        Log.d(tag, "ActivityTwo lepese");
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

