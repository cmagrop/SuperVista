package com.example.supervista.modelo;

public class UsuarioModel {

    //atributos
    public String nombres,apellidos,email,usuario;
    private String rut,password;

//Get y Set

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //metodos

    public void registrarUsuario() //entrar metodo

    {
        //Agregar a un usuario a la base de datos->insert into

    }
//salida tener sobre un metodo
    public void eliminarUsuario()
    {

        //Eliminar a un usuario en la Base de Datos->delete ....

    }

    public void actualizarUsuario()
    {
        //Actualizar a un usuario en la Base de Datos->update

    }





}
