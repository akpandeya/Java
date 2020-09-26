public class DoubleForCurrency {
    public static void main(String[] args) {
        double total = 0.01; // 1 cent
        for (int i = 0; i < 100; i++) { // Adding 1 cent a hundred times
            total += 0.01;
        }
        System.out.println("total = " + total); //Is the output 1 Dollar?
    }
}