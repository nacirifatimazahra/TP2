package TP2;
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier N: ");
        int N=sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // passer à la ligne après chaque ligne d'étoiles
        }
        sc.close();

    }
}
