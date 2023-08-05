import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        for(int i=0;i<M;i++){
            if(N<=0){
                break;
            }
            int num = sc.nextInt();
            if(N>=num){
                N-=num;
                count++;
            }
            else{
                break;
            }
            
        }
        System.out.println(M-count);


    }
}