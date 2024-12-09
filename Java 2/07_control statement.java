

 class controlStatement   {
    public static void main(String[] args) {
        // Control Statements in Java

        /*
         * What are Control Statements?
         * Control statements are used to control the flow of execution in a Java
         * program.
         * They allow us to make decisions, repeat actions, or execute specific code
         * blocks based on conditions.
         */

        /*
         * Types of Control Statements:
         * 1. Conditional Statements (if, if-else, if-else-if, switch)
         * 2. Looping Statements (for, while, do-while)
         * 3. Jump Statements (break, continue)
         */

        /*
         * 1. Conditional Statements
         * Conditional statements execute code based on certain conditions.
         */

        // if Statement: Executes code if a condition is true.
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult."); // Output: You are an adult.
        }

        // if-else Statement: Executes one block if true, another if false.
        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult."); // Output: You are an adult.
        }

        // if-else-if Ladder: Checks multiple conditions in sequence.
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B"); // Output: Grade B
        } else {
            System.out.println("Grade C");
        }

        // switch Statement: Executes one case out of multiple options based on value.
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // Output: Wednesday
                break;
            default:
                System.out.println("Other day");
        }

        /*
         * 2. Looping Statements
         * Looping statements repeat a block of code multiple times.
         */

        // for Loop: Repeats code a specific number of times.
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i); // Outputs Iteration 0 to Iteration 4
        }

        // while Loop: Repeats code while a condition is true.
        int count = 0;
        while (count < 3) {
            System.out.println("Count is " + count); // Outputs Count is 0 to Count is 2
            count++;
        }

        // do-while Loop: Executes code at least once, then repeats while condition is
        // true.
        int num = 0;
        do {
            System.out.println("Number is " + num); // Outputs Number is 0 to Number is 2
            num++;
        } while (num < 3);

        /*
         * 3. Jump Statements
         * Jump statements change the normal flow of control in loops or switch cases.
         */

        // break Statement: Exits the loop or switch case.
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
            }
            System.out.println("Break Example, i = " + i); // Outputs 0, 1, 2
        }

        // continue Statement: Skips the current iteration of the loop.
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // Skips when i is 2
            }
            System.out.println("Continue Example, i = " + i); // Outputs 0, 1, 3, 4
        }

    }
}
