// 3. a. Given an array arr[] of N integers, the task is to find the maximum difference between any 
// two elements of the array.
import java.util.*;
public class exp3a{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The maximum difference between any two elements of the array is: "+(max-min));
        s.close();
    }
}