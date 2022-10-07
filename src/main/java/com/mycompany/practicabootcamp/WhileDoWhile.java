package com.mycompany.practicabootcamp;

/*
Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.
Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual 
* o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo 
* del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá
* que poner un default para cuando el valor de la variable no sea una estación.
*/

public class WhileDoWhile {
    public static void main(String[] args) {
        int numeroWhile=0;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile=numeroWhile+1;
        }
        
        System.out.println("Acá hay una separación");
        
        do{
            System.out.println(numeroWhile);
            numeroWhile=numeroWhile+1;
        }while(numeroWhile<3);
    }
}
