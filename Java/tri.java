import java.util.Scanner;

public class tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b==c){
            System.out.println(a+"+"+b+"="+c);
        }
        else if(a-b==c){
            System.out.println(a+"-"+b+"="+c);
        }
        else if(a==b+c){
            System.out.println(a+"="+b+"+"+c);
        }
        else if(a==b-c){
            System.out.println(a+"="+b+"-"+c);
        }
        else if(a*c==b){
            System.out.println(a+"="+b+"/"+c);
        }
        else if(a*b==c){
            System.out.println(a+"*"+b+"="+c);
        }
        else if(c*b==a){
            System.out.println(a+"="+b+"*"+c);
        }
    }
}
