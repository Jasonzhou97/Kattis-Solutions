import java.util.*;

public class jumbojavelin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            sum+=sc.nextInt();
            sc.nextLine();
        }
        System.out.println(sum-(N-1));
    }
}
