package com.simulador.marcapasos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SimulacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulacion);

        Button btnBradicardia = findViewById(R.id.btnBradicardia);
        Toast.makeText(this, "PANTALLA DE SIMULACIÓN CARGADA", Toast.LENGTH_LONG).show();
        Button btnAsistolia = findViewById(R.id.btnAsistolia);
        Button btnSalir = findViewById(R.id.btnSalir);

        btnBradicardia.setOnClickListener(v ->
                Toast.makeText(getApplicationContext(),
                        "BRADICARDIA FUNCIONA",
                        Toast.LENGTH_LONG).show()
        );

        btnAsistolia.setOnClickListener(v ->
                Toast.makeText(getApplicationContext(),
                        "ASISTOLIA FUNCIONA",
                        Toast.LENGTH_LONG).show()
        );

        btnSalir.setOnClickListener(v -> finish());
    }
}
