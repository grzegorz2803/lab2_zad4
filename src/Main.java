public class Main {
    public static void main(String[] args) {
        ONPCalculator onp = new ONPCalculator();
        String expr = "2 * 3 - (18 - 4) / 2 + 2^3=";
        int result =onp.ONPResult(expr);
        System.out.println("Wynik = "+result);
    }
}