class Shape {
    public void display() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape {
    public void area() {
        System.out.println("Area of circle is : 22.7 * radius square");
    }
}
class Rectangle extends Shape {
    public void area() {
        System.out.println("Area of rectangle is : length * breadth");
    }
}

class HierarchicalInh {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();

        c1.display();
        c1.area();

        r1.display();
        r1.area();
    }
}
