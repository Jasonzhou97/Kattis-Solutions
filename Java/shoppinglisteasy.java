import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class shoppinglisteasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                String food = sc.next();
                if(map.containsKey(food)){
                    int freq = map.get(food);
                    freq++;
                    map.put(food, freq);
                }
                else{
                    map.put(food, 1);
                }
            }
        }

        ArrayList<String> arr = new ArrayList<>();

        for(String food:map.keySet()){
            if(map.get(food)==n){
                arr.add(food);
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for(String food:arr){
            System.out.println(food);
        }
    }
}
