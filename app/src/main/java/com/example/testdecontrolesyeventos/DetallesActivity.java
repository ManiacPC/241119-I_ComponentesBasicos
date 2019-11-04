package com.example.testdecontrolesyeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetallesActivity extends AppCompatActivity {
    private TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        this.txtMensaje = (TextView) findViewById(R.id.txtMensaje);

        // Para recibir datos primitivos desde la actividad anterior
        // (string, integer, boolean, etc.)
        Bundle conjuntoParametros = getIntent().getExtras();

        String mensaje = conjuntoParametros.getString("mensaje");

        txtMensaje.setText(mensaje);

        String otroMensaje = conjuntoParametros.getString("otroMensaje");
        Toast.makeText(getApplicationContext(),
                otroMensaje,
                Toast.LENGTH_LONG).show();
    }
}
