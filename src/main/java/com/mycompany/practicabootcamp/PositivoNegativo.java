package com.mycompany.practicabootcamp;

/*
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */

public class PositivoNegativo {
    public static void main(String[] args) {
        int numeroif=-5;
        if(numeroif>0){
            System.out.println("Es positivo");
        } else if(numeroif<0){
            System.out.println("Es negativo");
        } else{
            System.out.println("Es cero");
        }
    }
}
