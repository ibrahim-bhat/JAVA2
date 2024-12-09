
//program to calculate the percentage of a given students . Marks of 5 subjects must be taken as input from the user (Marks are out of 100)

import java.util.Scanner;

class perCalc {
    public static void main(String[] args) {
        System.out.println("Give the marks of 5 subject so Calucate the percentage");
        Scanner sr = new Scanner(System.in);

        System.out.println("subj 1");
        float s1 = sr.nextFloat();

        System.out.println("subj 2");
        float s2 = sr.nextFloat();

        System.out.println("subj 3");
        float s3 = sr.nextFloat();

        System.out.println("subj 4");
        float s4 = sr.nextFloat();

        System.out.println("subj 5");
        float s5 = sr.nextFloat();

        int totalMarks = 100;

        float marks = s1 + s2 + s3 + s4 + s5 ;

        float result = marks / totalMarks *100 ;

        System.out.println("Total Marks is" + marks);
        System.out.println("\nPercentage is" + result);
    }
}
