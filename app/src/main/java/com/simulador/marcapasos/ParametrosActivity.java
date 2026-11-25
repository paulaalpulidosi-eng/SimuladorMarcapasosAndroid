package com.simulador.marcapasos;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ParametrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametros);

        Spinner spinnerModo = findViewById(R.id.spinnerModo);
        EditText etFrecuencia = findViewById(R.id.etFrecuencia);
        EditText etAmplitud = findViewById(R.id.etAmplitud);
        EditText etSensibilidad = findViewById(R.id.etSensibilidad);

        Button btnGuardar = findViewById(R.id.btnGuardarParametros);
        Button btnVolver = findViewById(R.id.btnVolverParametros);

        String[] modos = {"VVI", "AAI", "DDD"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                modos
        );

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        spinnerModo.setAdapter(adapter);

        btnGuardar.setOnClickListener(v -> {

            String frecuencia = etFrecuencia.getText().toString();
            String amplitud = etAmplitud.getText().toString();
            String sensibilidad = etSensibilidad.getText().toString();

            if (frecuencia.isEmpty() || amplitud.isEmpty() || sensibilidad.isEmpty()) {
                Toast.makeText(this, "Completa todos los parámetros", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Parámetros guardados correctamente", Toast.LENGTH_LONG).show();
            }
        });

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ParametrosActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
