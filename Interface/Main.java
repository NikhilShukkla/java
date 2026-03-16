interface Shape {
    void area();
}
class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        double result = 3.14 * r * r;
        System.out.println("Area of circle is : " + result);
    }
}
class Rectangle implements Shape {
    int length, width;

    Rectangle(int l, int w) {
        this.length = l;
        this. width = w;
    }

    public void area() {
        int result = length * width;
        System.out.println("Area of rectangle is : " + result);
    }
}

public class Main {
    public static void main(String args[]) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.area();
        r.area();
    }
}