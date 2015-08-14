package com.example.daniel.dciguala;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Daniel on 03/08/2015.
 */
public class Mapa extends Fragment {
    private SupportMapFragment fragment;
    private GoogleMap map;
    LatLng iguala = new LatLng(18.344722, -99.539722);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mapa, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FragmentManager fm = getChildFragmentManager();
        fragment = (SupportMapFragment) fm.findFragmentById(R.id.mapa);
        if (fragment == null) {
            fragment = SupportMapFragment.newInstance();
            fm.beginTransaction().replace(R.id.mapa, fragment).commit();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (map == null) {
            map = fragment.getMap();
            map.setMyLocationEnabled(true);
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(iguala, 15));
            map.addMarker(new MarkerOptions().position(iguala)
                    .title("Titulo Noticia")
                    .snippet("Descripcion Noticia"));

            map.addMarker(new MarkerOptions().position(new LatLng(18.3447241, -99.5409239))
                    .title("Asalto a mano armada")
                    .snippet("Los sospechosos escapan en moto"));
            if (Singleton.getTituloNoticia() != null) {
                map.addMarker(new MarkerOptions().position(new LatLng(Singleton.getLatitud(),Singleton.getLongitud()))
                        .title(Singleton.getTituloNoticia().toString())
                        .snippet(Singleton.getDescripcionNoticia().toString()));
            }
        }
    }
}



