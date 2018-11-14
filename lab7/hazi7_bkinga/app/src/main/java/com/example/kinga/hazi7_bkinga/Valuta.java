package com.example.kinga.hazi7_bkinga;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Valuta implements Serializable {

    private int vimageID;
    private String vname;
    private String vinfo;

    public Valuta(String name, String info, int imageID) {

        this.vimageID = imageID;
        this.vname = name;
        this.vinfo = info;

    }

    public int getVimageID() {
        return vimageID;
    }

    public String getVname() {
        return vname;
    }

    public String getVinfo() {
        return vinfo;
    }

    public static List<Valuta> getValuta() {
        List<Valuta> countrys;
        countrys = new ArrayList<>();
        countrys.add(new Valuta("EUR", "Euro", R.drawable.eur));
        countrys.add(new Valuta("USD", "Dolar american", R.drawable.usd));
        countrys.add(new Valuta("GBP", "Lira sterlina", R.drawable.gbp));
        countrys.add(new Valuta("AUD", "Dolar austrian", R.drawable.aud));
        countrys.add(new Valuta("CAD", "Dolar canadian", R.drawable.cad));
        countrys.add(new Valuta("CHF", "Franc elvetian", R.drawable.chf));
        countrys.add(new Valuta("DKK", "Corona daneza", R.drawable.dkk));
        countrys.add(new Valuta("HUF", "Forint maghiar", R.drawable.huf));
        return countrys;
    }
}
