package TP2;
import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entier X: ");
        int X=sc.nextInt();
        System.out.print("Entrez nombre entier N: ");
        int N=sc.nextInt();
        int i=0;
        double M=1;
        while(i<N){
            M*=X;
            i++;
        }
        System.out.print("Les multiplications successives "+X+"^"+N+" de deux entiers naturels "+X+" et "+N+" est : "+M);
        sc.close();
    }
}
