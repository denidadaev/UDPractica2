package com.ieschabas;

import java.util.Scanner;

public class InicialesMayuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introduzco el nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        //Introduzco el apellido
        System.out.print("Introduce tu primer apellido: ");
        String apellido = scanner.nextLine();

        //Saco las iniciales en mayuscula
        String initials = nombre.substring(0, 1).toUpperCase() + "." + apellido.substring(0, 1).toUpperCase() + ".";

        //Las saco en la consola
        System.out.println("Iniciales: " + initials);

        scanner.close();
    }
}
