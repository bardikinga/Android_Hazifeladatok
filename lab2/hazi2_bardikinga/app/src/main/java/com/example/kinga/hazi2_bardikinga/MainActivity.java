package com.example.kinga.hazi2_bardikinga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String tag = "Status ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String tag = "Status ";
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
                startActivity(intent);
            }
        });

        Log.d(tag, "MainActiviti on Create");
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

