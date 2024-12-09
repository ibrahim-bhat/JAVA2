class Pen {
    String color;
    String type;

    //Methods
    public void info() {
        System.out.println("Pen is " + this.type);
    }

    public void printColor() {
        System.out.println(this.color);

    }
}

class Students {
    String name;
    int age;

    public void info1() {
        System.out.println(this.name + " " + this.age);
    }

    // constuructot
    Students() {
        System.out.println("\nconstructed called");
    }

    //constructor
    Students(String name , int age){
        this.name = name;
        this.age = age;
    }
}

public class Prop {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "ballpoint";

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "fountain";

        p1.printColor();
        p1.info();

        p2.printColor();
        p2.info();

        // for students

        Students s1 = new Students();
        s1.name = "ibrahim";
        s1.age = 20;

        s1.info1();

        // 
        Students s2 = new Students("Khushboo", 19);
        s2.info1();

    //java dont have destructor it have garbage collector        
     
    }
}
