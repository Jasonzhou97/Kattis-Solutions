import java.util.Scanner;

public class tarifa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int data = 0;
        for(int i=0;i<N;i++){
            int usage = sc.nextInt();
            data+=(X-usage);
        }
        System.out.println(data+X);
    }    
}
