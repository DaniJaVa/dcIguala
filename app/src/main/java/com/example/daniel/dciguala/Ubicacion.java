package com.example.daniel.dciguala;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

public class Ubicacion extends Service implements LocationListener{

    private final Context ctx;

    double latitud;
    double longitud;
    Location location;
    boolean gpsActivo;
    TextView texto;
    LocationManager locationManager;

    public Ubicacion(){
        super();
        this.ctx = this.getApplication();

    }

    public Ubicacion(Context c){
        super();
        this.ctx = c;
        getLocation();
    }

    public void setView(View v){
        texto = (TextView)v;
        texto.setText("Coordenadas: "+latitud+", "+longitud);
    }

    public void getLocation(){
        try{
            locationManager = (LocationManager)this.ctx.getSystemService(LOCATION_SERVICE);
            gpsActivo = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

        }catch(Exception e){}
        if (gpsActivo){
            locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER,
                    1000*60,
                    10,
                    this);

            location=locationManager.getLastKnownLocation(locationManager.GPS_PROVIDER);
            latitud = location.getLatitude();
            longitud = location.getLongitude();
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
