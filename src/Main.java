public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(7);


        c.adunare(5);
        c.scadere(2);
        c.inmultire(3);
        c.impartire(2);

        AdvancedCalculator C =new AdvancedCalculator(c.getRezultatul());
        C.radical();


        System.out.println("Rezultat final : " + c.getRezultatul() + " " + C.getRezultatul());
    }
}
