package com.calcolatrice;

import java.util.Scanner;

public class Operazioni {
    private float a,b;
    private char k;

    /**
     * Costruttore com.calcolatrice.Operazioni
     * @param a numero 1 da salvare preso dalla tastira
     * @param b numero 2 da salvare preso dalla tastira
     * @param k operando da salvare preso dalla tastira
     */
    public Operazioni(float a, float b, char k){
        this.a = a;
        this.b = b;
        this.k = k;
    }
    public Operazioni(){
    }

    public void scelta() {
        float r = 0,c = 0;
        Scanner sc = new Scanner(System.in);
        switch (k) {
            case '+': System.out.println("\n " + a + " + " + b + " = " + (r = somma(a,b)));break;
            case '-': System.out.println("\n " + a + " - " + b + " = " + (r = sottrazione(a,b)));break;
            case '*': System.out.println("\n " + a + " * " + b + " = " + (r = moltiplicazione(a,b)));break;
            case '/': System.out.println("\n " + a + " / " + b + " = " + (r = divisione(a,b)));break;
            default: System.out.println("Uscita calcolatrice\n");
        }
        if(k == '*' || k == '+' || k == '-' || k == '/'){
            System.out.println("Inserisci altra operazione (o altro carattere per uscire) ed operando per proseguire:");
            k = sc.next().charAt(0);
            if(k == '*' || k == '+' || k == '-' || k == '/') {
                c = sc.nextFloat();
            }
            a = r;
            b = c;
            scelta();
        }
    }

    /**
     * Somma
     * @return risultato somma
     */
    public float somma(float a,float b){
        return a+b;
    }

    /**
     * Sottrazione
     * @return risultato sottrazione
     */
    public float sottrazione(float a,float b){
        return a-b;
    }

    /**
     * Moltiplicazione
     * @return risultato moltiplicazione
     */
    public float moltiplicazione(float a,float b){
        return a*b;
    }

    /**
     * Divisione
     * @return risultato divisione
     */
    public float divisione(float a,float b){
        return a/b;
    }
}
