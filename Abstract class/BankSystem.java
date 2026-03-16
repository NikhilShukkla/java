abstract class Bank {
    abstract void calculateInterest();
    public void display() {
        System.out.println("Welcome to the Bank");
    }
}

class SBI extends Bank {
    void calculateInterest() {
        System.out.println("SBI interest Rate is 6%");
    }
}

class HDFC extends Bank {
    void calculateInterest() {
        System.out.println("HDFC interest Rate is 7%");
    }
}

public class BankSystem {
    public static void main(String args[]) {
        SBI s = new SBI();
        HDFC h = new HDFC();

        s.display();
        s.calculateInterest();

        h.display();
        h.calculateInterest();
    }
}
