//Design an interface AdvancedArithmetic which contains a method
//int divisor_sum(int n). You need to write a class called
//MyCalculator which implements the interface. divisor_sum(int n) function
//takes an integer as input and return the sum of all its divisors. Divisors of 6
//are 1, 2, 3 and 6, so divisor_sum should return 12. (0<n<100)

import java.util.*;
interface AdvacedArithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements AdvacedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum = sum +i;
            }
        }
        return sum;
    }
}
public class Prog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyCalculator obj = new MyCalculator();
        System.out.println("sum : " + obj.divisor_sum(n));
    }
}

