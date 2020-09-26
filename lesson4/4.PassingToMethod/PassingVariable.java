public class PassingVariable {
    
    public static void increaseInteger(int number) {
        number++;
    }
    public static void main(String[] args){
        int number1 = 10;

        System.out.println(number1);

        increaseInteger(number1);

        System.out.println(number1);


    }
}
