package com.example.mislugares.datos;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mislugares.R;
import com.example.mislugares.modelo.Lugar;

public class AdaptadorLugares extends BaseAdapter {

    private LayoutInflater inflador; //Crea layouts a partir del XML
    //Creamos las vistas necesarias para recoger los datos de elemento_lista.xml
    TextView nombre,direccion;
    ImageView foto;
    RatingBar valoracion;
    private LugaresLista lugares =  new LugaresLista(); //Crea todos los lugares que vamos a mostrar en la lista

    public AdaptadorLugares(Context contexto){
        inflador = (LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return lugares.tamanio();
    }

    @Override
    public Object getItem(int position) {
        return lugares.elemento(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View vista, ViewGroup padre) {
        Lugar lugar = lugares.elemento(position);
        if(vista == null){
            vista = inflador.inflate(R.layout.elemento_lista,null);
        }
        nombre = (TextView)vista.findViewById(R.id.nombre);
        direccion = (TextView)vista.findViewById(R.id.direccion);
        foto = (ImageView) vista.findViewById(R.id.foto);
        valoracion = (RatingBar) vista.findViewById(R.id.valoracion);

        nombre.setText(lugar.getNombre());
        direccion.setText(lugar.getDireccion());

        //Obtengo el id de la foto otros por default
        int id = R.drawable.otros;

        switch(lugar.getTipo()){
            case RESTAURANTE:id = R.drawable.restaurante; break;
            case BAR:id = R.drawable.bar; break;
            case COPAS:id = R.drawable.copas; break;
            case ESPECTACULO:id = R.drawable.espectaculos; break;
            case HOTEL:id = R.drawable.hotel; break;
            case COMPRAS:id = R.drawable.compras; break;
            case EDUCACION:id = R.drawable.educacion; break;
            case DEPORTE:id = R.drawable.deporte; break;
            case NATURALEZA:id = R.drawable.naturaleza; break;
            case GASOLINERA:id = R.drawable.gasolinera; break;
        }
        foto.setImageResource(id);
        foto.setScaleType(ImageView.ScaleType.FIT_END); //Escala la foto para poner limites y que no se vea mal al modificar el tamaño
        valoracion.setRating(lugar.getValoracion());

        return vista;
    }
}
