package com.gashe.app_ordenstring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(getClass().getCanonicalName(), "Cargamos Aplicación");
        //Instanciamos y Creamos evento botón
        Button button = (Button)findViewById(R.id.buttonCambiaOrden);
        EscucharBoton escucharBoton = new EscucharBoton(this); // enviamos actividad MainActivity a EscucharBoton mediante this

        button.setOnClickListener(escucharBoton);


    }
}
