
package com.mycompany.projectsopenbootcamp;

public class coche {
    int NumeroDePuertas;
    public int sumarPuertas(int a){
        int num = 5;
        num += a;
        System.out.println(num);
        for (NumeroDePuertas = a; NumeroDePuertas <= num ; NumeroDePuertas++) {
            System.out.println(NumeroDePuertas);
        }
        return NumeroDePuertas;
    }
}
