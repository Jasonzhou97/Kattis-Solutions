import java.util.HashMap;
import java.util.Scanner;

public class oddmanout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            int guests = sc.nextInt();
            for(int j=0;j<guests;j++){
                int guest = sc.nextInt();
                if(!map.containsKey(guest)){
                    map.put(guest, 1);
                }
                else{
                    map.put(guest, 2);
                }
            }

            for(int num:map.keySet()){
                int k = map.get(num);
                if(k==1){
                    System.out.println("Case #"+(i+1)+": "+num);

                }

            }

        }
    }
}
