//Write a code to display string in reverse order of words.
import java.util.*;
public class ReverseWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentece : ");
        String str = sc.nextLine();

        String word[] = str.split(" ");
        for(int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i] + " ");
        }
    }
}
