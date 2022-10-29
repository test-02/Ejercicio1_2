package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtApellido, txtEdad, txtCorreo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtApellido = (EditText) findViewById(R.id.txtApellido);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DatosActivity.class);
                intent.putExtra("nombre", txtNombre.getText().toString());
                intent.putExtra("apellido", txtApellido.getText().toString());
                intent.putExtra("edad", txtEdad.getText().toString());
                intent.putExtra("correo", txtCorreo.getText().toString());

                startActivity(intent);
            }
        });
    }
}