package com.example.pruebatecnica.eccommerce.exception;

public class UsuarioFoundException extends Exception{
    public UsuarioFoundException(){
        super("El usuario ya existe en la base de datos");
    }
    public UsuarioFoundException(String mensaje){
        super (mensaje);
    }
}
