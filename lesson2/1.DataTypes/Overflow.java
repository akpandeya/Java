public class Overflow {

    public static void main(String[] args) {
        byte byte1= 127;

        System.out.println("Byte: " + byte1);

        byte1++;
        // byte1--;

        System.out.println("Byte: " + byte1);
    }
    
}
