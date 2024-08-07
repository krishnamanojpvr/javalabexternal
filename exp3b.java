// 3b. Write a Java program to fill the below pattern into a square matrix:
// The matrix has to be filled with numbers starting from 1. It has to start fill first row last column, last row 
// (reverse), first column (reverse) and so on. Please refer the following example 
// input = 5
// output =
// 1  2  3  4  5 
// 16 17 18 19 6 
// 15 24 25 20 7 
// 14 23 22 21 8 
// 13 12 11 10 9
// Input
// 3
// 2 4 5 3 6 8 1 9 7
// Sample Output:
// 2 4 5
// 9 7 3
// 1 8 6

import java.util.*;

public class exp3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        int[][] a = new int[n][n];
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j++) {
                a[rowBegin][j] = sc.nextInt();
            }
            rowBegin++;
            
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j++) {
                a[j][colEnd] = sc.nextInt();
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j--) {
                    a[rowEnd][j] = sc.nextInt();
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                // Traverse Up
                for (int j = rowEnd; j >= rowBegin; j--) {
                    a[j][colBegin] = sc.nextInt();
                }
            }
            colBegin++;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
