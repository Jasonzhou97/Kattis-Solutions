import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int num = 1;
        for(int i=1;i<=min;i++){
            if(a%i==0&&b%i==0){
                num = i;
            }
        }
        System.out.println(num);
    }
}
