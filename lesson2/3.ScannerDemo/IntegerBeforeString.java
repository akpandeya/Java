import java.util.Scanner;

public class IntegerBeforeString {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("What is your name? ");
        // String name = input.nextLine();
        // System.out.print("What is your age? ");
        // int age = input.nextInt();
        // System.out.printf("Hello %s, age %d\n", name, age);

        System.out.println("What is your age? ");
        int age = input.nextInt();
        input.nextLine();
      
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.printf("Hello %s, age %d.\n", name, age);
    }
}






















 