package com.example.kinga.hazi7_bkinga;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ValutaAdapter extends RecyclerView.Adapter<ValutaAdapter.CountryViewHolder> {
    List<Valuta> countrys;

    ValutaAdapter(MainActivity mainActivity, List<Valuta> countrys) {
        this.countrys = countrys;
    }


    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.activity_my_recycler_view_card_view, viewGroup, false );
        CountryViewHolder cvh = new CountryViewHolder( v );
        return cvh;
    }

    @Override
    public void onBindViewHolder(CountryViewHolder countryViewHolder, int i) {
        Valuta valuta = countrys.get( i );
        countryViewHolder.nameID.setText( valuta.getVname() );
        countryViewHolder.infoID.setText( valuta.getVinfo() );
        countryViewHolder.imageID.setImageResource( valuta.getVimageID() );
    }

    @Override
    public int getItemCount() {
        return countrys.size();
    }


    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView nameID;
        TextView infoID;
        ImageView imageID;

        CountryViewHolder(View itemView) {
            super( itemView );
            cardView = (CardView) itemView.findViewById( R.id.cardView );
            nameID = (TextView) itemView.findViewById( R.id.nametextViewID );
            infoID = (TextView) itemView.findViewById( R.id.infotextViewID );
            imageID = (ImageView) itemView.findViewById( R.id.imageViewID );
        }
    }
}
