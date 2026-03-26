package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab = new int[10];

        // remplissage
        for (int i = 0; i < 10; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }

        // recherche
        System.out.print("Entrez le nombre à rechercher : ");
        int x = sc.nextInt();

        boolean trouve = false;

        for (int i = 0; i < 10; i++) {
            if (tab[i] == x) {
                System.out.println("Trouvé à la position : " + i);
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("Nombre non trouvé");
        }

        sc.close();
    }
}