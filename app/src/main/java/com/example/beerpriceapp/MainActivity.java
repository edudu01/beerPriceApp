package com.example.beerpriceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText getTxtLata;
    private EditText getTxtLatao;
    private EditText getTxt600;
    private EditText getTxtLitro;
    private TextView showResult;
    private Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTxtLata = findViewById(R.id.editTextLataID);
        getTxtLatao = findViewById(R.id.editTextLataoId);
        getTxt600 = findViewById(R.id.editText600Id);
        getTxtLitro = findViewById(R.id.editTextLitroId);
        showResult = findViewById(R.id.textView6);
        btnCalc = findViewById(R.id.btnCalcularId);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double lata = Double.parseDouble(getTxtLata.getText().toString());
                double latao = Double.parseDouble(getTxtLatao.getText().toString());
                double garrafa600 = Double.parseDouble(getTxt600.getText().toString());
                double litro = Double.parseDouble(getTxtLitro.getText().toString());

                double valormlgarrafa = (600/garrafa600);
                double valormllitrao = (1000/litro);
                double valormllata = (350/lata);
                double valormllatao = (473/latao);

                if(valormlgarrafa>valormllitrao&&valormlgarrafa>valormllata&&valormlgarrafa>valormllatao){
                    Toast.makeText(getApplicationContext(), "Compra Garrafa",Toast.LENGTH_LONG).show();
                }
                if(valormllata>valormlgarrafa&&valormllata>valormllatao&&valormllata>valormllitrao){
                    Toast.makeText(getApplicationContext(), "Compra Lata",Toast.LENGTH_LONG).show();
                }
                if(valormllatao>valormllata&&valormllatao>valormlgarrafa&&valormllatao>valormllitrao){
                    Toast.makeText(getApplicationContext(), "Compra Latao",Toast.LENGTH_LONG).show();
                }
                if(valormllitrao>valormlgarrafa&&valormllitrao>valormllata&&valormllitrao>valormllatao){
                    Toast.makeText(getApplicationContext(), "Compra Litrão",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
