
package com.mycompany.ejercicion4;

public class EjercicioN4 {
    
    public static void main(String[] args) {
        int numeroif = -4;
        
        
        if (numeroif >= 0) {
            if (numeroif > 0) {
                System.out.println("El numero es positivo");
            }
            if (numeroif == 0) {
                System.out.println("El numero es igual a 0");
            }
        } else{
            System.out.println("El numero es negativo");
        }
        
        System.out.println("Bucle While y do-while");
        
        int numerowhile = 0;
        while (numerowhile <= 3) {            
            System.out.println(numerowhile);
            numerowhile++;
        }
        do {            
            System.out.println("entramos en el do-while");
        } while (false);
        
        System.out.println("Bucle For");
        
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        
        System.out.println("Menu Switch");
        int estacion = 3;
        switch (estacion) {
            case 1 -> System.out.println("Estacion Verano");
            case 2 -> System.out.println("Estacion Otoño");
            case 3 -> System.out.println("Estacion Invierno");
            case 4 -> System.out.println("Estacion Primavera");
            default -> System.out.println("Error");
        }
    }
}
