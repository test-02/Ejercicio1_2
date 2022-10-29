package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class DatosActivity extends AppCompatActivity {

    EditText txtNombreR, txtApellidoR, txtEdadR, txtCorreoR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        txtNombreR = (EditText) findViewById(R.id.txtNombreR);
        txtNombreR.setEnabled(false);

        txtApellidoR = (EditText) findViewById(R.id.txtApellidoR);
        txtApellidoR.setEnabled(false);

        txtEdadR = (EditText) findViewById(R.id.txtEdadR);
        txtEdadR.setEnabled(false);

        txtCorreoR = (EditText) findViewById(R.id.txtCorreoR);
        txtCorreoR.setEnabled(false);


        txtNombreR.setText(getIntent().getExtras().getString("nombre"));
        txtApellidoR.setText(getIntent().getExtras().getString("apellido"));
        txtEdadR.setText(getIntent().getExtras().getString("edad"));
        txtCorreoR.setText(getIntent().getExtras().getString("correo"));

    }
}