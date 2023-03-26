import java.util.*;

public class lastfactorialdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int result = factorial(sc.nextInt());
            System.out.println(result%10);
        }
    }
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}
