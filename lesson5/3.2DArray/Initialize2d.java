class Initialize2d {

    public static void main(String[] args) {
        int [][] intArray2d;

        intArray2d = new int [3][3];

        String[] student = {"Maksim", "Ilya", "Aadi"};

        String[] subject = {"Java", "PHP", "Oracle"};


        intArray2d[0][0] = 0;
        intArray2d[0][1] = 1;
        intArray2d[0][2] = 2;
        intArray2d[1][0] = 3;
        intArray2d[1][1] = 4;
        intArray2d[1][2] = 5;
        intArray2d[2][0] = 6;
        intArray2d[2][1] = 7;
        intArray2d[2][2] = 8;

        

        for (int i = 0; i < subject.length; i++) {
            System.out.printf("%s ", subject[i]);
        }

        System.out.println();


        for (int row = 0; row < intArray2d.length; row++) {
            for (int column = 0; column < intArray2d[row].length; column++) {
                if (column == 0) {
                    System.out.printf("%s",student[row]); //How to format it better
                }
                
                System.out.printf("%d", intArray2d[row][column]); //Formatting
                
            }
            System.out.println();
        } 
    }
}