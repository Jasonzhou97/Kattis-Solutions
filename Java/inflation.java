import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class inflation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
 
        //sort in ascending order
        Collections.sort(arr);
        double f = 1;
        boolean possible = true;
        for(int i=1;i<=n;i++){
            int gas = arr.get(i-1);
            if(gas>i){
                System.out.println("impossible");
                possible = false;
                break;
            }
            else{
                double tf = (double)gas/(double)i;
                if(tf<f){
                    f = tf;
                }
            }
        }
        if(possible){
            System.out.println(f);
        }
    }
}
