package com.example.daniel.dciguala;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.location.LocationManager;
import android.preference.DialogPreference;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Daniel on 03/08/2015.
 */
public class EnviarNoticia extends Fragment {

    Button btnEnviar;
    EditText titulo;
    EditText noticia;
    double lat;
    double lon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.enviarnoticia, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnEnviar = (Button)getView().findViewById(R.id.btnEnviar);
        titulo = (EditText)getView().findViewById(R.id.txtTituloNoticia);
        noticia = (EditText)getView().findViewById(R.id.txtDescNoticia);
    }

    @Override
    public void onResume() {
        super.onResume();

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            Toast toast1 = Toast.makeText(getActivity().getApplicationContext(),"Latitud: "+ lat+"Longitud: "+lon , Toast.LENGTH_SHORT);
                toast1.show();

            Singleton.setTituloNoticia(titulo.getText().toString());
            Singleton.setDescripcionNoticia(noticia.getText().toString());
            }
        });
    }
}
