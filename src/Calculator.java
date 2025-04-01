public class Calculator {
   protected double rezultat;

    public Calculator() {
        this.rezultat = 0;
    }

    public Calculator(double x) {
        this.rezultat = x;
    }
    public void adunare(double x) {
        rezultat += x;
    }

    public void scadere(double x) {
        rezultat -= x;
    }

    public void inmultire(double x) {
        rezultat *= x;
    }

    public void impartire(double x) {
        if(x==0){
            throw new RuntimeException("Impartire!!!");
        }
        rezultat /= x;
    }

    public double getRezultatul() {
        return rezultat;
    }
}
