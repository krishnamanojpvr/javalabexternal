
/*7. a. Write a Java Class to implement a method Addition() that returns a new Array where each
array element at the index k corresponds to the sum of elements of the array (src) starting at
index 0 and including element at the index ‘k’. For example, for array [2,3,5], the method will
return array [2,5,10]. For an array of size ‘0’ or a null parameter, the method will throw
exception IllegalArgumentExceptionWith the message “Invalid Argument”.*/
import java.util.Arrays;
import java.util.Scanner;

public class exp7a {
    public static void main(String[] args) {
        System.out.println("Enter Array Size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[];
        try {
            if (n > 0)
                arr = new int[n];
            else
                throw new IllegalArgumentException();
            System.out.println("Enter Array Elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            exp7a rs = new exp7a();
            int resultarr[] = rs.addition(arr);
            System.out.println(Arrays.toString(resultarr));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Argument");
        }
    }

    int[] addition(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] += sum;
            sum = a[i];
        }
        return a;
    }
}
