package com.example.mislugares.modelo;

import java.io.File;
import java.sql.Date;

public class Lugar {
    private String nombre, direccion, url, comentario,foto;
    private Geopunto posicion;
    private int telefono;
    private long fecha;
    private Float valoracion;
    private TipoLugar tipo;

    public Lugar(){}


    public Lugar(String nombre, String direccion, double longitud, double latitud, int telefono, String url, String comentario, Float valoracion,TipoLugar tipo){
        this.nombre = nombre;
        this.direccion = direccion;
        fecha = System.currentTimeMillis();
        posicion = new Geopunto(longitud,latitud);
        this.url = url;
        this.comentario = comentario;
        this.telefono = telefono;
        this.valoracion = valoracion;
        this.tipo = tipo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Geopunto getPosicion() {
        return posicion;
    }

    public void setPosicion(Geopunto posicion) {
        this.posicion = posicion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public Float getValoracion() {
        return valoracion;
    }

    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }

}
