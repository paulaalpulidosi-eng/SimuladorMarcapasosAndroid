package com.simulador.marcapasos;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AcercaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);

        Button btnVolver = findViewById(R.id.btnVolverAcerca);

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(AcercaActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
