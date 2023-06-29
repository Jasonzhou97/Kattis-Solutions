import java.util.HashSet;
import java.util.Scanner;

public class princesspeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<Y;i++){
            set.add(sc.nextInt());
        }

        for(int i=0;i<N;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
        System.out.println("Mario got "+set.size()+" of the dangerous obstacles.");
    }
}
