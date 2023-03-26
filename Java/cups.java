import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set; 
public class cups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        HashMap<Integer,String> map = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<N;i++){
            String color;
            int number;
             String str = sc.nextLine();
             String[] parts = str.split(" ");

             if(parts[0].matches("[a-zA-Z]+")){
                color = parts[0];
                number = Integer.parseInt(parts[1]) * 2;
             }
             else{
                color = parts[1];
                number = Integer.parseInt(parts[0]);
             }
             map.put(number, color);
        }
        Set<Integer> keys = map.keySet(); 
        for(int diameter:keys){
            array.add(diameter);
        }
        Collections.sort(array);
        for(int i=0;i<array.size();i++){
            System.out.println(map.get(array.get(i)));
        }
    }
} 