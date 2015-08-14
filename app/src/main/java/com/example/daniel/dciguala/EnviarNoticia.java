package com.example.daniel.dciguala;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Daniel on 03/08/2015.
 */
public class EnviarNoticia extends Fragment {

    Button btnEnviar;
    EditText titulo;
    EditText noticia;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.enviarnoticia, container, false);
        Ubicacion ubicacion = new Ubicacion(getActivity().getApplicationContext());

        Singleton.setLatitud(ubicacion.latitud);
        Singleton.setLongitud(ubicacion.longitud);
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
            public void onClick(View v) {
                String titulo1 = titulo.getText().toString();
                String noticia1 = noticia.getText().toString();

                if (TextUtils.isEmpty(titulo1)) {
                    titulo.setError("Introduce un titulo");
                } if(TextUtils.isEmpty(noticia1)) {
                    noticia.setError("Introduce una descripcion");
                } if(!TextUtils.isEmpty(titulo1) && !TextUtils.isEmpty(noticia1)){
                    Singleton.setTituloNoticia(titulo.getText().toString());
                    Singleton.setDescripcionNoticia(noticia.getText().toString());
                    Toast toast3 = Toast.makeText(getActivity().getApplicationContext(), "Se ha publicado tu noticia", Toast.LENGTH_SHORT);
                    toast3.show();
                }
            }
        });
    }
}



