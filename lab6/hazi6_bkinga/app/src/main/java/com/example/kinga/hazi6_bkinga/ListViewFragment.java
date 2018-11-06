package com.example.kinga.hazi6_bkinga;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewFragment extends Fragment {

    protected static final String FRAG2 = "2";

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_list_view_fragment, container, false);

        final String[] nameArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
        final String[] infoArray = {"Euro", "Dolar american", "Lira sterlina", "Dolar austrian",
                "Dolar canadian", "Franc elvetian", "Corona daneza", "Forint maghiar"
        };
        Integer[] imageArray = {R.drawable.eur, R.drawable.usd, R.drawable.gbp, R.drawable.aud,
                R.drawable.cad, R.drawable.chf, R.drawable.dkk, R.drawable.huf
        };

        final String[] cumarArray = {"4,4100 RON", "3,9750 RON", "6,1250 RON", "2,9600 RON", "3,0950 RON", "4,2300 RON", "0,5850 RON", "0,0136 RON"};
        final String[] vanzariArray = {"4,5500 RON", "4,1450 RON", "6,3550 RON", "3,0600 RON", "3,2650 RON", "4,3300 RON", "0,6150 RON", "0,0146 RON"};


        ListView listView = view.findViewById(R.id.currencies);

        CustomListAdapter kinezet;
        kinezet = new CustomListAdapter(getActivity(), nameArray, infoArray, imageArray, cumarArray, vanzariArray);
        listView.setAdapter(kinezet);

        final FragmentManager fragmentManager = getFragmentManager();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (fragmentManager.findFragmentByTag(FRAG2) != null) {
                    TextView selectedOpt = (TextView) getActivity().findViewById(R.id.selectedopt);
                    selectedOpt.setText("You have selected " + nameArray[position] + cumarArray[position]);
                    // Toast.makeText(getActivity().getApplicationContext(),"Landscape mode", Toast.LENGTH_LONG).show();
                } else {
                    //Toast.makeText(getActivity().getApplicationContext(),"Landscape mode",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getActivity().getApplicationContext(), ShowItemActivity.class);
                    intent.putExtra("name", nameArray[position]);
                    intent.putExtra("vand", vanzariArray[position]);
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}