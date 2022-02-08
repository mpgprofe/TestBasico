package com.example.testbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button sumar, restar;
EditText operador1, operador2;
TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumar = findViewById(R.id.buttonSuma);
        restar = findViewById(R.id.buttonResta);
        operador1 = findViewById(R.id.editTextOperador1);
        operador2 = findViewById(R.id.editTextOperador2);
        resultado = findViewById(R.id.textViewResultado);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones operaciones = new Operaciones();
                resultado.setText(operaciones.suma(operador1.getText().toString(), operador2.getText().toString()));
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones operaciones = new Operaciones();
                resultado.setText(operaciones.resta(operador1.getText().toString(), operador2.getText().toString()));
            }
        });

    }
}