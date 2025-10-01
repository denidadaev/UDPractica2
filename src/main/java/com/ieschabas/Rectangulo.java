package com.ieschabas;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura: ");
        double height = scanner.nextDouble();

        double area = base * height;
        double perimeter = 2 * (base + height);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimeter);

        scanner.close();
    }
}