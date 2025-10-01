package com.ieschabas;

import java.util.Scanner;

public class InicialesMayuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String apellido = scanner.nextLine();

        String initials = nombre.substring(0, 1).toUpperCase() + "." + apellido.substring(0, 1).toUpperCase() + ".";

        System.out.println("Iniciales: " + initials);

        scanner.close();
    }
}