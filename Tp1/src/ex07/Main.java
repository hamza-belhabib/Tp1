package ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille N : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        // remplissage
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }

        // recherche du max
        int max = tab[0];

        for (int i = 1; i < n; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        System.out.println("Le plus grand élément est : " + max);

        sc.close();
    }
}