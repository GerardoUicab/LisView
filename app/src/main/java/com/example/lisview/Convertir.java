package com.example.lisview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.lisview.R.id.txtResul;

public class Convertir extends AppCompatActivity {

    EditText   txtNumero, txtResul;
    Button btnPeso, btnDolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertir);


        txtNumero=(EditText)findViewById(R.id.txtNumero);
        txtResul=(EditText) findViewById(R.id.txtResul);
        btnPeso=(Button)findViewById(R.id.btnPeso);
        btnDolar=(Button) findViewById(R.id.btnDolar);

        btnPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Dolar=txtNumero.getText().toString();
                Double dolaritos= Double.parseDouble(Dolar);

                Double resulPeso= dolaritos * 19.13;
                String mandarResul= String.valueOf(resulPeso);
                txtResul.setText(mandarResul + " MNX");
            }
        });

        btnDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String peso=txtNumero.getText().toString();

                Double Pesitos=Double.parseDouble(peso);

                double resulDolar=(Pesitos * 1)/19.13;
                String mandarDolar=String.valueOf(resulDolar);
                txtResul.setText(mandarDolar + " USE");
            }
        });

    }
}
