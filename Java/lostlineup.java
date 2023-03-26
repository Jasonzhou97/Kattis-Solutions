import java.util.*;


public class lostlineup {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();

         HashMap<Integer,Integer> map = new HashMap<>();

         for(int i=2;i<N+1;i++){
            int num = sc.nextInt();
            map.put(num, i);
         }

         //sort dictionary based on key values
         Map<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(map);
         System.out.print(1+" ");
         for(int num:sortedMap.keySet()){
            int value = sortedMap.get(num);
            System.out.print(value+" ");
         }
    }
}
