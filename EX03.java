package TP2;
import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier N: ");
        int n=sc.nextInt();
        double S=0.0;
        for(int i=1;i<=n;i++){
            S+=1.0/i;
        }
        System.out.print("la somme des N premiers termes de la série harmonique : "+String.format("%.3f",S));
        sc.close();
    }

}
