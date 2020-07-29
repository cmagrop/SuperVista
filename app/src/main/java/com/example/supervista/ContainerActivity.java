package com.example.supervista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//
        setContentView(R.layout.activity_container);
        PersonalFragment personalfragment = new PersonalFragment();
        CreditFragment creditfragment = new CreditFragment();
        FriendFragment friendfragment = new FriendFragment();



        if(savedInstanceState==null)
        {
           getSupportFragmentManager().beginTransaction().replace(R.id.container,personalfragment)
                   .commit();

        }

        //Declarar un objeto BottomNavigationView para decir que PersonalFragment será la selección por defecto


        BottomNavigationView bottombar=findViewById(R.id.bottombar);
        bottombar.setSelectedItemId(R.id.datos_personales);


    }


}