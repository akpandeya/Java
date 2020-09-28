class ArrayCopyDemo {
    public static void displayArray(int[] array) {
        System.out.printf("[%d", array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.printf(", %d", array[i]);
        }
        System.out.print("]\n");
    }
    public static void main(String[] args) {

        int[] myList1 = {1,2,3};
        displayArray(myList1);

        int[] myList2 = {4,5,6};  
        displayArray(myList2);

        System.out.print("--------------------------------------\n");
        myList1 = myList2;

        displayArray(myList1);
        displayArray(myList2);

        myList2[2] = 7;
        // System.out.print("--------------------------------------\n");

        // displayArray(myList1);
        // displayArray(myList2);


        // char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
		// 	    'i', 'n', 'a', 't', 'e', 'd' };
        // char[] copyTo = new char[7];

        // System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        // System.out.println(new String(copyTo));
    }
}
