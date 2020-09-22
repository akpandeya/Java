public class NumericLiterals {

    public static void main(String[] args) {
        String dash = "---------------------------------------";
        System.out.println(dash);
        System.out.println("Binary, Octal and Hexadecimal number");
        System.out.println("Binary 0B1111 is: " + 0B1111); // Displays 15
        System.out.println("Octal 07777 is: " + 07777); // Displays 4095
        System.out.println("Hexadecimal 0XFFFF is: " + 0XFFFF); // Displays 65535
        
        System.out.println(dash);

        //Underscore allowed between digits to improve readability
        long ssn = 232_45_4519;
        long creditCardNumber = 2324_4545_4519_3415L; //Underscore allowed to improve 
        System.out.println(ssn); // Displays 4095
        System.out.println(creditCardNumber); // Displays 65535

        System.out.println(dash);

        //Double is more accurate than float
        System.out.println("1.0 / 3.0 is " + 1.0 / 3.0);
        System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);

        System.out.println(dash);
    }
    
}
