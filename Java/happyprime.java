import java.util.HashSet;
import java.util.Scanner;

public class happyprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        for(int i=0;i<P;i++){
            int K = sc.nextInt();
            int m = sc.nextInt();

            if(!isPrime(m) || !isHappy(m)){
                System.out.println(K+" "+m+" NO");
            }
            else{
                System.out.println(K+" "+m+" YES");
            }
            
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        
        while(true){
            int sum = 0;
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            while(n>0){
                int digit = n%10;
                sum += digit*digit ;
                n /= 10;
            }
            n = sum;
            if(n==1){
                return true;
            }
        }
    }
}
