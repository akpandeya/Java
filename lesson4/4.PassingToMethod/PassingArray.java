public class PassingArray {
    
    public static void increaseArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = 2*array[i];
        }

        // for(int i: array) {
        //     i = i*2;
        // }
    }

    public static void displayArray(int[] array) {
        System.out.printf("{%d", array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.printf(", %d", array[i]);
        }
        System.out.print("}\n");
    }

    public static void main(String[] args){
        int[] myList = {1,2,3};

        displayArray(myList);

        increaseArray(myList);

        displayArray(myList);


    }
}
