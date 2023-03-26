import java.util.Scanner;

public class skocimis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((B-A)>(C-B)){
            System.out.println(B-A-1);
        }
        else{
            System.out.println(C-B-1);
        }
    }
    
}
