package com.example.supervista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void accederRegistrar(View v2)
    {
        Intent acceder_registro = new Intent(this, RegistrarUsuarioActivity.class);
        startActivity(acceder_registro);
        //Toast.makeText(getApplicationContext(),"Acceder Registrar",Toast.LENGTH_LONG).show();

    }

    public void accederRecuperar(View v3)
    {
        Intent acceder_recuperacion= new Intent(this, RecuperarPasswordActivity.class);
        startActivity(acceder_recuperacion);
    }
}
