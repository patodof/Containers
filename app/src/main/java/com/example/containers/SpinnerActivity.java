package com.example.containers;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    Button boton_volver ;
    Spinner spinner_ejemplo ;
    ArrayList<String> lenguajes_programacion ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //declaracion de variables
        boton_volver = findViewById(R.id.boton_spinner_volver);
        spinner_ejemplo = findViewById(R.id.spinner_ejemplo);

        //poblar datos
        lenguajes_programacion = new ArrayList<String>();
        lenguajes_programacion.add("Java");
        lenguajes_programacion.add("Python");
        lenguajes_programacion.add(".NET");

        //crear Adapater
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, lenguajes_programacion );
        //asociar el adapter ya con datos a nuestro container spinner
        spinner_ejemplo.setAdapter(adapter);
    }
}