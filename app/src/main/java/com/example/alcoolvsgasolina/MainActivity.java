package com.example.alcoolvsgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//recuperando dados
        editPrecoAlcool = findViewById(R.id.editTextAlcool);
        editPrecoGasolina = findViewById(R.id.editTextGasolina);
        textResultado = findViewById(R.id.textResultado);

    }

    public void calcularPreco(View view){
//vamos precisar converter o dado que  iremos receber do usuario de string para double.

        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        //vamos criar a variavel para conta.

        Double resultado = precoAlcool/precoGasolina;

        if(resultado >= 0.7) {

            textResultado.setText("Melhor utilizar gasolina");

        }
        else {

            textResultado.setText("Melhor utilizar Alcool");
        }



    }






}