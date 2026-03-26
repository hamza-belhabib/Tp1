package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez N : ");
        int n = sc.nextInt();

        int i = 1;
        int somme = 0;

        while (i <= n) {
            somme = somme + i;
            i++;
        }

        System.out.println("La somme = " + somme);

        sc.close();
    }
}