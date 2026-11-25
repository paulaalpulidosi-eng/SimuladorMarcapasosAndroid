package com.simulador.marcapasos;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BibliotecaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);

        Button btnVolver = findViewById(R.id.btnVolverBiblioteca);

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(BibliotecaActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
