package ex11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaîne : ");
        String texte = sc.nextLine();

        int longueur = texte.length();

        System.out.println("La longueur est : " + longueur);

        sc.close();
    }
}