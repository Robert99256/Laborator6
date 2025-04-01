public class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        super();
    }
    public AdvancedCalculator(double x) {
        super(x);
    }
    public void radical(){
        if(rezultat<0) {
            throw new RuntimeException("Radical!!!");
        }
        rezultat=Math.sqrt(rezultat);
    }
}
