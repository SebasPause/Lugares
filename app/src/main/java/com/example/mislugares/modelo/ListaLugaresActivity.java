package com.example.mislugares.modelo;


import android.app.ListActivity;
import android.os.Bundle;

import com.example.mislugares.R;
import com.example.mislugares.datos.AdaptadorLugares;

public class ListaLugaresActivity extends ListActivity {

    public AdaptadorLugares adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lugares);
        adaptador = new AdaptadorLugares(this);
        setListAdapter(adaptador);
    }
}