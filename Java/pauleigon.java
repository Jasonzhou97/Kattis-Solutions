import java.util.Scanner;

public class pauleigon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int P = sc.nextInt();
         int Q = sc.nextInt();
         if(((P+Q)/N)%2==0){
            System.out.println("paul");
         }
         else{
            System.out.println("opponent");
         }
    }
}
