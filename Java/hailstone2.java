import java.util.Scanner;

public class hailstone2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        int count = 1;
        while(n!=1){
            if(n%2==0){
                n/=2;
                count++;
            }
            else{
                n = 3*n + 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
