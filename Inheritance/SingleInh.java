class Animal {
    String color;

    public void eats() {
        System.out.println("Animals are eating");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class SingleInh{
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.color = "Brown";
        d1.bark();
    }
}