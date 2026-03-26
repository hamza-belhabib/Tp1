package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille N : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        // remplissage du tableau
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }

        // affichage
        System.out.println("Les éléments du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.println(tab[i]);
        }

        sc.close();
    }
}