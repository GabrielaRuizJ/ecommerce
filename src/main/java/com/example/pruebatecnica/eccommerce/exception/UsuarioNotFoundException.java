package com.example.pruebatecnica.eccommerce.exception;

public class UsuarioNotFoundException extends Exception{
    public UsuarioNotFoundException(){
        super("El usuario no existe en la base de datos");
    }
    public UsuarioNotFoundException(String mensaje){
        super (mensaje);
    }
}
