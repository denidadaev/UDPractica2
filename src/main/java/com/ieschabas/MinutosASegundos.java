package com.ieschabas;

import java.util.Scanner;

public class MinutosASegundos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce los minutos de la primera canción: ");
            int minutes1 = scanner.nextInt();

            System.out.print("Introduce los segundos de la primera canción: ");
            int seconds1 = scanner.nextInt();

            System.out.print("Introduce los minutos de la segunda canción: ");
            int minutes2 = scanner.nextInt();

            System.out.print("Introduce los segundos de la segunda canción: ");
            int seconds2 = scanner.nextInt();

            int totalSeconds = (minutes1 * 60 + seconds1) + (minutes2 * 60 + seconds2);
            int totalMinutes = totalSeconds / 60;
            int remainingSeconds = totalSeconds % 60;

            System.out.printf("Duración total: %d:%02d\n", totalMinutes, remainingSeconds);

            scanner.close();
        }
}

