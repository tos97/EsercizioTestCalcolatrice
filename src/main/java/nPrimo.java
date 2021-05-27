public class nPrimo {
    private int n,i = 2;

    /**
     * Costruttore che controlla se n è primo
     * @param n numoero da controllare
     */
    public nPrimo(int n){
        this.n = n;
    }

    public void stampa(){
            if (calcola(i))
                System.out.println("Numero primo\n");
            else{
                System.out.println("Numero non primo\n");
            }
    }

    public boolean calcola(int p){
        if (n == 1)
            return true;
        if (n%p == 0) {
            if (p > (n / 2)) {
                return true;
            }
            else {
                return false;
            }
        }
        else{
            if(p == 2){
                p++;
                return calcola(p);
            }
            else{
                p+=2;
                return calcola(p);
            }
        }
    }
}
