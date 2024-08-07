// 4. a. Given two strings text1 and text2, return the length of their longest common subsequence. A 
// subsequence of a string is a new string generated from the original string with some characters 
// (can be none) deleted without changing the relative order of the remaining characters. (eg, "ace" 
// is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a 
// subsequence that is common to both strings. If there is no common subsequence, return 0.

import java.util.Scanner;

public class exp4a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        int c=0;
        int m=0;
        for(int i=0;i<s1.length();i++){
            for(int j=m;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    c=c+1;
                    m=j+1;
                    break;
                }
            }
        }
        System.out.println("The length of the longest common subsequence is: "+c);
        sc.close();

    }
}