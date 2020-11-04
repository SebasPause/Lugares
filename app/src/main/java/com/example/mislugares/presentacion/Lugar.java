package com.example.mislugares.presentacion;

import java.io.File;
import java.sql.Date;

public class Lugar {
    String nombre, direccion, geopunto, url, comentario;
    File foto;
    int telefono;
    Date fecha;
    Float valoracion;

    @Override
    public String toString() {
        return "Lugar{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", geopunto='" + geopunto + '\'' +
                ", url='" + url + '\'' +
                ", comentario='" + comentario + '\'' +
                ", foto=" + foto +
                ", telefono=" + telefono +
                ", fecha=" + fecha +
                ", valoracion=" + valoracion +
                '}';
    }

    public Lugar(String nombre, String direccion, String geopunto, String url, String comentario, File foto, int telefono,
                 Date fecha, Float valoracion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.geopunto = geopunto;
        this.url = url;
        this.comentario = comentario;
        this.foto = foto;
        this.telefono = telefono;
        this.fecha = fecha;
        this.valoracion = valoracion;
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

    public String getGeopunto() {
        return geopunto;
    }

    public void setGeopunto(String geopunto) {
        this.geopunto = geopunto;
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

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getValoracion() {
        return valoracion;
    }

    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }


}
