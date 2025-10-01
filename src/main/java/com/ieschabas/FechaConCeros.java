package com.ieschabas;

    import java.util.Scanner;

    public class FechaConCeros {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            //Introduzco el dia
            System.out.print("Introduce el día: ");
            int dia = scanner.nextInt();

            //Introduzco el mes
            System.out.print("Introduce el mes: ");
            int mes = scanner.nextInt();

            //Introduzco el año
            System.out.print("Introduce el año: ");
            int año = scanner.nextInt();

            //Los saco en la consola con guiones
            System.out.println("Fecha: " + año + "-" + mes + "-" + dia);

            scanner.close();

    }
}
