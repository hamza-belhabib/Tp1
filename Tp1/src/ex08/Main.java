package ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        // remplissage
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Entrez l'élément [" + i + "][" + j + "] : ");
                mat[i][j] = sc.nextInt();
            }
        }

        // affichage
        System.out.println("La matrice est :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // saut de ligne
        }

        sc.close();
    }
}