package com.ieschabas;

import java.util.Scanner;

public class CilindroVolumen {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Creo el radio del cilindro
            System.out.print("Introduce el radio: ");
            double radio = scanner.nextDouble();

            //Introduzco la altura del cilindro
            System.out.print("Introduce la altura: ");
            double altura = scanner.nextDouble();

            //Calculo el volumen segun la formula
            double volumen = Math.PI * Math.pow(radio, 2) * altura;
            System.out.println("Volumen: " + volumen);

            scanner.close();
        }
    }
