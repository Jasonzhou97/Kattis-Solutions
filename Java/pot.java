import java.util.*;

public class pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            int[] answer = separate(num);
            num = answer[0];
            int power = answer[1];
            sum += Math.pow(num, power);
        }
        System.out.println(sum);
    }

    public static int[] separate(int num){
        int lastDigit = num%10;
        num /= 10;
        int[] result = {num,lastDigit};
        return result;
    }
}
