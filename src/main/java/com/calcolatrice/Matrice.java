package com.calcolatrice;

import java.util.Random;

public class Matrice {

    private int[][] matrix;
    private int bound = 30;
    Random rm = new Random();

    /**
     * Costruttore com.calcolatrice.Matrice
     * @param matrice carico la matrice con le dimensioni definite
     */
    public Matrice(int[][] matrice){
        this.matrix = matrice;
    }

    public void carica(){
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[1].length;j++){
                matrix[i][j] = rm.nextInt(bound);
            }
        }
    }

    /**
     * In questa carica si scegle il bound per il random
     * @param b bound per random
     */
    public void carica(int b){
        this.bound = b;
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[1].length;j++){
                matrix[i][j] = rm.nextInt(bound);
            }
        }
    }

    public void verticale(){
        System.out.println("\nSTAMPA VERTICALE:");
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){
                System.out.println("|" + (i+1) + "| |" + (j+1) + "| => " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void orizzontale(){
        System.out.println("\nSTAMPA ORIZONTALE:");
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){
                if (matrix[i][j] > 9)
                    System.out.print(" |" + matrix[i][j] + "| ");
                if (matrix[i][j] <= 9)
                    System.out.print("  |" + matrix[i][j] + "| ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
