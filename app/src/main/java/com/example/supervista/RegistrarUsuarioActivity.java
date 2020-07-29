package com.example.supervista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.supervista.modelo.UsuarioModel;


public class RegistrarUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);
        showToolbar("Registrar Usuario",true);

    }


    public void showToolbar(String title, boolean upButton)
    {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public void poblar_objeto(View v) //camino entre vista y modelo

    {
        //declaración de variables

        EditText get_Rut,get_nombres,get_apellidos,get_email,get_user,get_password;
        String rut,nombres,apellidos,celectronico,user,password;
        //utilización de variables
        //se guardaron valores en varibles tipo EditText desde el formulario
        get_Rut=findViewById(R.id.RutReg);
        get_nombres=findViewById(R.id.NombreReg);
        get_apellidos=findViewById(R.id.ApeReg);
        get_email=findViewById(R.id.EmailReg);
        get_user=findViewById(R.id.UserReg);
        get_password=findViewById(R.id.PasswordReg);
        //convertir los tipos EditText a String e inicializaremos las variables
        rut= get_Rut.getText().toString();
        nombres=get_nombres.getText().toString();
        apellidos=get_apellidos.getText().toString();
        celectronico=get_email.getText().toString();
        user=get_user.getText().toString();
        password=get_password.getText().toString();
        // es aqui donde conecta el controlador con el modelo
        UsuarioModel user1 = new UsuarioModel();
        user1.setRut(rut);
        user1.nombres=nombres;
        user1.apellidos=apellidos;
        user1.email=celectronico;
        user1.usuario=user;
        user1.setPassword(password);

        


        Toast.makeText(getBaseContext(),"Variables Rut "+rut+ " nombres "+user1.nombres+" apellidos "+apellidos+ " Correo electrónico "+celectronico,Toast.LENGTH_LONG).show();



    }


}
