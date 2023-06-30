import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class register {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0, 2);
        map.put(1, 3);
        map.put(2, 5);
        map.put(3, 7);
        map.put(4, 11);
        map.put(5, 13);
        map.put(6,17);
        map.put(7, 19);

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<8;i++){
            arr.add(sc.nextInt());
        }

        int count = 0;

        while(true){
            int first = arr.get(0);
            first++;
            arr.set(0, first);
            
            int i = 0;
            while(i<arr.size()-1){
                int val = arr.get(i);
                int limit = map.get(i);
                if(val>=limit){
                    val = 0;
                    int next = arr.get(i+1);
                    arr.set(i, val);
                    arr.set(i+1, next+1);
                }
                i++;
            }
            int last = arr.get(7);
            if(last>=19){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
