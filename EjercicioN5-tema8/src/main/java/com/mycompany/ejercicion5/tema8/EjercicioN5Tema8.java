
package com.mycompany.ejercicion5.tema8;

public class EjercicioN5Tema8 {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        persona1.ContructorPersona(15, "juan", 239123829);
        
        System.out.println("La edad es:" + persona1.getEdad());
        System.out.println("El nombre es:" + persona1.getNombre());
        System.out.println("El telefono es:" + persona1.getTelefono());
        
    }
}
