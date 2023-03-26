import java.util.HashSet;
import java.util.Scanner;

public class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            int remainder = num%42;
            if(!set.contains(remainder)){
                set.add(remainder);
            }
        }
        System.out.println(set.size());
    }
    
}
