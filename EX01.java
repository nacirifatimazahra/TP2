package TP2;
import java.util.Scanner;
//Boucle while
public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez N nombres entiers ");
        int N=sc.nextInt();
        int S=0,P=1;
        int i=0;
        while (i<N){
            System.out.println("Entrez un nombre entier: ");
            int x=sc.nextInt();
            S+=x;
            P*=x;
            i++;
        }
        double M=(double)S/N;
        System.out.println("Somme : " +S);
        System.out.println("Produit : " +P);
        System.out.println("Moyenne : " +M);
        sc.close();
    }
}
 //on utilise la boucle do while
/*public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez N nombres entiers ");
        int N=sc.nextInt();
        int S=0,P=1;
        int i=0;
        do{
            System.out.println("Entrez un nombre entier: ");
            int x=sc.nextInt();
            S+=x;
            P*=x;
            i++;
        }while (i<N);
        double M=(double)S/N;
        System.out.println("Somme : " +S);
        System.out.println("Produit : " +P);
        System.out.println("Moyenne : " +M);
        sc.close();
    }
}*/
/*public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez N nombres entiers ");
        int N=sc.nextInt();
        int S=0,P=1;
        for(int i=0;i<N;i++){
            System.out.println("Entrez un nombre entier: ");
            int x=sc.nextInt();
            S+=x;
            P*=x;
        }
        double M=(double)S/N;
        System.out.println("Somme : " +S);
        System.out.println("Produit : " +P);
        System.out.println("Moyenne : " +M);
        sc.close();
    }
}*/