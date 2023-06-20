import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class fastfood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        
        for(int i=0;i<cases;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int money = 0;

            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

            
            for(int j=0;j<n;j++){
                int z = sc.nextInt();
                ArrayList<Integer> arr = new ArrayList<>();
                for(int k=0;k<z;k++){
                    int num = sc.nextInt();
                    arr.add(num);
                }
                int prize = sc.nextInt();
                map.put(prize, arr);
            }
            ArrayList<Integer> array = new ArrayList<>();
            for(int k=0;k<m;k++){
                int p = sc.nextInt();
                array.add(p);
            }
            for(int key:map.keySet()){
                ArrayList<Integer> a = map.get(key);
                while(verify(a, array)){
                    array = edit(a, array);
                    money += key;
                }
            }
            System.out.println(money);
        }
    }

    static boolean verify(ArrayList<Integer> prizes,ArrayList<Integer> tickets){
        for(int p:prizes){
            if(tickets.get(p-1)==0){
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> edit(ArrayList<Integer> prizes,ArrayList<Integer> tickets){
        ArrayList<Integer> temp = new ArrayList<>(tickets);

        for(int p:prizes){
            if(tickets.get(p-1)>0){
                int n = tickets.get(p-1);
                tickets.set(p-1, n-1);
            }
            else{
                return temp;
            }
        }
        return tickets;
    }
}
