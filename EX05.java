package TP2;
import java.util.Scanner;
public class EX05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier N: ");
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("La factorielle n'est définie que pour les nombres positifs.");
        } else {
            long factorielleW = 1,factorielleF=1;
            int j=1;
            while (j <= N) {
                factorielleW *= j;
                j++;
            }
            for (int i = 1; i <= N; i++) {
                factorielleF *= i;
            }
            System.out.println("La factorielle avec while de " + N + "! est : " + factorielleW);
            System.out.println("La factorielle avec for de " + N + "! est : " + factorielleF);
        }
        sc.close();

    }
}
