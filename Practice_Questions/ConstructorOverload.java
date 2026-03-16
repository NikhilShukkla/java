//Define class car with suitable attributes and member function and overload
//constructor for initialization of data members and display all details
class Car {
    int carId;
    String brand;
    double price;

    Car() {
        carId = 0;
        brand = null;
        price = 0.0;
    }

    Car(int c_id, String b, double p) {
        this. carId = c_id;
        this.brand = b;
        this.price = p;
    }

    public void display() {
        System.out.println("Car id is : " + this.carId);
        System.out.println("Brand is : " + this.brand);
        System.out.println("Price is : " + this.price);
    }
}

public class ConstructorOverload {
    public static void main(String args[]) {

        Car c1 = new Car();
        Car c2 = new Car(101, "Toyota", 1500000);

        c1.display();
        c2.display();
    }
}