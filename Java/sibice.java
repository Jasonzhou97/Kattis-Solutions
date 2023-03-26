import java.util.*;

public class sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        double hypo = Math.sqrt((W*W)+(H*H));

        for(int i=0;i<N;i++){
            int match = sc.nextInt();
            if((double)match>hypo){
                System.out.println("NE");
            }
            else{
                System.out.println("DA");
            }
        }
    }
}
