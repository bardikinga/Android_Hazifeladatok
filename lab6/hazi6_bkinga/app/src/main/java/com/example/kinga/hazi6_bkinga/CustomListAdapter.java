package com.example.kinga.hazi6_bkinga;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final Integer[] imageIDarray;
    private final String[] nameArray;
    private final String[] infoArray;
    private final String[] cumarArray;
    private final String[] vanzariArray;



    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam, String[] cumarArrayParam, String[] vanzariArrayParam) {

        super(context, R.layout.activity_custom_list_adapter, nameArrayParam);
        this.context = context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
        this.cumarArray = cumarArrayParam;
        this.vanzariArray = vanzariArrayParam;


    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_custom_list_adapter2, null, true);

        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView2);
        TextView cumparari = (TextView) rowView.findViewById(R.id.cumID);
        TextView vanzari = (TextView) rowView.findViewById(R.id.vanID);
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);
        cumparari.setText(cumarArray[position]);
        vanzari.setText(vanzariArray[position]);
        return rowView;

    }

}
