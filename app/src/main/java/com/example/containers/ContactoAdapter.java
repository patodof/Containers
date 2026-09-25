package com.example.containers;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.ViewHolder> {
    //los datos del adaptador
    ArrayList<ContactoModel> datos ;

    //El viewHolder que nos permitira usar el XML en el codigo
    public static class  ViewHolder extends RecyclerView.ViewHolder
    {
        private final TextView nombre;
        private final TextView correo ;
        private final TextView telefono ;

        public ViewHolder(View v)
        {
            super(v);
            nombre = v.findViewById(R.id.txt_nombre_contacto);
            correo = v.findViewById(R.id.txt_correo_contacto);
            telefono = v.findViewById(R.id.txt_telefono_contacto);
        }

    }

    //Constructor para cuando se inicialice el adaptador
    ContactoAdapter (ArrayList<ContactoModel> datos_usuario )
    {
        datos = datos_usuario ;
    }

}
