package com.calcolatrice;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    int n;

    public Menu(){}

    public void gestoreNPrimo() {
        System.out.println("Numero da controllare:");
        n = sc.nextInt();
        nPrimo primo = new nPrimo(n);
        primo.stampa();
    }

    public void gestoreFibonacci() {
        System.out.println("Inserisci quanti numeri stampare:");
        n = sc.nextInt();
        Fibonacci f = new Fibonacci(n);
        f.stampa();
        System.out.println();
    }

    public void gestoreFattoriale() {
        System.out.println("Inserisci un numero:");
        n = sc.nextInt();
        Fattoriale f = new Fattoriale(n);
        System.out.print("\n" + n + "! = ");
        f.stampa();
    }

    public void gestoreOperazioni() {
        float a,b;
        char k;
        System.out.println("Scegli l'operazione da voler eseguire tra +,-,*,/ o altro carattere per uscire:\n");
        k = sc.next().charAt(0);
        if(k == '*' || k == '+' || k == '-' || k == '/'){
            System.out.println("Inserisci i 2 valori su cui lavorare:");
            a = sc.nextFloat();
            b = sc.nextFloat();
            Operazioni o = new Operazioni(a,b,k);
            o.scelta();
        }
    }

    public void gestoreMatrice(){
        int row,col,k,bound;
        System.out.println("Esercizio Matrici");
        System.out.println("Inserisci righe e colonne desiderate");
        row = sc.nextInt();
        col = sc.nextInt();
        Matrice m = new Matrice(new int[row][col]);
        System.out.println("\nScegli:\n 0) Casualità con scelta del valore per Random\n 1) Casualià con valore fisso");
        k = sc.nextInt();
        switch (k){
            case 0:
                System.out.println("\nInserisci valore di casualità");
                bound = sc.nextInt();
                m.carica(bound);
                break;
            case 1:
                m.carica();
                break;
            default:
                System.err.println("ERRORE\n");
        }
        if (k == 0 || k == 1) {
            System.out.println("\nScegli:\n 0) Stampa Verticale\n 1) Stampa Orizontale");
            n = sc.nextInt();
            switch (k) {
                case 0:
                    m.verticale();
                    break;
                case 1:
                    m.orizzontale();
                    break;
                default:
                    System.out.println("ERRORE");
            }
        }
    }

    public void gestorePiramide(){
        System.out.println("Esercizio com.calcolatrice.Piramide");
        System.out.println("Inserisci numero di righe da stampare:");
        n = sc.nextInt();
        Piramide p = new Piramide(n);
        p.stampa();
        System.out.println();
    }

}
