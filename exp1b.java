// b. Write a java program to check whether the given number is gapful or not.
// A number is gapful if it is at least 3 digits long and is divisible by the number formed by stringing the 
// first and last numbers together. The smallest number that fits this description is 100. First digit is 1, last 
// digit is 0, forming 10, which is a factor of 100. Therefore, 100 is gapful. Print “Yes” if it is gapful 
// otherwise “No”.
import java.util.*;
public class exp1b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = s.nextInt();
        if (N >= 100) {
            String str = Integer.toString(N);
            String str2 = str.charAt(0) + "" + str.charAt(str.length()-1);
            int num = Integer.parseInt(str2);
            if (N % num == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
