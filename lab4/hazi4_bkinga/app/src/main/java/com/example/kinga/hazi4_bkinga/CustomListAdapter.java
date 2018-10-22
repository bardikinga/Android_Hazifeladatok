package com.example.kinga.hazi4_bkinga;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final Integer[] imageIDarray;
    private final String[] nameArray;
    private final String[] infoArray;
    private final String[] cumarArray;
    private final String[] vanzariArray;



    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam, String[] cumarArray, String[] vanzariArray) {

        super(context, R.layout.adapter2, nameArrayParam);
        this.context = context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
        this.cumarArray = cumarArray;
        this.vanzariArray = vanzariArray;


    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.adapter2, null, true);

        TextView nameTextField = (TextView) rowView.findViewById(R.id.nametextViewID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infotextViewID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageViewID);
        TextView cumparari = (TextView) rowView.findViewById(R.id.CumID);
        TextView vanzari = (TextView) rowView.findViewById(R.id.VanID);
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);
        cumparari.setText(cumarArray[position]);
        vanzari.setText(vanzariArray[position]);
        return rowView;

    }

}
