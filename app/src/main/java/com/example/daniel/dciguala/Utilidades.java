package com.example.daniel.dciguala;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Daniel on 13/08/2015.
 */
public class Utilidades {

    public static void alertDialogShow(final Activity activity, String message, String title, boolean cancelable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        final EditText input = new EditText(activity);
        builder.setTitle(title)
                .setMessage(message)
                .setView(input)
                .setCancelable(cancelable)
                .setPositiveButton("OK",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
        final AlertDialog alert = builder.create();
        alert.show();
        Button positive = alert.getButton(Dialog.BUTTON_POSITIVE);
        positive.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String value = input.getText().toString().trim();
                if(value.equals("")) {
                    Toast.makeText(activity.getApplicationContext(), "Introduce tu nombre",
                            Toast.LENGTH_SHORT).show();
                } else{
                    Singleton.setNombre(input.getText().toString());
                    alert.dismiss();
                }
            }
        });
    }
}
