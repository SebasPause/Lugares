package com.example.mislugares.presentacion;

public class Geopunto {
    Float longitud, latitud;

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    @Override
    public String toString() {
        return "Geopunto{" +
                "longitud=" + longitud +
                ", latitud=" + latitud +
                '}';
    }

    public Geopunto(Float longitud, Float latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }
}
