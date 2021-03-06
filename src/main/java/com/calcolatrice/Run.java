package com.calcolatrice;

import java.util.Scanner;

public class Run {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        Menu M = new Menu();
        int n;
        do {
            System.out.println("MENU\n 0) Uscita\n 1) Matrici\n 2) com.calcolatrice.Piramide\n 3) com.calcolatrice.Operazioni\n 4) com.calcolatrice.Fattoriale\n 5) Controllo se N è Primo\n 6) com.calcolatrice.Fibonacci");
            n = sc.nextInt();
            System.out.println();
            switch (n){
                case 0: System.out.println("Fine Esercizio"); break;
                case 1: M.gestoreMatrice(); break;
                case 2: M.gestorePiramide(); break;
                case 3: M.gestoreOperazioni(); break;
                case 4: M.gestoreFattoriale(); break;
                case 5: M.gestoreNPrimo(); break;
                case 6: M.gestoreFibonacci(); break;
                default: System.out.println("errore inserire un numero tra 0 a 6");
            }
        } while(n != 0);
    }
}
