import java.util.Scanner;

public class server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();

        int total = 0;
        boolean a = false;
        for(int i=0;i<n;i++){
            int mins = sc.nextInt();
            if(total+mins>T){
                System.out.println(i);
                a = true;
                break;
            }
            else{
                total+=mins;
            }
        }
        if(!a){
            System.out.println(n);
        }

    }
}
