package com.example.daniel.dciguala;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Daniel on 10/08/2015.
 */
public class Singleton {

    private static Singleton instancia = null;
    private static String tituloNoticia;
    private static String descripcionNoticia;
    private static LatLng ubicacion;

    //Constructor Privado
    private Singleton() {
    }
    public static Singleton getInstancia(){
        if(instancia==null){
            instancia = new Singleton();
        }
        return instancia;
    }
    public static String getTituloNoticia(){

        return tituloNoticia;
    }
    public static void setTituloNoticia(String tituloNoticia){
        Singleton.tituloNoticia = tituloNoticia;
    }
    public static String getDescripcionNoticia(){

        return descripcionNoticia;
    }
    public static void setDescripcionNoticia(String descripcionNoticia){
        Singleton.descripcionNoticia = descripcionNoticia;
    }
    public static LatLng getUbicacion(){
        return ubicacion;
    }
    public static void setUbicacion(LatLng ubicacion){
        Singleton.ubicacion = ubicacion;
    }


}
