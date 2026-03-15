//Define a class book with data members book_id, book_name, book_price and author and define the functions to initilize the attributes and print the book details
class book {
    int book_id;
    String book_name;
    double book_price;
    String book_author;

    public void setData(int b_id, String b_name, double b_price, String b_author) {
        this.book_id = b_id;
        this.book_name = b_name;
        this.book_price = b_price;
        this.book_author = b_author;
    }

    public void display() {
        System.out.println("Book is is:" + book_id);
        System.out.println("Book name is :" + book_name);
        System.out.println("Book price is :" + book_price);
        System.out.println("Book author is :" + book_author);
    }
}

public class Library {
    public static void main(String args[]) {
        book b1 = new book();
        b1.setData(101, "java", 405.0, "Gasling");
        b1.display();
    }
}