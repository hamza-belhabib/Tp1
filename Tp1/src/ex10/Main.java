package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int[][] trans = new int[3][3];

        // remplissage
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Entrez [" + i + "][" + j + "] : ");
                mat[i][j] = sc.nextInt();
            }
        }

        // calcul de la transposée
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trans[j][i] = mat[i][j];
            }
        }

        // affichage
        System.out.println("Matrice transposée :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}