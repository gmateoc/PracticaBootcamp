package com.mycompany.practicabootcamp;

/*
Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo 
* del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá
* que poner un default para cuando el valor de la variable no sea una estación.
*/

public class SwitchExample {
    public static void main(String[] args){
        String estacion="OTOÑO";
        switch(estacion){
            case "PRIMAVERA":
                System.out.println("La estación escogida es primavera");
            break;
            case "VERANO":
                System.out.println("La estación escogida es verano");
            break;
            case "OTOÑO":
                System.out.println("La estación escogida es otoño");
            break;
            case "INVIERNO":
                System.out.println("La estación escogida es invierno");
            break;
        }
    }
}