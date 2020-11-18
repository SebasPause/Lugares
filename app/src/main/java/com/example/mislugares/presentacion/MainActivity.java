package com.example.mislugares.presentacion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;


import com.example.mislugares.R;
import com.example.mislugares.modelo.VistaLugares;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import android.preference.PreferenceManager;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    boolean boldStyle;
    boolean italicStyle;
    String textColor;
    String backgroundColor;
    Button misLugares,preferencias,acercaDe,salir;
    NestedScrollView nsv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        PreferenceManager.setDefaultValues(this, R.xml.main_preferences, false);
        loadPreferences();

    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        loadPreferences();
    }


    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //Menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            lanzarPreferencias(null);
            return true;
        }
        if (id == R.id.btn_Acerca_de) {
            lanzarAcercaDe(null);
            return true;
        }
        if (id == R.id.btn_Salir) {
            finish();
        }
        if (id == R.id.btn_MisLugares) {
            lanzarLugares(null);
        }
        return super.onOptionsItemSelected(item);
    }

    public void lanzarPreferencias(View view){
        Intent intent = new Intent(this,PreferenciasActivity.class);
        startActivity(intent);
        loadPreferences();
    }

    public void lanzarAcercaDe(View view){
        Intent intent = new Intent(this, AcercaDe.class);
        startActivity(intent);
    }

    public void lanzarLugares(View view){
        Intent intent = new Intent(this, VistaLugares.class);
        startActivity(intent);
    }

    public void finish(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public void loadPreferences(){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

        //Obtengo el estilo
        boldStyle = pref.getBoolean("boldStyle", false);

        //negrita y cursiva
        int style = 0;
        if(boldStyle)
            style = style | Typeface.BOLD;
        if(italicStyle)
            style = style | Typeface.ITALIC;

        //Declaracion de los botones
        misLugares = (Button)findViewById(R.id.btn_MisLugares);
        preferencias = (Button)findViewById(R.id.btn_Preferencias);
        acercaDe = (Button)findViewById(R.id.btn_Acerca_de);
        salir = (Button)findViewById(R.id.btn_Salir);

        //Ponemos el estilo
        misLugares.setTypeface(null, style);
        preferencias.setTypeface(null, style);
        acercaDe.setTypeface(null, style);
        salir.setTypeface(null, style);

        //Obtengo el color
        textColor = pref.getString("textColor", "Blanco");

        //cambiar color de la letra
        switch (textColor)
        {
            case "Marron":
                misLugares.setTextColor(getResources().getColor(R.color.Marron));
                preferencias.setTextColor(getResources().getColor(R.color.Marron));
                acercaDe.setTextColor(getResources().getColor(R.color.Marron));
                salir.setTextColor(getResources().getColor(R.color.Marron));
                break;
            case "Verde":
                misLugares.setTextColor(getResources().getColor(R.color.Verde));
                preferencias.setTextColor(getResources().getColor(R.color.Verde));
                acercaDe.setTextColor(getResources().getColor(R.color.Verde));
                salir.setTextColor(getResources().getColor(R.color.Verde));
                break;
            case "Negro":
                misLugares.setTextColor(getResources().getColor(R.color.Negro));
                preferencias.setTextColor(getResources().getColor(R.color.Negro));
                acercaDe.setTextColor(getResources().getColor(R.color.Negro));
                salir.setTextColor(getResources().getColor(R.color.Negro));
                break;
            case "Blanco":
                misLugares.setTextColor(getResources().getColor(R.color.Blanco));
                preferencias.setTextColor(getResources().getColor(R.color.Blanco));
                acercaDe.setTextColor(getResources().getColor(R.color.Blanco));
                salir.setTextColor(getResources().getColor(R.color.Blanco));
                break;
            case "Azul":
                misLugares.setTextColor(getResources().getColor(R.color.Azul));
                preferencias.setTextColor(getResources().getColor(R.color.Azul));
                acercaDe.setTextColor(getResources().getColor(R.color.Azul));
                salir.setTextColor(getResources().getColor(R.color.Azul));
                break;
            case "Gris":
                misLugares.setTextColor(getResources().getColor(R.color.Gris));
                preferencias.setTextColor(getResources().getColor(R.color.Gris));
                acercaDe.setTextColor(getResources().getColor(R.color.Gris));
                salir.setTextColor(getResources().getColor(R.color.Gris));
                break;
            case "Naranja":
                misLugares.setTextColor(getResources().getColor(R.color.Naranja));
                preferencias.setTextColor(getResources().getColor(R.color.Naranja));
                acercaDe.setTextColor(getResources().getColor(R.color.Naranja));
                salir.setTextColor(getResources().getColor(R.color.Naranja));
                break;
            case "Amarillo":
                misLugares.setTextColor(getResources().getColor(R.color.Amarillo));
                preferencias.setTextColor(getResources().getColor(R.color.Amarillo));
                acercaDe.setTextColor(getResources().getColor(R.color.Amarillo));
                salir.setTextColor(getResources().getColor(R.color.Amarillo));
                break;
            case "Morado":
                misLugares.setTextColor(getResources().getColor(R.color.Morado));
                preferencias.setTextColor(getResources().getColor(R.color.Morado));
                acercaDe.setTextColor(getResources().getColor(R.color.Morado));
                salir.setTextColor(getResources().getColor(R.color.Morado));
                break;
            case "Rosa":
                misLugares.setTextColor(getResources().getColor(R.color.Rosa));
                preferencias.setTextColor(getResources().getColor(R.color.Rosa));
                acercaDe.setTextColor(getResources().getColor(R.color.Rosa));
                salir.setTextColor(getResources().getColor(R.color.Rosa));
                break;
            case "Rojo":
                misLugares.setTextColor(getResources().getColor(R.color.Rojo));
                preferencias.setTextColor(getResources().getColor(R.color.Rojo));
                acercaDe.setTextColor(getResources().getColor(R.color.Rojo));
                salir.setTextColor(getResources().getColor(R.color.Rojo));
                break;
        }

        backgroundColor = pref.getString("backgroundColor", "white");

        nsv = (NestedScrollView)findViewById(R.id.contenedor);

        //Color de fondo
        switch (backgroundColor)
        {
            case "Marron":
                nsv.setBackgroundColor(getResources().getColor(R.color.Marron));
                break;
            case "Verde":
                nsv.setBackgroundColor(getResources().getColor(R.color.Verde));
                break;
            case "Negro":
                nsv.setBackgroundColor(getResources().getColor(R.color.Negro));
                break;
            case "Blanco":
                nsv.setBackgroundColor(getResources().getColor(R.color.Blanco));
                break;
            case "Azul":
                nsv.setBackgroundColor(getResources().getColor(R.color.Azul));
                break;
            case "Gris":
                nsv.setBackgroundColor(getResources().getColor(R.color.Gris));
                break;
            case "Naranja":
                nsv.setBackgroundColor(getResources().getColor(R.color.Naranja));
                break;
            case "Amarillo":
                nsv.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                break;
            case "Morado":
                nsv.setBackgroundColor(getResources().getColor(R.color.Morado));
                break;
            case "Rosa":
                nsv.setBackgroundColor(getResources().getColor(R.color.Rosa));
                break;
            case "Rojo":
                nsv.setBackgroundColor(getResources().getColor(R.color.Rojo));
                break;
        }


    }

}