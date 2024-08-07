// 4b. Given two strings s1 and s2, your task is to merge those strings to form a new merged string. A merge 
// operation on two strings is described as follows:
// Append alternating characters from s1 and s2, respectively, to mergedString. Once all of the characters 
// in one of the strings have been merged, append the remaining characters in the other string to 
// mergedString.
import java.util.Scanner;
public class exp4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        String s3 = "";
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            s3 = s3 + s1.charAt(i);
            s3 = s3 + s2.charAt(j);
            i++;
            j++;
        }
        while(i<s1.length()){
            s3 = s3 + s1.charAt(i);
            i++;
        }
        while(j<s2.length()){
            s3 = s3 + s2.charAt(j);
            j++;
        }
        System.out.println("The merged string is: "+s3);
        sc.close();
    }
}
