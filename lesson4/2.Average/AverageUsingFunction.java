import java.util.Scanner;

public class AverageUsingFunction {

    static Scanner input = new Scanner(System.in);

    public static double getDouble() {
        double doubleValue;

        System.out.print("Marks: ");
        doubleValue = input.nextDouble();

        return doubleValue;

    }
    public static void main(String[] args) {

        double subject1, subject2, subject3, average;
        
        subject1 = getDouble();

        subject2 = getDouble();

        subject3 = getDouble();

        average = (subject1 + subject2 + subject3);

        System.out.printf("Average: %.2f%n", average);

    }
    
}
