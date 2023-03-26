import java.util.*;
public class easiest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int j = sc.nextInt();
            int i = 11;
            if(j==0){
                break;
            }
            int sumOfDigits = sumOf(j);
            while(sumOfDigits!=sumOf(j*i)){
                i++;
            }
            System.out.println(i);
        }
    }
    public static int sumOf(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
