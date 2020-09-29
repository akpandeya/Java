public class PassingVariable {
    
    public static int increaseInteger(int number) {
        return ++number;
    }
    public static void main(String[] args){
        int number1 = 10;

        System.out.println(number1); // 10

        number1 = increaseInteger(number1); 

        System.out.println(number1); // 11


    }
}
