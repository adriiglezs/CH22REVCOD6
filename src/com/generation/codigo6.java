package com.generation;

import java.util.Scanner;

public class codigo6 {
    public static void main(String[] args) {
        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }
        
        System.out.println("\n¿Que numeros quiere resaltar? ");
        System.out.print("(Presione: 1 = los multiplos de 5, o 2 = los multiplos de 7): ");
        
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        int multiplo = (opcion == 1) ? 5 : 7;

        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }
        
        scanner.close();
    }
}




