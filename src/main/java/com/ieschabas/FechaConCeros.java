package com.ieschabas;

    import java.util.Scanner;

    public class FechaConCeros {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el día: ");
            int dia = scanner.nextInt();

            System.out.print("Introduce el mes: ");
            int mes = scanner.nextInt();

            System.out.print("Introduce el año: ");
            int año = scanner.nextInt();

            System.out.println("Fecha: " + año + "-" + mes + "-" + dia);

            scanner.close();

    }
}
