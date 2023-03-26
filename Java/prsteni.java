import java.util.Scanner;

public class prsteni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();

        for(int i=0;i<N-1;i++){
            int r = sc.nextInt();
            int common = gcd(R, r);

            int numerator = R/common;
            int denominator = r/common;

            System.out.println(numerator+"/"+denominator);
        }
    }
    static int gcd(int a,int b){
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
