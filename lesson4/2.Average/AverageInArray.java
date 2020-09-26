import java.util.Scanner;

public class AverageInArray {
    
    static Scanner input = new Scanner(System.in);

    public static double getDouble() {

        double doubleValue;

        System.out.print("Marks: ");
        doubleValue = input.nextDouble();

        return doubleValue;

    }
    public static void main(String[] args) {

        double average, sum = 0;

        double[] subject; //Array declaration

        subject = new double[3]; //Array Creation, Size is Immutable

        for (int i = 0; i < 3; i++) {
            subject[i] = getDouble();
        }
        
        for (int i = 0; i < subject.length; i++) {

            sum += subject[i];
        }

        average = sum/subject.length ;
        

        System.out.printf("Average: %.2f%n", average);
    }
}
