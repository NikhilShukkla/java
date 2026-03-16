class Book {
    int id;
    String name;

    Book(int i, String n) {
        this.id = i;
        this.name = n;
    }

    Book(Book b) {
        this.id = b.id;
        this.name = b.name;
    }

    public void display() {
        System.out.println("Book id is : " + this.id);
        System.out.println("Book name is : " + this.name);
    }
}

class Test {
    public static void main(String args[]) {
        Book b1 = new Book(101, "Java");
        Book b2 = new Book(b1);
        b2.display();
    }
}
