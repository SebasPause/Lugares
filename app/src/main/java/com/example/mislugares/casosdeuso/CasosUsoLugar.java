package com.example.mislugares.casosdeuso;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import com.example.mislugares.datos.RepositorioLugares;
import com.example.mislugares.presentacion.VistaLugarActivity;

public class CasosUsoLugar {
    private Activity actividad;
    private RepositorioLugares lugares;

    public CasosUsoLugar(Activity actividad, RepositorioLugares lugares){
        this.actividad = actividad;
        this.lugares = lugares;
    }

    //Operaciones basicas
    public void mostrar(int pos){
        Intent i =  new Intent(actividad, VistaLugarActivity.class);
        i.putExtra("pos",pos);
        actividad.startActivity(i);
    }

    public void borrar(final int id){
        new AlertDialog.Builder(actividad)
                .setTitle("Borrado de lugar")
                .setMessage("¿Esta seguro que desea eliminar este lugar?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        lugares.borrar(id);
                    }
                })
                .setNegativeButton("No",null)
                .show();
    }

    public void editar(int pos,int codSolicitud){

    }


}
