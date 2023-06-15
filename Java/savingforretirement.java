import java.util.Scanner;

public class savingforretirement  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int br = sc.nextInt();
        int bs = sc.nextInt();

        int a = sc.nextInt();
        int as = sc.nextInt();
        
        int money = (br-b)*bs;
        int count = 0;
        while(true){
            if(count>money){
                System.out.println(a);
                break;
            }
            count+=as;
            a++;
        }
    }
}
