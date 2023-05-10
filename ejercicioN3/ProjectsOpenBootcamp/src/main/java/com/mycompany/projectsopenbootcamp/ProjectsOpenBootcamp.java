package com.mycompany.projectsopenbootcamp;

public class ProjectsOpenBootcamp extends coche{

    public static void main(String[] args){
        int resultado;
        resultado = suma(10, 20, 40);
        
        System.out.println(resultado);
        
        coche puertas1 = new coche();
        puertas1.sumarPuertas(10);
        
    }
        public static int suma(int a, int b, int c){
            int resultado;
            resultado = a + b + c;
            return resultado;
        }
}
