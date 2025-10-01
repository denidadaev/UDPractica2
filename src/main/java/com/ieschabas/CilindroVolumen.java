package com.ieschabas;

import java.util.Scanner;

public class CilindroVolumen {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el radio: ");
            double radio = scanner.nextDouble();

            System.out.print("Introduce la altura: ");
            double altura = scanner.nextDouble();

            double volumen = Math.PI * Math.pow(radio, 2) * altura;
            System.out.println("Volumen: " + volumen);

            scanner.close();
        }
    }
