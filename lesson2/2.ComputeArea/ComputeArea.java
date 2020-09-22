public class ComputeArea {
    public static void main(String[] args) {
    double radius;
    double area;
    
    // Step 1: Read in radius
    radius = 20; // radius is now 20

    // Step 2: Compute area
    area = radius * radius * 3.14159;
    
    // Step 3: Display the area
    // System.out.println("The area for the circle of radius " +
    //     radius + " is " + area);
    
    System.out.printf("The area for the circle of radius %f is %.2f %n", radius, area);
    }
    //Demonstrate limiting the number of digits after decimal points
}

//Comments with Steps in this programs is an example of an algorithm