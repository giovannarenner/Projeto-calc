
package br.ulbra.com.appcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { 
EditText edtValor1, edtValor2;
Button btnSomar, btnSubtracao, btnMultiplicacao, btnDivisao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor1 = findViewById(R.id.edtV1);
        edtValor2 = findViewById(R.id.edtV2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtracao = findViewById(R.id.btnSubtracao);
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnDivisao = findViewById(R.id.btnDivisao);

       btnSomar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double valor1, valor2, soma;
               valor1 = Double.parseDouble(edtValor1.getText().toString());
               valor2 = Double.parseDouble(edtValor2.getText().toString());
               soma = valor1 + valor2;
               Toast.makeText(MainActivity.this,
                       "Soma: " + soma, Toast.LENGTH_LONG).show();
           }
           });
               btnSubtracao.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       double valor1, valor2, subtracao;
                       valor1 = Double.parseDouble(edtValor1.getText().toString());
                       valor2 = Double.parseDouble(edtValor2.getText().toString());
                       subtracao = valor1 - valor2;
                       Toast.makeText(MainActivity.this,
                               "Subtração: " + subtracao, Toast.LENGTH_LONG).show();
                   }
               });
        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, multiplicacao;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
             multiplicacao = valor1 * valor2;
                Toast.makeText(MainActivity.this,
                        "Multiplicação: " + multiplicacao, Toast.LENGTH_LONG).show();
            }
        });
        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, divisao;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                divisao = valor1 / valor2;
                Toast.makeText(MainActivity.this,
                        "Divisão: " + divisao, Toast.LENGTH_LONG).show();
            }
        });
           }
       }