class array {
    public static void main(String[] args) {
        // Arrays in Java

        /*
         * What is an Array?
         * An array is a collection of elements of the same data type stored in contiguous memory locations.
         * It allows us to store multiple values under a single variable name,
         * accessible by index.
         * Arrays in Java have a fixed size, which must be specified when the array is created.
         */

        /*
         * Why use Arrays?
         * Arrays allow us to store and manage large sets of related data efficiently.
         * We can access and manipulate elements using their index positions, which helps simplify code.
         */

        /*
         * Declaring and Initializing Arrays:
         * Syntax:
         * dataType[] arrayName = new dataType[size];
         * - dataType: The type of elements (e.g., int, double, String).
         * - arrayName: Name you choose for the array.
         * - size: Number of elements the array can hold.
         */

        int[] numbers = new int[5]; // Declares an integer array of size 5

        /*
         * We can also initialize an array with values at the time of declaration.
         * Syntax:
         * dataType[] arrayName = { value1, value2, ..., valueN };
         */
        int[] scores = { 90, 85, 78, 88, 76 }; // Integer array with initial values

        /*
         * Accessing Array Elements:
         * We access elements using the index, starting from 0 for the first element.
         */
        System.out.println("First score: " + scores[0]); // Output: 90

        /*
         * Modifying Array Elements:
         * We can assign new values to array elements using the index.
         */
        scores[2] = 95; // Changes the third element from 78 to 95
        System.out.println("Updated third score: " + scores[2]); // Output: 95

        /*
         * Looping Through an Array:
         * We often use a loop to iterate over array elements.
         */

        // Using a for loop
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + i + ": " + scores[i]);
        }

        // Using an enhanced for loop (simpler syntax for arrays)
        for (int score : scores) {
            System.out.println("Score: " + score);
        }

        /*
         * Multi-dimensional Arrays:
         * Java also supports arrays with multiple dimensions (e.g., 2D arrays).
         */
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Accessing elements in a 2D array
        System.out.println("Element at [0][1]: " + matrix[0][1]); // Output: 2

        // Looping through a 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }   
}
