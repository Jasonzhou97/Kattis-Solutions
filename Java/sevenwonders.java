import java.util.*;

public class sevenwonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<Character, Integer>() {{
            put('T', 0);
            put('G', 0);
            put('C', 0);
        }};
        char[] arr = sc.next().toCharArray();
        for(int i=0;i<arr.length;i++){
            char card = arr[i];
            int count = map.get(card);
            map.put(card,count+1);
        }
        int T = map.get('T');
        int C = map.get('C');
        int G = map.get('G');
        int sum = T*T + C*C + G*G;
        int min = Math.min(T,C);
        min = Math.min(min,G);
        sum+=min*7;
        System.out.println(sum);
    }
}
