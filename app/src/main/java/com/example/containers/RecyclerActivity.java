package com.example.containers;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recycler ;
    ArrayList<ContactoModel> datos_contacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recycler = findViewById(R.id.recycler_contactos);

        //aqui comienza el codigo
        //poblar los datos de tu lista
        datos_contacto = new ArrayList<>();
        datos_contacto.add(new ContactoModel("Juanito Perez", "juanito@abc.cl", "123456"));
        datos_contacto.add(new ContactoModel("Juanito Perez", "juanito@abc.cl", "123456"));
        datos_contacto.add(new ContactoModel("Juanito Perez", "juanito@abc.cl", "123456"));

        //crear el adapter
        ContactoAdapter adapter = new ContactoAdapter(datos_contacto);
        //Layout Manager
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //cargar el adapter a el recycler view
        recycler.setAdapter(adapter);
    }
}