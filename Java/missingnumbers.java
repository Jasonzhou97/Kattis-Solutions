import java.util.ArrayList;
import java.util.Scanner;

public class missingnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        int max = arr.get(n-1);
        boolean all = true;
        for(int i=1;i<=max;i++){
            if(!arr.contains(i)){
                System.out.println(i);
                all = false;
            }
        }
        if(all){
            System.out.println("good job");
        }
    }
    
}
