import java.util.*;

public class taisformula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double total = 0;
        double t0 = sc.nextDouble();
        double v0 = sc.nextDouble();

        for(int i=0;i<N-1;i++){
            double t1 = sc.nextDouble();
            double v1 = sc.nextDouble();

            total += (v1 + v0) / 2 * ((t1 - t0) / 1000);
            t0 = t1;
            v0 = v1;
        }
        
        System.out.println(total);
        
    }
    
}
