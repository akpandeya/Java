import java.util.Scanner; 
public class ScannerDemo {
    // Java program to read data of various types using Scanner class.
	public static void main(String[] args) 
	{ 
		// Declare the object and initialize with 
		// predefined standard input object 
		Scanner input = new Scanner(System.in); 

        // String input 
        System.out.println("Enter name:");
		String name = input.nextLine(); 

        // Character input 
        System.out.println("Enter Gender:");
		char gender = input.next().charAt(0); 

		// Numerical data input 
		// byte, short and float can be read 
        // using similar-named functions. 
        System.out.println("Enter age:");
        int age = input.nextInt();
        
        System.out.println("Enter Mobile Number:");
        long mobileNo = input.nextLong();
        
        System.out.println("Enter your CPI:");
        double cpi = input.nextDouble();


        // Print the values to check if the input was correctly obtained.
        System.out.println("------------------------");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CPI: " + cpi); 
        System.out.println("------------------------"); 
	} 
}
