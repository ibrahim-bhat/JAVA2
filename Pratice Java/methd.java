public class methd {
// Write a Java program that defines a method to calculate the factorial of a number. Call the method from the main method.
    int i , fact = 1;
    int number ;
    void array(int number) {
        for ( i=1; i<=number; i++){
            System.out.println(fact = fact * i );
        }
    } 
}

 class Innermethd {
        public static void main(String[] args) {
            methd fact = new methd();
            fact.array(5);
        }
    
}