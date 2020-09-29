import java.util.*;

public class multiplyDigits {

    static Scanner input = new Scanner(System.in);

    public static int multiplyDigitsWithConditions(int number) {

        int product = 1;

        if (number/10 == 0) {
            return number;
        }
        else if (number/10 > 0 && number/10 <10) {
            int digit1, digit2;

            digit1 = number % 10 ;
            digit2 = number / 10;
            

            return digit1*digit2;
        }

        else if (number/10 > 10 && number/10 <100) {
            
            int digit1, digit2, digit3, twoDigitNumber;

            digit1 = number % 10 ;

            twoDigitNumber = number /10;
            
            digit2 = twoDigitNumber % 10;
            

            digit3 = twoDigitNumber / 10;
            

            product = digit1*digit2*digit3; 
        }

        return product;
    }

    public static int multiplyDigitsRecursively(int number) {
        int product = 1;

        if (number/10 == 0) {
            return number;
        }
        else {
            int quotient, remainder;

            quotient = number / 10;
            remainder = number % 10;

            product = remainder * multiplyDigitsRecursively(quotient);
        }
        return product;
    }

    public static void main(String[] args) {

        int number, product;

        System.out.print("Enter a number between 0 and 1000: ");
        number = input.nextInt(); //How can we ensure that user actually inputs a number between 0 and 1000?

        // product = multiplyDigitsWithConditions(number);

        // System.out.printf("The product of digits is %d%n", product);

        product = multiplyDigitsRecursively(number);
        System.out.printf("The recursive product of digits is %d%n", product);

    }
    
}
