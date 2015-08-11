package com.example.daniel.dciguala;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Daniel on 03/08/2015.
 */
public class EnviarNoticia extends Fragment {


    private Button button;
    private TextView txtTitulo = (TextView)getView().findViewById(R.id.txtTituloNoticia);
    private TextView txtNoticia = (TextView)getView().findViewById(R.id.txtDescNoticia);
    private LatLng ubicacion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.enviarnoticia, container, false);
        return rootView;
    }

    public TextView getTxtTitulo() {
        return txtTitulo;
    }

    public TextView getTxtNoticia() {
        return txtNoticia;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
