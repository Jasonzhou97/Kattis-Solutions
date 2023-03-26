import java.util.*;

public class reversebinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initial = sc.nextInt();
        if(initial==0){
            System.out.println(0);
        }
        int binaryForm =Integer.parseInt(Integer.toBinaryString(initial));
        int reversed = reverse(binaryForm);
        int answer = convertDeci(reversed);

        System.out.println(answer);
    }

    public static int reverse(int num){
        int result = 0;
        while(num>0){
                int remainder = num%10;
                result = result*10+remainder;
                num/=10;
        }
        return result;
    }

    public static int convertDeci(int num){
        int result = 0;
        int count = 0;
        while(num>0){
            int remainder = num%10;
            result += remainder*(Math.pow(2,count));
            count+=1;
            num/=10;
        }

        return result;
    }
}
