import java.util.*;

public class commercials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int initial = sc.nextInt()-P;
        int maxN = initial; int maxT = initial;
        for(int i=0;i<N-1;i++){
            int p =sc.nextInt()-P;
            if(maxT<0){
                maxT = p;
            }
            else{
                maxT += p;
            }
            if(maxT>=maxN){
                maxN = maxT;
            }
        }
        System.out.println(maxN);
    }
}
