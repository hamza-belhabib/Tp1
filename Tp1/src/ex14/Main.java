package ex14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaîne : ");
        String texte = sc.nextLine();

        String inverse = "";

        // inversion
        for (int i = texte.length() - 1; i >= 0; i--) {
            inverse = inverse + texte.charAt(i);
        }

        // comparaison
        if (texte.equalsIgnoreCase(inverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Non palindrome");
        }

        sc.close();
    }
}