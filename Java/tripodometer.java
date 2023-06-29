import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class tripodometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            int sum = 0;
            for(int j=0;j<N;j++){
                if(i==j){
                    continue;
                }
                sum+=arr[j];
            }
            set.add(sum);
            
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(set.size());
        for(int n:list){
            System.out.print(n+" ");
        }
    }
}
