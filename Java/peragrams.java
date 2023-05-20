import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class peragrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        for (int foo : map.values()) {
            if (foo % 2 != 0) {
                count++;
            }
        }

        System.out.println(Math.max(count - 1, 0));
    }
}