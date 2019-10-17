package com.example.testdecontrolesyeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText editNombre;
    private Button btnSaludar;
    private ToggleButton btnEstados;
    private TextView txtEstados;
    private CheckBox chkEjemplo;
    private TextView txtEjemploCheckbox;
    private RadioButton rbOpcion1;
    private RadioButton rbOpcion2;
    private TextView txtRadioOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editNombre = (EditText) findViewById(R.id.editNombre);
        this.btnSaludar = (Button) findViewById(R.id.btnSaludar);
        this.btnEstados = (ToggleButton) findViewById(R.id.btnEstados);
        this.txtEstados = (TextView) findViewById(R.id.txtEstados);
        this.chkEjemplo = (CheckBox) findViewById(R.id.chkEjemplo);
        this.txtEjemploCheckbox = (TextView) findViewById(R.id.txtEjemploCheckbox);
        this.rbOpcion1 = (RadioButton) findViewById(R.id.rbOpcion1);
        this.rbOpcion2 = (RadioButton) findViewById(R.id.rbOpcion2);
        this.txtRadioOpciones = (TextView) findViewById(R.id.txtRadioOpciones);

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
    }

    // Segunda forma para capturar un evento a través de un click
    // (y puede ser, también a través de otro tipo de evento)
    public void onCheckboxClicked(View view) // view <- chkEjemplo
    {
        //boolean isChecked = chkEjemplo.isChecked();
        boolean isChecked = ((CheckBox) view).isChecked();

        /* if(isChecked)
            txtEjemploCheckbox.setText("Está checkeado");
        else
            txtEjemploCheckbox.setText("No está checkeado"); */

        txtEjemploCheckbox.setText(isChecked ? "Está checkeado" : "No está checkeado");



    }

    public void onRadioClicked(View view)
    {
        boolean isChecked = ((RadioButton) view).isChecked();

        // Selección según el radio que llegó al método
        switch(view.getId()) {
            case R.id.rbOpcion1:
                if (isChecked) txtRadioOpciones.setText("Opción 1 elegida");
                break;
            case R.id.rbOpcion2:
                if (isChecked) txtRadioOpciones.setText("Opción 2 elegida");
                break;
        }
    }

    // private void onBtnSaludarClicked(View view) // view <- btnSaludar
}
