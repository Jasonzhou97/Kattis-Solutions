import java.util.HashMap;
import java.util.Scanner;

public class haypoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            String skill = sc.next();
            int p = sc.nextInt();

            map.put(skill, p);
        }

        for (int i = 0; i < n; i++) {
            int points = 0;
            String description;
            while (!(description = sc.next()).equals(".")) {
                if (map.containsKey(description)) {
                    points += map.get(description);
                }
            }
            System.out.println(points);
        }
    }
}
