package com.example.containers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
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

    //1.- Necesario para RecyclerView
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Cargar XML
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacto_item, parent, false);
        //Crear el ViewHolder
        ViewHolder viewHolder = new ViewHolder(vista);
        return viewHolder;
    }

    //2 Enlaza los datos del xml al objeto actual
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int posicion_actual )
    {
        //obtener el objeto actual que se va a cargar en el ViewHolder
        ContactoModel contactoActual = datos.get(posicion_actual);
        //cargar los datos del contacto al ViewHolder
        viewHolder.nombre.setText(contactoActual.NOMBRE);
        viewHolder.telefono.setText(contactoActual.TELEFONO);
        viewHolder.correo.setText(contactoActual.CORREO);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}






