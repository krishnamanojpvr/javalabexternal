// 6. a. Write a java program that loads names and phone numbers from the text file into Hash Table 
// where data is organized as one line per record and each field in record are separated by a tab(\t). 
// It takes a name or phone number as input and prints the corresponding other value from hash 
// table.
import java.util.*;
import java.io.*;

public class exp6a {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("phonenumber.txt");
        BufferedReader br = new BufferedReader(fr);
        Hashtable<String, String> ht = new Hashtable<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split("\s");
            ht.put(data[0], data[1]);
        }
        System.out.println(ht);
        System.out.print("Enter name or phone number: ");
        String input = sc.nextLine();
        if (ht.containsKey(input)) {
            System.out.println("Name: " + input + "\nPhone Number: " + ht.get(input));
        } else if (ht.containsValue(input)) {
            for (Map.Entry<String, String> entry : ht.entrySet()) {
                if (entry.getValue().equals(input)) {
                    System.out.println("Name: " + entry.getKey() + "\nPhone Number: " + input);
                    break;
                }
            }
        } else {
            System.out.println("No such name or phone number found in the file.");
        }
        sc.close();
        br.close();

    }
}