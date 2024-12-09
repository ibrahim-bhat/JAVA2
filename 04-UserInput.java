
import java.util.Scanner;


class UserInput {
    public static void main(String[] args) {

        System.out.println("Getting input from user");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        // int a = sc.nextInt(); //for integer
        float a = sc.nextFloat(); //for decimal num

        System.out.println("Enter a second number");
        // int b  = sc.nextInt();
        float b = sc.nextFloat();

        float sum = a + b ;

        System.out.println("The sum is ");
        System.out.println(sum);

        System.out.println("enter something to check next and next line");
        //trying next (it only prints on word to space)
        String str = sc.next();
        System.out.println(str);

        //next line (it prints full words )
        // String str2 = sc.nextLine();
        // System.out.println(str2);
        
    }
}
