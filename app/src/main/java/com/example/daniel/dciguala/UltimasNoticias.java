package com.example.daniel.dciguala;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Daniel on 03/08/2015.
 */
public class UltimasNoticias extends Fragment{

    TextView titulo;
    TextView noticia;
    TextView nombre;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ultimasnoticias, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        titulo = (TextView)getView().findViewById(R.id.txtTitulo);
        noticia = (TextView)getView().findViewById(R.id.txtNoticia);
        nombre = (TextView)getView().findViewById(R.id.lbNombre);

    }

    @Override
    public void onResume() {
        super.onResume();
        if(Singleton.getTituloNoticia() != null) {
            titulo.setText(Singleton.getTituloNoticia());
            noticia.setText(Singleton.getDescripcionNoticia());
            nombre.setText("Publicado por: " + Singleton.getNombre());
        }
    }
}
