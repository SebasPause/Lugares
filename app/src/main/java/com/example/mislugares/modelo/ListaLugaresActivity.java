package com.example.mislugares.modelo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mislugares.R;

public class ListaLugaresActivity extends AppCompatActivity {

    public AdaptadorLugares adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lugares);
    }
}