 class array {
    // Implement a program to find the maximum and minimum values in an array of integers.
    public static void main(String[] args) {
        int i;
        int[] myArray = {1 ,2 ,3,4};
        int max = myArray[0];
        int min = myArray[0];

        for ( i=0; i< myArray.length ; i++ ){
            if (myArray[i] > max) {
                max = myArray[i];
                }
                if (myArray[i] < min) {
                    min = myArray[i];
                    }
        }
        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Maximum value in the array is: " + min);


    }
}
