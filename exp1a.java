// a. Given a number, check if the number (N) can be written as the form (k+1)*k. Write a java 
// program to print those numbers in the given range.
import java.util.*;
public class exp1a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = s.nextInt();
        for (int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if (i == (j+1)*j) {
                    System.out.println(i);
                }
            }
        }
        s.close();
    }
}
