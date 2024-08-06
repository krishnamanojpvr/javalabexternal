
/*9. a. Write a java Program to write a method fCount which takes a string as a parameter. The
Method fCount should return the Map which has the frequency count of the given word. For
example if the string passed is “hello” the map should return {h-1,e-1,l-2,o-1}. The order of the
characters should be same as in the string.*/
import java.util.*;

public class exp9a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        result = fCount(str);
        System.out.println(result);
    }

    public static Map<Character, Integer> fCount(String str) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            int c = map.getOrDefault(str.charAt(i), 0) + 1;
            map.put(str.charAt(i), c);
        }
        return map;
    }
}