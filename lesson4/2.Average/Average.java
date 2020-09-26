import java.util.Scanner;
public class Average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double subject1, subject2, subject3, average;

        System.out.print("Marks: ");
        subject1 = input.nextDouble();

        System.out.print("Marks: ");
        subject2 = input.nextDouble();

        System.out.print("Marks: ");
        subject3 = input.nextDouble();

        average = (subject1 + subject2 + subject3)/3;

        System.out.printf("Average: %.2f%n", average);




    }
    
}
