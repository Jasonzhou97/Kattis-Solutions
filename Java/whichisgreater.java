import java.util.Scanner;

public class whichisgreater{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
        }
        if(a>b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}