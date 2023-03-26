import java.util.*;

public class nastyhacks  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            if((e-r)>c){
                System.out.println("advertise");
            }
            else if ((e-r)<c){
                System.out.println("do not advertise");
            }
            else{
                System.out.println("does not matter");
            }
        }
    }
}
