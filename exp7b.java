/*b. Write a Java Code to implement a multithreaded version of FizzBuzz with four threads.
If the number is divisible by 3, output "fizz".
If the number is divisible by 5, output "buzz".
If the number is divisible by both 3 and 5, output "fizzbuzz".
If the number is not divisible by both 3 and 5 print the number
For instance if n is 15 , we will have the output as “ 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz,buzz, 11, fizz,
13, 14, fizzbuzz “
1. Thread A will call fizz() to check for divisibility of 3 and outputs fizz .
2. Thread B will call buzz() to check for divisibility of 5 and outputs buzz .
3. Thread C will call fizzbuzz() to check for divisibility of 3 and 5 and outputs fizzbuzz .
4. Thread D will call number() which should only output the numbers. */
import java.util.Scanner;

public class exp7b {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                C t1 = new C();
                t1.start();
                t1.join();
            } else if (i % 5 == 0) {
                B t2 = new B();
                t2.start();
                t2.join();
            } else if (i % 3 == 0) {
                A t3 = new A();
                t3.start();
                t3.join();
            } else
                System.out.print(i + ", ");
        }
    }
}

class A extends Thread {
    public void run() {
        System.out.print("fizz, ");
    }
}

class B extends Thread {
    public void run() {
        System.out.print("buzz" + ", ");
    }
}

class C extends Thread {
    public void run() {
        System.out.print("fizzbuzz" + ", ");
    }
}