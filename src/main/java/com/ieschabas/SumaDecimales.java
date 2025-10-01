apackage com.ieschabas;

import java.util.Scanner;

public class SumaNotas {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir la primera nota
        System.out.println("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();

        // Pedir la segunda nota
        System.out.println("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();

        //Pedir la tercera nota
        System.out.println("Introduce la tercera nota: ");
        double nota3 = scanner.nextDouble();
        // Calcular la suma
        double  media = nota1 + nota2 + nota3;

        // Mostrar la suma en el formato solicitado
        System.out.println(nota1 + " + " + nota2 + "+" + nota3 + " = " + media);

        // Cerrar el Scanner
        scanner.close();
    }
}
