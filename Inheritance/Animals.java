
class Animal {
    String name;
    int age;

    
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}


class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age); // Call Animal constructor
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof Woof!");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}


class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows: Meow Meow!");
    }

    void scratch() {
        System.out.println(name + " is scratching the sofa!");
    }
}


class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " chirps: Tweet Tweet!");
    }

    void fly() {
        System.out.println(name + " is flying in the sky!");
    }
}


public class Animals {
    public static void main(String[] args) {
        
        Animal a1 = new Dog("Tommy", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);

        
        a1.makeSound(); 
        a2.makeSound(); 
        a3.makeSound(); 

        System.out.println("----- Extra Behaviors -----");

        if (a1 instanceof Dog) {
            Dog d = (Dog) a1;
            d.fetch();
        }

        if (a2 instanceof Cat) {
            Cat c = (Cat) a2;
            c.scratch();
        }

        if (a3 instanceof Bird) {
            Bird b = (Bird) a3;
            b.fly();
        }
    }
}
