package com.mycompany.main;


public class Trabajador extends Persona{
    
    private int salario;

    public Trabajador(int salario, int edad, String nombre, int telefono) {
        this.salario = salario;
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setTelefono(telefono);
    }

    @Override
    public String toString() {
        return "Trabajador{" + "salario=" + salario + '}';
    }
    
    
            
            
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    
}
