import java.util.Scanner;

public class testdrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((b>a&&b>c)||(b<a&&b<c)){
            System.out.println("turned");
        }
        else if(b-a==c-b){
            System.out.println("cruised");
        }
        else if(Math.abs(b-c)>Math.abs(b-a)){
            System.out.println("accelerated");
        }
        else{
            System.out.println("braked");
        }
    }
}
