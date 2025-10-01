package com.ieschabas;

import java.util.Scanner;

public class MinutosASegundos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Introduzco los minutos de la primera canción    
            System.out.print("Introduce los minutos de la primera canción: ");
            int minutos1 = scanner.nextInt();

            //Segundos de la primera cancion    
            System.out.print("Introduce los segundos de la primera canción: ");
            int segundos1 = scanner.nextInt();

            //Minutos de la segunda cancion
            System.out.print("Introduce los minutos de la segunda canción: ");
            int minutos2 = scanner.nextInt();

            //Segundos de la segunda cancion    
            System.out.print("Introduce los segundos de la segunda canción: ");
            int segundos2 = scanner.nextInt();

            //Traduzco los segundos en minutos y le pongo el resto de segundos a través del módulo    
            int totalSegundos = (minutos1 * 60 + segundos1) + (minutos2 * 60 + segundos2);
            int totalMinutos = totalSegundos / 60;
            int ElrestodeSegundos = totalSegundos % 60;

            System.out.println("Duración total: " + totalMinutos + ":" + ElrestodeSegundos);

            scanner.close();
        }
}
