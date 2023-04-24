import java.util.Scanner;

public class owlandfox{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int num = 0;
            int Sum = sum(N)-1;
            for(int j=N-1;j>=0;j--){
                if(sum(j)==Sum){
                    num = j;
                    break;
                }
            }
            System.out.println(num);
        }
    }
    static int sum(int n){
        int result = 0;
        while(n>0){
            result+=n%10;
            n/=10;
        }
        return result;
    }
}
