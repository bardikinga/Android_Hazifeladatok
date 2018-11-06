package com.example.kinga.hazi6_bkinga;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowItemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.activity_custom_list_adapter2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String info = extras.getString("name");
            Double price = extras.getDouble("buy", 0);
            TextView textView = (TextView)findViewById(R.id.selectedopt);
            textView.setText("You have selected " + info + " worth: " + price.toString());
        }
    }
}
