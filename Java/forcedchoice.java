import java.util.*;

public class forcedchoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int S = sc.nextInt();
        for(int i=0;i<S;i++){
            int m = sc.nextInt();
            boolean hasCard = false;
            for(int j=0;j<m;j++){
                int card = sc.nextInt();
                if(card==P){
                    System.out.println("KEEP");
                    hasCard = true;
                    break;
                }
                
            }
            if(!hasCard){
                System.out.println("REMOVE");
            }
            sc.nextLine();
        }
    }
}
