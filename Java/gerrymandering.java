import java.util.HashSet;
import java.util.Scanner;


public class freefood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<N;i++){
            int s = sc.nextInt();
            int l = sc.nextInt();
            for(int j=s;j<=l;j++){
                if(!set.contains(j)){
                    set.add(j);
                }
            }
        }
        System.out.println(set.size());
    }
}
