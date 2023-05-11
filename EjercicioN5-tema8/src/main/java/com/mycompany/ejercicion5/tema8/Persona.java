
package com.mycompany.ejercicion5.tema8;


public class Persona {


    private int edad;
    private String nombre;
    private int telefono;
    
    public void ContructorPersona(int edad, String nombre, int telefono){
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setTelefono(telefono);
    }
    
    
    
    
    
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
