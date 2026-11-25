package com.simulador.marcapasos;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimulacion = findViewById(R.id.btnSimulacion);
        Button btnParametros = findViewById(R.id.btnParametros);
        Button btnBiblioteca = findViewById(R.id.btnBiblioteca);
        Button btnAcerca = findViewById(R.id.btnAcerca);

        btnSimulacion.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SimulacionActivity.class));
        });

        btnParametros.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ParametrosActivity.class));
        });

        btnBiblioteca.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, BibliotecaActivity.class));
        });

        btnAcerca.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AcercaActivity.class));
        });
    }
}
