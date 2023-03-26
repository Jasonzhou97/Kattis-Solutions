import java.util.Scanner;

public class qaly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float QALY = 0;
        for(int i=0;i<N;i++){
            sc.nextLine();
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            QALY += a*b;
        }
        System.out.println(QALY);
    }
}