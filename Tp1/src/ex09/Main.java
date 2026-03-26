package ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int somme = 0;

        // remplissage + calcul de la somme
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Entrez l'élément [" + i + "][" + j + "] : ");
                mat[i][j] = sc.nextInt();
                somme = somme + mat[i][j];
            }
        }

        System.out.println("La somme des éléments = " + somme);

        sc.close();
    }
}