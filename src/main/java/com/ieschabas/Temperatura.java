package com.ieschabas;

    import java.util.Scanner;

    public class Temperatura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce la temperatura en Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            double kelvin = celsius + 273.15;

            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.println("Kelvin: " + kelvin);

            scanner.close();

        }
    }
