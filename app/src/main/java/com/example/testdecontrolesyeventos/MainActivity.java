package com.example.testdecontrolesyeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private EditText editNombre;
    private Button btnSaludar;
    private ToggleButton btnEstados;
    private TextView txtEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editNombre = (EditText) findViewById(R.id.editNombre);
        this.btnSaludar = (Button) findViewById(R.id.btnSaludar);
        this.btnEstados = (ToggleButton) findViewById(R.id.btnEstados);
        this.txtEstados = (TextView) findViewById(R.id.txtEstados);

        btnEstados.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    txtEstados.setText("El botón Estados está activado");
                } else {
                    txtEstados.setText("El botón Estados NO está activado");
                }
            }
        });

        // Evento Click para Botón Saludar
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editNombre.getText().toString();
                Toast.makeText(getApplicationContext(),
                            "Hola " + nombre,
                                Toast.LENGTH_LONG).show();

            }
        });

/*        Toast.makeText(
                getApplicationContext(),
                "Esto es una tostada",
                Toast.LENGTH_LONG)
                .show();*/


    }
}
