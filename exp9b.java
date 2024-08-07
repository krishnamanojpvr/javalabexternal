
/*9b. When working with HashMaps, sometimes cases arise where we wish to determine if two
HashMaps have any key/value pairs in common. For example, we might have the following two
Hashmaps (named hashmap1 and hashmap2, respectively) that map from String to String (i.e.,
their type is HashMap) and we want to count how many key/value pairs they have in
common.
In the example above, these two HashMaps have two key/value pairs in common, namely:
"Mary"/"Ecstatic" and "Bob"/"Happy". Note that although the key "Felix" is in both HashMaps,
the associated value with this key is different in the two maps (hence this does not count as a
key/value pair that is common to both HashMaps). Similarly, just having the same value without
the same key (such as the value "Fine" which is mapped to by different keys in the two different
HashMaps) would also not count as a common key/value pair between the two HashMaps.*/
import java.util.*;

public class exp9b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> mapOne = new HashMap<String, String>();
        HashMap<String, String> mapTwo = new HashMap<String, String>();
        System.out.print("Enter how many pairs in HashMap 1 : ");
        int mapOneSize = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your " + mapOneSize + " pair of String ");
        for (int i = 0; i < mapOneSize; i++) {
            System.out.println("Enter Pair " + (i + 1));
            String pairs[] = sc.nextLine().split(" ");
            mapOne.put(pairs[0], pairs[1]);
        }
        System.out.print("Enter how many pairs in HashMap 2 : ");
        int mapTwoSize = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your " + mapTwoSize + " pair of String ");
        for (int i = 0; i < mapTwoSize; i++) {
            System.out.println("Enter Pair " + (i + 1));
            String pairs[] = sc.nextLine().split(" ");
            mapTwo.put(pairs[0], pairs[1]);
        }
        int count = 0;
        for (Map.Entry<String, String> m1 : mapOne.entrySet()) {
            for (Map.Entry<String, String> m2 : mapTwo.entrySet()) {
                if (m1.getKey().equals(m2.getKey()) && m1.getValue().equals(m2.getValue())) {
                    count++;
                }
            }
        }
        System.out.println("The number of key/value pairs are : " + count);
        sc.close();
    }
}