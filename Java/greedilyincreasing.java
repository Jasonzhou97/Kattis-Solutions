import java.util.ArrayList;
import java.util.Scanner;

public class greedilyincreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        int prev = sc.nextInt();
        arr.add(prev);

        for(int i=1;i<N;i++){
            int cur = sc.nextInt();
            if(cur>prev){
                arr.add(cur);
                prev = cur;
            }
        }
        System.out.println(arr.size());
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
