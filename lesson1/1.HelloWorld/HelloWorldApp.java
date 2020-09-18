/**
 1. The HelloWorldApp class implements an application that simply prints "Hello World!" to standard output <br> <br>
 2. The first line defines a class. Every Java program must have at least one class. Each class has a name. By convention, class names start with an uppercase letter. In this example, the class name is HelloWorldApp. <br> <br>
 3. The second line defines the main method. The program is executed from the main method. A class may contain several methods. The main method is the entry point where the program begins execution. <br> <br>
 4. The main method in this program contains the System.out.println statement. This statement displays the string Hello World! <br> <br>
 5. Every statement in Java ends with a semicolon (;), known as the statement terminator. <br> <br>
 6. Reserved words, or keywords, have a specific meaning to the compiler and cannot be used for other purposes in the program. For example, when the compiler sees the word class, it understands that the word after class is the name for the class. Other reserved words in this program are public, static, and void. <br> <br>
*/

public class HelloWorldApp {
        public static void main(String[] args) {            // Order of public and static does not matter but this is the convention
        System.out.println("Hello World!");             // Display the string.
    }
}
