//define a class student with data members roll number, name, class, and member function print student
class Std{
    int roll_number;
    String name;
    String klass;

    public void set_data() {
        roll_number = 16;
        name = "Aman";
        klass = "mca";
    }

    public void display() {
        System.out.println("Roll number is :" + roll_number);
        System.out.println("Name:" + name);
        System.out.println("Klass:" + klass);
    }
}

public class student{
    public static void main(String args[]) {
        Std s1 = new Std();
        s1.set_data();
        s1.display();
    }
}
