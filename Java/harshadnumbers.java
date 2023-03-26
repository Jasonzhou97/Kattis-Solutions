import java.util.*;

public class harshadnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(!harshad(n)){
            n++;
        }
        System.out.println(n);
    }

    public static boolean harshad(int num){
        int sum = 0;
        int original = num;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        if(original%sum==0){
            return true;
        }
        return false;
    }

}
