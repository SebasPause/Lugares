package com.example.mislugares.modelo;

public class Geopunto {
    private Double longitud, latitud;

    static public Geopunto SIN_POSICION = new Geopunto(0.0,0.0);

    @Override
    public String toString() {
        return "Geopunto{" +
                "longitud=" + longitud +
                ", latitud=" + latitud +
                '}';
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Geopunto(Double longitud, Double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }


    //Creo un GeoPunto g1 de longitud 2.6 y latitud 3.7 y GeoPunto g2 de long 6.7 y lat 1.3
    //Si hago g1.distancia(g2)
    //Mide la distancia entre un punto y otro
    public double distancia(Geopunto punto){
        final double RADIO_TIERRA = 63171000; //en metros
        double dLat = Math.toRadians(latitud-punto.latitud);
        double dLon = Math.toRadians(longitud-punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2)
                + Math.sin(dLon/2) * Math.sin(dLon/2)
                * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c = RADIO_TIERRA;
    }

}
