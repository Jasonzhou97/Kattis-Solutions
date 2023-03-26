import java.util.Scanner;

public class quickestimate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            String numString = sc.next();
            System.out.println(numString.length());
        }
    }

}
