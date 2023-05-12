/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.personaConstructor(25, 15, "juan", 234534324);
        cliente1.toString();
        
        Trabajador trabajador1 = new Trabajador(203921, 15, "juan", 0234342134);        
        trabajador1.toString();
    }
}
