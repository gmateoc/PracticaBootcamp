package com.mycompany.practicabootcamp;

/*
Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual 
* o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
*/

public class ForBucle {
    public static void main(String[] args) {
        int numeroFor=0;
        for(int i=0;i<=3;i++){
            System.out.println(numeroFor);
            numeroFor++;
        }
    }
}
