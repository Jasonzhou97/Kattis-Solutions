import java.util.Scanner;

public class zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();

        int target = sc.nextInt();
    
        for(int i=a;i<=b;i++){
            if(sum(i)==target){
                System.out.println(i);
                break;
            }
        }
        for(int i=b;i>=a;i--){
            if(sum(i)==target){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
    public static int sum(int num){
        int SUM = 0;
        while(num>0){
            int remainder = num%10;
            SUM += remainder;
            num /= 10;
        }
        return SUM;
    }

}

