package com.ieschabas;

    import java.util.Scanner;

    public class Temperatura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Creo los celcios
            System.out.print("Introduce la temperatura en Celsius: ");
            double celsius = scanner.nextDouble();
            
            //Creo los fahrenheit(multiplicando los celcios por 9 y divido por 5) y los kelvin(le sumo 273.15 a los fahrenheit)
            double fahrenheit = (celsius * 9 / 5) + 32;
            double kelvin = celsius + 273.15;

            //lo saco en la consola
            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.println("Kelvin: " + kelvin);

            scanner.close();

        }
    }
