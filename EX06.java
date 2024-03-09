package TP2;
import java.util.Scanner;
//programme qui teste si un nombre est premier ou pas
public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nbr = sc.nextInt();
        // Tester si le nombre est premier
        boolean estPremier = true;
        if (nbr <= 1) {
            estPremier = false;
        } else {
            for (int i = 2; i <= Math.sqrt(nbr); i++) {
                if (nbr%i == 0) {
                    estPremier = false;
                    break;
                }
            }
        }
        // Afficher le résultat
        if (estPremier) {
            System.out.println(nbr + " est un nombre premier.");
        } else {
            System.out.println(nbr + " n'est pas un nombre premier.");
        }
        sc.close();
    }
}
//programme qui teste tous les nombres entre 1 et N
/*public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Demander à l'utilisateur d'entrer un nombre N
        System.out.print("Entrez un nombre entier N : ");
        int N = sc.nextInt();
        // Tester tous les nombres entre 1 et N
        System.out.println("Nombres premiers entre 1 et " + N + " :");
        for (int i = 2; i <= N; i++) {
            boolean estPremier = true;
            if (i <= 1) {
                estPremier = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        estPremier = false;
                        break;
                    }
                }
            }
            // Afficher le nombre si c'est premier
            if (estPremier) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}*/