import java.util.Scanner;

public class volim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int limit = 210;
        int count = K;
        int time = 0;
        for(int i=0;i<N;i++){
            int timePassed = sc.nextInt();
            time+=timePassed;
            if(time>=limit){
                System.out.println(count);
                break;
            }
            else{
                String ans = sc.next();
                if(ans.equals("T")){
                    count++;
                    if(count==9){
                        count = 1;
                    }
                }
            }
        }
    }
}
