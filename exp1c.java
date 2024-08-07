// 1c. Cricketer's Pension Continuing our journey in mastering the conditional statements & our interest with 
// cricket.
// Let us help the Indian cricket's governing body (BCCI) to automate its plan of allotting pensions to 
// former players. 
// The rules are given below: 
// If a player has played more than 10 test matches and 100 ODI's he receives Rs.50,000.
// If a player has played more than 10 test matches he receives Rs.25,000.
// If a player has played more than 100 ODI's he receives Rs.15,000.
// If a player has played for India he receives Rs.10,000.
// The amount is incremented by 1/4th for every 'man of the match' award.
// If a player has not played for India but played IPL he receives an amount of Rs.8,000. 
// If a player has not played for India nor IPL he receives an amount of Rs.7,000.
import java.util.*;
public class exp1c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Has he played for India? (y/n): ");
        char c1 = s.next().charAt(0);
        System.out.println("Has he played IPL? (y/n): ");
        char c2 = s.next().charAt(0);
        float amount = 0;
        if(c1=='y') {
            System.out.println("Enter the number of test matches played: ");
            int test = s.nextInt();
            System.out.println("Enter the number of ODI's played: ");
            int odi = s.nextInt();
            System.out.println("Enter the number of Man of the Matches: ");
            int mom = s.nextInt();
            if(test > 10 && odi > 100) {
                amount += 50000;
            } else if(test > 10) {
                amount += 25000;
            } else if(odi > 100) {
                amount += 15000;
            } else {
                amount += 10000;
            }
            amount += (mom * 0.25 * amount);
            System.out.println("Amount: " + amount);
            System.exit(100);
        }
        if(c2=='y') {
            System.out.println("Enter the number of man of the matches: ");
            int mom = s.nextInt();
            amount += 8000;
            amount += (mom * 0.25 * amount);
            System.out.println("Amount: " + amount);
            System.exit(100);
        } else {
            amount += 7000;
            System.out.println("Amount: " + amount);
            System.exit(100);
        }
        s.close();
    }
}
