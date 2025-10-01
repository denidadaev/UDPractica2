package com.ieschabas;
import java.util.Scanner;
public class EurosYcentimos {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un precio en euros: ");
            //Precio como un decimal obviamente
            double price = scanner.nextDouble();

            //Saco los euros del precio decimal y los centimos
            int euros = (int) price;
            int cents = (int) Math.round((price - euros) * 100);

            //Lo imprimo
            System.out.println("Euros: " + euros);
            System.out.println("Céntimos: " + cents);

            scanner.close();

    }
}
