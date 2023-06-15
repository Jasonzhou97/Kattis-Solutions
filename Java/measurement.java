import java.util.*;

public class measurement {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("in", 1000);
        map.put("inch", 1000);
        map.put("ft", 1000 * 12);
        map.put("foot", 1000 * 12);
        map.put("yd", 3 * map.get("ft"));
        map.put("yard", 3 * map.get("ft"));
        map.put("ch", 22 * map.get("yd"));
        map.put("chain", 22 * map.get("yd"));
        map.put("fur", 10 * map.get("ch"));
        map.put("furlong", 10 * map.get("ch"));
        map.put("mi", 8 * map.get("fur"));
        map.put("mile", 8 * map.get("fur"));
        map.put("lea", 3 * map.get("mi"));
        map.put("league", 3 * map.get("mi"));

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] line = input.split(" ");
        try {
            double num = Double.parseDouble(line[0]);
            String og = line[1];
            String target = line[3];

            if (!map.containsKey(og) || !map.containsKey(target)) {
                throw new IllegalArgumentException();
            }

            double result = (num * map.get(og)) / map.get(target);
            System.out.println(result);
        } catch (NumberFormatException e) {
        }
    }
}
