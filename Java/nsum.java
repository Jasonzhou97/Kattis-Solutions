import java.util.*;

public class nsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        sc.nextLine();
        for(int i=0;i<N;i++){
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
