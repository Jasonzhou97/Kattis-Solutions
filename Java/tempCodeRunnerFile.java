import java.util.Scanner;

public class whichisgreater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
        }
        if(a>b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}