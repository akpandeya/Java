import java.util.*;


public class ComputeAreaWithScanner {

    public static void main(String[] args) {

        //1. Declare an input object of Scanner type
        System.out.println("Enter the radius of the circle:");
        
        Scanner input = new Scanner(System.in);

        //2. Read the radius input from Console

        double radius = input.nextDouble();

        // Step 2: Compute area
        double area = radius * radius * 3.14159;
    
        // Step 3: Display the area
        System.out.println("---------------------------------------------------------");
        System.out.println("The area for the circle of radius " +
            radius + " is " + area);
        System.out.println("---------------------------------------------------------");



    }
    
}
