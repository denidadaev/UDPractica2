package com.ieschabas;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //creo la base del rectangulo
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();
        
        //Creo la altura del rectangulo
        System.out.print("Introduce la altura: ");
        double height = scanner.nextDouble();

        //calculo el area y le perimetro del rectangulo mediante sus formulas
        double area = base * height;
        double perimeter = 2 * (base + height);

        //las saco en la consola
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimeter);

        scanner.close();
    }
}
