import java.util.Scanner;

public class sumkindofproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        for(int i=0;i<P;i++){
            int K = sc.nextInt();
            int N = sc.nextInt();
            int sumOfInt = N *(N+1)/2;
            int sumOfOdd = N*N;
            int sumOfEven = N*(N+1);
            System.out.println(K+" "+ sumOfInt+" "+sumOfOdd+" "+sumOfEven);
        }
    }
}
