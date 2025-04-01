public class Calculator {
   protected double rezultat;

    public Calculator() {
        this.rezultat = 0;
    }

    public Calculator(double x) {
        this.rezultat = x;
    }
    public Calculator adunare(double x) {
        rezultat += x;
        return this;
    }

    public Calculator scadere(double x) {
        rezultat -= x;
        return this;
    }

    public Calculator inmultire(double x) {
        rezultat *= x;
        return this;
    }

    public Calculator impartire(double x) {
        if(x==0){
            throw new RuntimeException("Impartire!!!");
        }
        rezultat /= x;
        return this;
    }

    public double getRezultatul() {
        return rezultat;
    }
}
