package com.mycompany.main;


public class Cliente extends Persona{
    
    private int credito;
    
    
    public void personaConstructor(int credito, int edad, String nombre, int telefono){
        this.setCredito(credito);
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setTelefono(telefono);
        
        
    }
    
    
    public int getCredito() {
        return credito;
    }
    
    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
    
}
