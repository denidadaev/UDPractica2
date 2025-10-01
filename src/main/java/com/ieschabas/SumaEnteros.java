package com.ieschabas;

import java.util.Scanner;

public class SumaEnteros {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir el primer número
        System.out.println("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedir el segundo número
        System.out.println("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcular la suma
        int  suma = numero1 + numero2;

        // Mostrar la suma en el formato solicitado
        System.out.println(numero1 + " + " + numero2 + " = " + suma);

        // Cerrar el Scanner
        scanner.close();
    }
}