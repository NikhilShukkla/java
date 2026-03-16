class Book {
    int book_id;
    double book_price;
    String book_name;
    String book_author;

    Book() {
        book_id = 0;
        book_price = 0;
        book_name = null;
        book_author = null;
    }

    Book(int b_id, double b_price, String b_name, String b_author) {
        this.book_id = b_id;
        this.book_price = b_price;
        this.book_name = b_name;
        this.book_author = b_author;
    }

    public void display() {
        System.out.println("Book id is : " + this.book_id);
        System.out.println("Book price is : " + this.book_price);
        System.out.println("Book name is : " + this.book_name);
        System.out.println("Book author is : " + this.book_author);
    }
}

class Library {
    public static void main(String args[]) {
        Book b1 = new Book();
        Book b2 = new Book(101, 145.00, "Java", "Gasling");
        b1.display();
        b2.display();
    }
}