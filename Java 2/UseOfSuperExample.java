class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call parent class constructor
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void printName() {
        System.out.println("Dog's name: " + name); // Accessing subclass variable
        System.out.println("Animal's name: " + super.name); // Accessing parent class variable
    }
}