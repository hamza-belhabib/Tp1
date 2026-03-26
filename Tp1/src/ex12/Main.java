package ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaîne : ");
        String texte = sc.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' || c == 'y') {
                count++;
            }
        }

        System.out.println("Nombre de voyelles : " + count);

        sc.close();
    }
}
