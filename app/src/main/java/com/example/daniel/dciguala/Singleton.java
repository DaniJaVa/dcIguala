package com.example.daniel.dciguala;
public class Singleton {

    private static String nombre;
    private static Singleton instancia = null;
    private static String tituloNoticia;
    private static String descripcionNoticia;
    private static double latitud;
    private static double longitud;
    private static String fecha;

    //Constructor Privado
    private Singleton() {
    }
    public static Singleton getInstancia(){
        if(instancia==null){
            instancia = new Singleton();
        }
        return instancia;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Singleton.nombre = nombre;
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
    public static double getLatitud(){
        return latitud;
    }
    public static void setLatitud(double latitud){
        Singleton.latitud = latitud;
    }
    public static double getLongitud(){
        return longitud;
    }
    public static void setLongitud(double longitud){
        Singleton.longitud = longitud;
    }
}
