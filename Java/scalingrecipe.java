import java.util.*;
public class scalingrecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double factor = (double)y/(double)x;
        for(int i=0;i<n;i++){
            int N = sc.nextInt();
            double scaled = N*factor;
            int result = (int)Math.round(scaled);
            System.out.println(result);
        }
    }   
}

