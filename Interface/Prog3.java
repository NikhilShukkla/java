//Create an Interface 'Animals' with abstract method 'void sound()' and
//default method ‘void walk()’. Implement abstract method in class 'Cat' &
//'Dog'. Now create an object for each of the subclasses and call their
//respective methods and default method too.

interface Animals {
    void sound();
    default void walk() {
        System.out.println("Animal is walking");
    }
}
class Dog implements Animals {
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat implements Animals {
    public void sound() {
        System.out.println("Cat meow");
    }
}

public class Prog3 {
    public static void main(String args[]) {
        Dog d = new Dog();
        Cat c = new Cat();


        d.walk();
        d.sound();

        c.walk();
        c.sound();
    }
}