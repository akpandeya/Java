public class DisplayingArray {
    public static void main(String[] args){
        //1. Wrong way to display array

        //Array Initializer
        int[] anArray = {10, 50, -5, 4};
        System.out.println(anArray); //This does not work

        //Right way to display array
        // System.out.print("{" + anArray[0]);

        // for (int i = 1; i < anArray.length; i++) {
        //     System.out.printf(", %d",  anArray[i]);
        // }
        // System.out.println("}");

        //For Each Loop
        for (int i: anArray) {
            System.out.println(i);
        }
       


    }
    
}
