package com.ieschabas;

import java.util.Scanner;

public class EcoGuiones {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir una palabra al usuario
        System.out.println("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        // Mostrar la palabra tres veces separadas por guiones
        System.out.println(palabra + "-" + palabra + "-" + palabra);

        // Cerrar el Scanner
        scanner.close();
    }
}