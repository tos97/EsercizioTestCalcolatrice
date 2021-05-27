import java.math.BigInteger;

public class Fattoriale {
    private int n;
    private BigInteger s;

    /**
     * Costruttore Fattoriale
     * @param n numero da fattoriazzare
     */
    public Fattoriale(int n){
        this.n = n;
        this.s = BigInteger.ONE;
    }

    public Fattoriale(){
        this.s = BigInteger.ONE;
    }

    public void stampa(){
        if(n < 0)
            System.out.println("ERRORE\nN negativo\n");
        else {
            System.out.println(calcola(n) +"\n");
        }
    }

    public BigInteger calcola(int n){
        if (n == 1 || n == 0)
            return s;
        else {
            s = s.multiply(BigInteger.valueOf(n));
            n--;
            calcola(n);
        }
        return s;
    }
}
