import java.util.HashMap;
import java.util.Scanner;

public class hothike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();

        int min = 99;
        for(int i=0;i<n-2;i++){
            int first = arr[i];
            int last = arr[i+2];
            int max = Math.max(first,last);
            if(max<min){
                map.clear();
                min = max;
                map.put(i+1, max);
            }
        }
        for(int d:map.keySet()){
            System.out.print(d+" "+map.get(d));
        }
    }
}
