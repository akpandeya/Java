public class RandomInitialization {
    public static void main(String[] args) {

        double[] myList = new double[100];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
            }
    }
    
}
