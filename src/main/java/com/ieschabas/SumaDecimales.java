package com.ieschabas;

import java.util.Scanner;

public class SumaDecimales {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir el primer número
        System.out.println("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        // Pedir el segundo número
        System.out.println("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular la suma
        double  suma = numero1 + numero2;

        // Mostrar la suma en el formato solicitado
        System.out.println(numero1 + " + " + numero2 + " = " + suma);

        // Cerrar el Scanner
        scanner.close();
    }
}
